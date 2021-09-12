def regrevaluate( t, predict, criterion ):
  n=len(t)
  value=0
  if(criterion=='mse'):
    for i in range(n):
      value+=(t[i]-predict[i])**2#np.mean((t - predict)**2)
    #end for
    value=(1/float(n))*value
    return value
  if(criterion=='mae'):
    for k in range(n):
      value+=abs(t[k]-predict[k])#np.mean((t - predict)**2)
    #end for
    value=(1/float(n))*value
    return value
#https://archive.ics.uci.edu/ml/machine-learning-databases/housing/
#diavazoyme apo to arxeio iris.data kai ta vazoume se ena object d

from pandas import read_csv
d=read_csv('https://archive.ics.uci.edu/ml/machine-learning-databases/housing/housing.data',header=None,sep='\s+').values
import numpy as np
#Print a float array in normal form, not exponential form / scientific notation
np.set_printoptions(suppress=True)
#print(d)
#εμφανιση προτυπων και χαρακτηριστικων
NumberOfPatterns=d.shape[0]
NumberOfAttributes=d.shape[1]
print "Προτυπα :",NumberOfPatterns,"Χαρακτηριστηκα:",NumberOfAttributes
#αρχικοποιηση πινακα  προτυπων
x=np.zeros((NumberOfPatterns,NumberOfAttributes-1))
#αρχικοποιηση του διανυσματος στοχων
t=np.zeros((NumberOfPatterns,1))
#γεμιζουμε τους πινακες χ,τ
x=d[:,[0,1,2,3,4,5,6,7,8,9,10,11,12]]
t=d[:,[13]]

from sklearn.model_selection import train_test_split
from sklearn.svm import SVR
Ce=[1,10,100,1000]
Gamma=[0.0001,0.001,0.01,0.1]
mse=0
mae=0
mseMin=1000
maeMin=1000
listaMAE=np.zeros((1,2))
listaMSE=np.zeros((1,2))
counter=0
mo=np.zeros((2,16))
for g in range(4):
  for z in range(4):
    mse=0
    mae=0
    clf = SVR(gamma=Gamma[g], C=Ce[z], kernel='rbf')
    for i in range(1, 10):
      X_train, X_test, T_train, T_test = train_test_split(x, t, test_size=0.1)
      clf.fit(X_train, T_train)
      PredictTest=clf.predict(X_test)
      mse+=regrevaluate( T_test, PredictTest, 'mse' )
      mae+=regrevaluate( T_test, PredictTest, 'mae' )
    #end for
    mseMO=mse/9
    maeMO=mae/9
    mo[0][counter]=mseMO
    mo[1][counter]=maeMO
    counter+=1
    
    #gia thn euresh toy min mse kai mae
    #print g,z
    if(mseMO<mseMin):
      mseMin=mseMO
      #print "MIN:",mseMin
      #print "C: ",z," Gamma: ",g
      listaMSE[0][0]=g #Gamma
      listaMSE[0][1]=z #C
    
    if(maeMO<maeMin):
      maeMin=maeMO
      #print "MIN",maeMin
      #print "C",z," Gamma: ",g
      listaMAE[0][0]=g #Gamma
      listaMAE[0][1]=z #C
  #end for C
#end for Gamma
print "MSE Min Values: Gamma",Gamma[int(listaMSE[0][0])]," C: ",Ce[int(listaMSE[0][1])]," Values: ",mseMin
print "MAE Min Values: Gamma",Gamma[int(listaMAE[0][0])]," C: ",Ce[int(listaMAE[0][1])]," Values: ",maeMin


#ektelesi fold 1 me veltistes times
X_train1, X_test1, T_train1, T_test1 = train_test_split(x, t, test_size=0.1)
clf = SVR(gamma=Gamma[int(listaMSE[0][0])], C=Ce[int(listaMSE[0][1])], kernel='rbf')
clf.fit(X_train1, T_train1)
PredictBest=clf.predict(X_test1)

import matplotlib.pyplot as plt
plt.figure(1)
plt.title('MSE Test-Predict Graph')
   
plt.plot(T_test1,'bs')
plt.plot(PredictBest,'r.')
plt.show()

#MLP REGRESSOR
from sklearn.neural_network import MLPRegressor
N=[5,10,20,30,40,50]
mseEvalMLP=0
maeEvalMLP=0
mseMinMLP=1000
maeMinMLP=1000
counter2=0
listNmin=np.zeros((2,1))
moMLP=np.zeros((2,len(N)))

for n in range(len(N)):
  mlp=MLPRegressor(hidden_layer_sizes=(N[n]))
  maeEvalMLP=0
  mseEvalMLP=0
  for i in range(1,10):
    X_train2, X_test2, T_train2, T_test2 = train_test_split(x, t, test_size=0.1)
    fitness=mlp.fit(X_train2,T_train2)
    prediMlp=fitness.predict(X_test2)
    mseEvalMLP+=regrevaluate( T_test2, prediMlp, 'mse' )
    maeEvalMLP+=regrevaluate( T_test2, prediMlp, 'mae' )
  #end for
  #ευρεση μεσων ορων για mse mae
  mseMlpMO=mseEvalMLP/9
  maeMlpMO=maeEvalMLP/9
  moMLP[0][counter2]=mseMlpMO
  moMLP[1][counter2]=maeMlpMO
  counter2+=1
  #gia thn euresh toy min mse kai mae
  if(mseMlpMO<mseMinMLP):
    mseMinMLP=mseMlpMO
    #print "MIN:",mseMinMLP
    #print "N: ",n
    listNmin[0][0]=n #n
    
    
  if(maeMlpMO<maeMinMLP):
    maeMinMLP=maeMlpMO
    #print "MIN",maeMinMLP
    # print "N",n
    listNmin[1][0]=n #n
    
#end for n
print "MLP-MSE Min Values: N:",N[int(listNmin[0][0])]," Values: ",mseMinMLP
print "MLP-MAE Min Values: N:",N[int(listNmin[1][0])]," Values: ",maeMinMLP
#τρεχουμε 3ανα το πρωτο fold με τα μικροτερα mse mae  
X_train3, X_test3, T_train3, T_test3 = train_test_split(x, t, test_size=0.1)
mlp2=MLPRegressor(hidden_layer_sizes=(N[int(listNmin[0][0])]))
fitness2=mlp2.fit(X_train3,T_train3)
prediMlp2=fitness2.predict(X_test3)

plt.figure(2)
plt.title('MSE MLP Test-Predict Graph')
plt.plot(T_test3,'bs')
plt.plot(prediMlp2,'r.')
plt.show()