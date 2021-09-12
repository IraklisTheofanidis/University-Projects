
import numpy as np
import matplotlib.pyplot as plt
from pandas import read_csv
from sklearn.model_selection import train_test_split

def stimulation(w_Transpose,x):
  return np.matmul(w_Transpose,x)

def vimatiki(u):  
  if(u<0):
    return -1
  elif(u>=0):
    return 1
  

def prediction(y,length):
  #length=135
  print length
  
  predictTr=[]
  for i in range(0,length):
    if(y<0):
     predictTr.append(0)
    elif(y>=0):
      predictTr.append(1)  
  return predictTr

def perceptron(x,t,maxepochs,beta):
  epoch=0
  unchanged=0
  w=[1.0 for i in range(len(x[0]))]
  print "x",x
  while(epoch < maxepochs and unchanged<len(x)):
    unchanged=0
    for p in range(len(x)):
     u=stimulation(np.transpose(w),x[p])
     y=vimatiki(u)
     #print "uuuuu: ",u
     #print "yyyyy:",y
    
     if(t[p]==y):
       unchanged+=1
     else:
       w=w+beta*(t[p]-y)*x[p,:]
    epoch+=1
  print "new w:",w
  print "Final y",y 
  print "unchanged",unchanged
  print "epoch: ",epoch
  return w
 # for e in range(maxepochs):
  
 
  #print "xTrain: ",x
  print "Target:" ,t
  return 0
accuracyAthroisma=0
precisionAthroisma=0
recallAthroisma=0
fmeasureAthroisma=0
sensitivityAthroisma=0
specificityAthroisma=0

def evaluate(t, predict,criterion):
  
  
  global tn
  global fn
  global tp
  global fp
  
  global precisionP
  global recallP
  global fmeasure
  global sensitivity
  global specificity
  
  global accuracyAthroisma
  global precisionAthroisma
  global recallAthroisma
  global fmeasureAthroisma
  global sensitivityAthroisma
  global specificityAthroisma
  
  tp=0.0
  fn=0.0
  tn=0.0
  fp=0.0
  for i in range(0,15):
      if((t[i]==0 and predict[i]==0) ):
        tn +=1
      elif((t[i]==1 and predict[i]==0) ):
        fn +=1
      elif((t[i]==1 and predict[i]==1) ):
        tp +=1
      elif((t[i]==0 and predict[i]==1) ):
        fp +=1
  

  
  if(criterion =="accuracy"):   
    accuracy=(tp+tn)/(tp+tn+fp+fn)
    accuracyAthroisma += accuracy
    print "Accuracy: ",accuracy
    
 
  elif(criterion =="precision"):
    p1=(tp+fp)
    if(p1 !=0):
     precisionP=tp/p1
    else:
     precisionP=9999
    precisionAthroisma += precisionP
    #precisionP=precision
    #print "Precision: ",precision
  
  elif(criterion =="recall"):
    re=tp+fn
    if(re !=0):
     recall=tp/re
    else:
      recall=99999
    recallAthroisma += recall
    
    recallP=recall
    print "Recall: ",recall

  elif(criterion =="fmeasure"):
    f1=(precisionP+recallP)/2
    if(f1 !=0):
     fmeasure=(precisionP*recallP)/f1
    fmeasureAthroisma += fmeasure  
    print "Fmeasure: ",fmeasure
  
  elif(criterion =="sensitivity"):
    sensitivity=tp/(tp+fn) 
    sensitivityAthroisma +=sensitivity
    
    print "sensitivity: ", sensitivity
  elif(criterion =="specificity"):
    specificity = tn/(tn+fp)
    specificityAthroisma += specificity
    print "specificity: ", specificity
    

    
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
#print "X epau3imeno",x
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
    #print "T transpose",t2trans
    #print "tTranspose",t2trans.shape," xplus Shape",xplus.shape
    w=t2trans*xplus
    wT=np.transpose(w)
    #print "wT shape",wT.shape
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
    
     
    maxepoches=input("Dwse ari8mo epoxwn: ") 
    beta=input("Dwse Bhma ekpaideusis(0.1-0.9): ") 
    
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
    w=np.matmul(ttrainT,np.transpose(xtrainPlus))
    percept=perceptron(xtrainP,ttrain1,maxepoches,beta)
    #wfullextra=np.transpose(w)
    y=np.matmul(percept,np.transpose(xtrainP))
    y=np.transpose(y)
    #yT=np.transpose(y)
    predictTr=[]  
    
    for i in range(0,120):
      if(y[i]<0):
       predictTr.append(0)
      elif(y[i]>=0):
        predictTr.append(1)  
    
    plt.figure(3)
    plt.title('Train-Predict Graph')
    #plt.subplot(4,4,c+1)
   
    plt.plot(ttrain,'bs')
    plt.plot(predictTr,'r.')
    plt.show()
    
    #ypologismos wT kai yT gia Test
    #proetimasia gia ton ypologismo
    eo=np.ones([30,1])
    xtestP=np.hstack((xtest,eo))
    xtestPlus=np.linalg.pinv(xtestP)
    #w=np.matmul(ttrainT,np.transpose(xtrainPlus))
    ttest1=ttest*2-1
    ttestT=np.transpose(ttest1)
    
    #wTest=np.matmul(ttestT,np.transpose(xtestPlus))
    #wTestfullextra=np.transpose(wTest)
    #np.matmul(w,np.transpose(xtrainP))
   
    
    yTest=np.matmul(percept,np.transpose(xtestP))
    yTest=np.transpose(yTest)
    predictTe=[]
    for i in range(0,30):
      if(yTest[i]<0):
       predictTe.append(0)
      elif(yTest[i]>=0):
        predictTe.append(1)  
    plt.figure(4)
    plt.title('Test-Predict Graph')
    #plt.subplot(4,4,c+1)
   
    plt.plot(ttest,'bs')
    plt.plot(predictTe,'r.')
    plt.show()
    irisData=fullData #iris.data
    irisTarget=t #iris.Targer
    predictTestF=[]
    #print "ttrain: ",ttrain1
    #print "xtrainplis",xtrainP
   
    print "percept",percept
    #maxepochs=input("Dwse ari8mo epochwn : ") 
    #beta=input("Dwse to vima epkpaideusis: ") 
    
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
     #w=np.matmul(ttrainT,np.transpose(xtrainPlus))
     #ypologismos typou wT=tT*X+
     tTrainT=np.transpose(T_train1)
     asoi=np.ones([xtrainLen,1])
     X_trainP=np.hstack((X_train,asoi))
     X_trainPlus=np.linalg.pinv(X_trainP)
     w2=np.matmul(tTrainT,np.transpose(X_trainPlus))
     #print "w2",w2
     #w2T=np.transpose(w2)
     
     #perceptFold=perceptron(X_trainP,T_train1,15000,beta=0.3)
     
     #ypologismos typou yTtest=wT*Xtest
     asos=np.ones([xtestLen,1])
     X_testP=np.hstack((X_test,asos))
     perceptFold=perceptron(X_testP,T_test1,maxepoches,beta)
     yTest3=np.matmul(perceptFold,np.transpose(X_testP))
     yTest3=np.transpose(yTest3)
     print "FOLD: ",i
     k=i;
     for i in range(0,xtestLen):
      if(yTest3[i]<0):
       predictTestF.append(0)
       
      elif(yTest3[i]>=0):
        predictTestF.append(1)
       
        
     
     p=1
     while(p<7):
         if(p==1):
             criterion="accuracy"
         elif(p==2):
             criterion="precision"
         elif(p==3):
             criterion="recall"
         elif(p==4):
             criterion="fmeasure"
         elif(p==5):
             criterion="sensitivity"
         elif(p==6):
             criterion="specificity"
         global a
         a=evaluate(T_test,predictTestF,criterion)
         
         p=p+1
     print "\n"
     #perceptron(X_trainP,T_train1,100,0.2)
     plt.figure(6)
     #plt.subplot(4,4,c+1)
     plt.plot(T_test,'bs')
     plt.plot(predictTestF,'r.')
     plt.show()
     predictTestF=[]
     
    ans=0#input("Dwse 4 gia sinexeia: ") 
  
print "Mesoi Oroi: \n"

print "MO Accuracy: ",accuracyAthroisma/9
print "MO precisionAthroisma: ",precisionAthroisma/9
print "MO recallAthroisma: ",recallAthroisma/9
print "MO fmeasureAthroisma: ",fmeasureAthroisma/9
print "MO sensitivityAthroisma: ",sensitivityAthroisma/9
print "MO specificityAthroisma:",specificityAthroisma/9

accuracyAthroisma=0
precisionAthroisma=0
recallAthroisma=0
fmeasureAthroisma=0
sensitivityAthroisma=0
specificityAthroisma=0
print "Telos Programmatos!"
#t, predict, criterion 
