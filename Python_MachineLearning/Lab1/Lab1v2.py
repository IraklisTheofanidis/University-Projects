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
#diavazoyme apo to arxeio iris.data kai ta vazoume se ena object d
d=read_csv('iris.data',header=None).values

#plithos twn xaraktiristikwn dhladh ti xaraktirizei ena louloudi
print "NumberOfAttributes",d.shape[1]
#plitos twn deigmatwn dhl posa louloudia xrisimopoii8ikan
numOfPatterns=d.shape[0]
print "NumberOfPatterns: ",d.shape[0]

#dhmiourgia prwtipwn toy pinaka x
x=d[:,[0,1,2,3]].astype(np.float64)
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
    
    irisData=fullData #iris.data
    irisTarget=t #iris.Targer
    
    for i in range(1, 10):
     X_train, X_test, T_train, T_test = train_test_split(irisData, irisTarget, test_size=0.1)
     print "Fold:",i, "",X_train.shape[0],"Protypa gia ekpaideusi & ",X_test.shape[0]," gia test"
    
    
     xTfold=X_train[:,0]
     yTfold=X_train[:,2]
     xTestfold=X_test[:,0]
     yTestfold=X_test[:,2]
            
     
     plt.title('Fold Num: {}'.format(i))
     #plt.subplot(4,4,c+1)
     plt.plot(xTfold,yTfold,'b.')
     plt.plot(xTestfold,yTestfold,'r.')
     plt.show()
     
    ans=input("Dwse 4 gia sinexeia: ") 
print "Telos Programmatos!"