# -*- coding: utf-8 -*-
"""
Created on Fri Mar 15 20:31:47 2019

@author: Errikos
"""

import numpy as np
import matplotlib.pyplot as plt
from pandas import read_csv
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.model_selection import KFold 

def evaluate(t, predict,criterion):
  tn=np.empty([],dtype=float)
  fn=np.empty([],dtype=float)
  tp=np.empty([],dtype=float)
  fp=np.empty([],dtype=float)
  
  for i in range(0,15):
      if((t[i]==0 and predict[i]==0) ):
        tn +=1
   
  for i in range(0,15):
      if((t[i]==1 and predict[i]==0) ):
        fn +=1
 
  for i in range(0,15):
      if((t[i]==1 and predict[i]==1) ):
        tp +=1
  
  for i in range(0,15):
      if((t[i]==0 and predict[i]==1) ):
        fp +=1
  precisionP=0
  recallP=0
  #fmeasure=0
  if(criterion =="accuracy"):   
    accuracy=(tp+tn)/(tp+tn+fp+fn)
    print "Accuracy: ",accuracy
 
  if(criterion =="precision"):
    precision=tp/(tp+fp)
    precisionP=precision
    print "Precision: ",precision
  
  if(criterion =="recall"):
    recall=tp/(tp+fn)
    recallP=recall
    print "Recall: ",recall

  if(criterion =="fmeasure"):
    fmeasure=(precisionP*recallP)/((precisionP+recallP)/2)
    print "Fmeasure: ",fmeasure
  
  t=np.transpose(t) 
  print "T: ",t
  print "Pr: ",predict
  print "TN: ",tn 
  print "FN: ",fn
  print "TP: ",tp
  print "FP: ",fp 
#diavazoyme apo to arxeio iris.data kai ta vazoume se ena object d
d=read_csv('iris.data',header=None).values

#plithos twn xaraktiristikwn dhladh ti xaraktirizei ena louloudi
print "NumberOfAttributes",d.shape[1]
#plitos twn deigmatwn dhl posa louloudia xrisimopoii8ikan
numOfPatterns=d.shape[0]
print "NumberOfPatterns: ",d.shape[0]
#dhmiourgia mia sthlhs me asous gia ton x
xOnes=np.ones([numOfPatterns,1])
#dhmiourgia prwtipwn toy pinaka x
x=d[:,[0,1,2,3]].astype(np.float64)
#me thn hstack prosthetoume ston x mia sthlh me asous thn xOnes
x=np.hstack((x,xOnes))
xplus=np.linalg.pinv(x)

fullData=d[:,[0,1,2,3]].astype(np.float64)
plt.figure(1)
plt.title("Graph For three Classes")
x2=d[0:50,0]
y=d[51:99,0]
z=d[100:150,0]

x1=d[0:50,2]
y1=d[51:99,2]
z1=d[100:150,2]
plt.xlabel("X")
plt.ylabel("Y")
plt.plot(x2,x1,'r*')
plt.plot(y,y1,'ko')
plt.plot(z,z1,'b<')
plt.show

t=np.zeros([numOfPatterns,1])

ans=4
while ans == 4:
    print ("Menu Epilogon")
    print ("1: Diaxorismos Iris-setosa apo Iris-versicolor kai Iris-virginica")
    print ("2: Diaxorismos Iris-virginica apo Iris-setosa kai Iris-versicolor")
    print ("3: Diaxorismos Iris-versicolor apo Iris-setosa kai Iris-virginica")
    epilogi=input("Dwse 1/2/3: ")
    if(epilogi==1):
        print("Epelexes to 1")
        dict_Setosa={"Iris-setosa": 1
                     ,"Iris-versicolor": 0
                     ,"Iris-virginica": 0}
        for pattern in range(0, numOfPatterns):
            if(d[pattern,4] == "Iris-versicolor"):
                t[pattern] = dict_Setosa['Iris-versicolor']
            elif(d[pattern,4] == "Iris-setosa"):
                t[pattern] = dict_Setosa['Iris-setosa']         
            else:
                t[pattern] = dict_Setosa['Iris-virginica']

        
    if(epilogi==2):
        print("Epelexes to 2")
        dict_virginica={"Iris-setosa": 0
                         ,"Iris-versicolor": 0
                         ,"Iris-virginica": 1}
        for pattern in range(0, numOfPatterns):
         if(d[pattern,4] == "Iris-versicolor"):
             t[pattern] = dict_virginica['Iris-versicolor']             
         elif(d[pattern,4] == "Iris-setosa"):
             t[pattern] = dict_virginica['Iris-setosa']             
         else:
             t[pattern] = dict_virginica['Iris-virginica']
             
        
    if(epilogi==3):
        print("Epelexes to 3")
        dict_Versicolor={"Iris-setosa": 0
                         ,"Iris-versicolor": 1
                         ,"Iris-virginica": 0}
        for pattern in range(0, numOfPatterns):
         if(d[pattern,4] == "Iris-versicolor"):
             t[pattern] = dict_Versicolor['Iris-versicolor']             
         elif(d[pattern,4] == "Iris-setosa"):
             t[pattern] = dict_Versicolor['Iris-setosa']             
         else:
             t[pattern] = dict_Versicolor['Iris-virginica']  
    #xwrismos protypwn se protipa ekpedeusis kai anaklisis
    setosa=x[0:40,[0,1,2,3]]
    versicolor=x[50:90,[0,1,2,3]]
    virginica=x[100:140,[0,1,2,3]]
    xtrain= np.vstack((setosa,versicolor,virginica)).astype(np.float64)
    
    t2=t*2-1
    t2trans=np.transpose(t2)
    w=t2trans*xplus
    wT=np.transpose(w)
    y=wT*x
    tSetosa=x[40:50,[0,1,2,3]]
    tVersicolor=x[90:100,[0,1,2,3]]
    tVirginica=x[140:150,[0,1,2,3]]
    xtest=np.vstack((tSetosa,tVersicolor,tVirginica)).astype(np.float64)
    
    
    
    #Dianismata stoxoi ka8e klashs
    targetSetosa=t[0:40,[0]]
    targetVersicolor=t[50:90,[0]]
    targetVirginica=t[100:140,[0]]
    ttrain= np.vstack((targetSetosa,targetVersicolor,targetVirginica))
    
    

    TtargetSetosa=t[40:50,[0]]
    TtargetVersicolor=t[90:100,[0]]
    TtargetVirginica=t[140:150,[0]]
    ttest=np.vstack((TtargetSetosa,TtargetVersicolor,TtargetVirginica))
    
     
   
    
    plt.figure()
    plt.title("Graph Test-Train set")
    x=xtrain[:,0]
    y=xtrain[:,2]
                    
    x1=xtest[:,0]
    y1=xtest[:,2]
                    
    plt.plot(x,y,'b.')
    plt.plot(x1,y1,'r.')
    plt.show  
    
    #ypologismos wT kai yT gia train
    izo=np.ones([120,1])
    xtrainP=np.hstack((xtrain,izo))
    xtrainPlus=np.linalg.pinv(xtrainP)
    
    ttrain1=ttrain*2-1
    ttrainT=np.transpose(ttrain1)
    
    w=ttrainT*xtrainPlus
    wfullextra=np.transpose(w)
    y=wfullextra*xtrainP
    yT=np.transpose(y)
    predictTr=[]
    for i in range(0,120):
      if(y[i,4]<0):
       predictTr.append(0)
      elif(y[i,4]>=0):
        predictTr.append(1)  
    plt.figure(3)
    plt.title('Train-Predict Graph')
    #plt.subplot(4,4,c+1)
   
    plt.plot(ttrain,'b.')
    plt.plot(predictTr,'r.')
    plt.show()
    
    #ypologismos wT kai yT gia Test
    #proetimasia gia ton ypologismo
    eo=np.ones([30,1])
    xtestP=np.hstack((xtest,eo))
    xtestPlus=np.linalg.pinv(xtestP)
    
    ttest1=ttest*2-1
    ttestT=np.transpose(ttest1)
    
    wTest=ttestT*xtestPlus
    wTestfullextra=np.transpose(wTest)
    yTest=wTestfullextra*xtestP
    yTestT=np.transpose(yTest)
    predictTe=[]
    for i in range(0,30):
      if(yTest[i,4]<0):
       predictTe.append(0)
      elif(yTest[i,4]>=0):
        predictTe.append(1)  
    plt.figure(4)
    plt.title('Test-Predict Graph')
    #plt.subplot(4,4,c+1)
   
    plt.plot(ttest,'b.')
    plt.plot(predictTe,'r.')
    plt.show()
    irisData=fullData #iris.data
    irisTarget=t #iris.Targer
    predictTestF=[]
    for i in range(1, 10):
     X_train, X_test, T_train, T_test = train_test_split(irisData, irisTarget, test_size=0.1)
     #vriskoume to megethos twn pinakwn
     xtrainLen=len(X_train)
     xtestLen=len(X_test)
     ttrainLen=len(T_train)
     ttestLen=len(T_test)
     #metatropi pinakwn T_train T_test apo 0-1 se 1-1
     T_train1=T_train*2-1
     T_test1=T_test*2-1
     
     #ypologismos typou wT=tT*X+
     tTrainT=np.transpose(T_train1)
     asoi=np.ones([xtrainLen,1])
     X_trainP=np.hstack((X_train,asoi))
     X_trainPlus=np.linalg.pinv(X_trainP)
     w2=tTrainT*X_trainPlus
     w2T=np.transpose(w2)
     
     #ypologismos wT gia test
     tTestT=np.transpose(T_test1)
     asakia=np.ones([ttestLen,1])
     X_testP=np.hstack((X_test,asakia))
     X_testPlus=np.linalg.pinv(X_testP)
     w2test=tTestT*X_testPlus
     w2testT=np.transpose(w2test)
     
     #ypologismos typou yTtest=wT*Xtest
     #asos=np.ones([xtestLen,1])
     #X_testP=np.hstack((X_test,asos))
     yTest3=w2testT*X_testP
     k=i;
     for i in range(0,xtestLen):
      if(yTest3[i,4]<0):
       predictTestF.append(0)
      elif(yTest3[i,4]>=0):
        predictTestF.append(1)
        criterion=""
     
     evaluate(T_test,predictTestF,criterion)

     predictTestF=[]
     """
     print "Fold:",i, "",X_train.shape[0],"Protypa gia ekpaideusi & ",X_test.shape[0]," gia test"
     
    
     xTfold=X_train[:,0]
     yTfold=X_train[:,2]
     xTestfold=X_test[:,0]
     yTestfold=X_test[:,2]
          
     plt.figure(4)
     plt.title('Fold Num: {}'.format(i))
     #plt.subplot(4,4,c+1)
     plt.plot(xTfold,yTfold,'b.')
     plt.plot(xTestfold,yTestfold,'r.')
     plt.show()
     """
    ans=0#input("Dwse 4 gia sinexeia: ") 

print "Telos Programmatos!"
#t, predict, criterion 
