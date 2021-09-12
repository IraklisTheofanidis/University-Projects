import numpy as np
import matplotlib.pyplot as plt
from pandas import read_csv
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score
from sklearn.metrics import precision_score
from sklearn import svm
import pprint
from operator import add
accuracyAthroisma=0
precisionAthroisma=0
recallAthroisma=0
fmeasureAthroisma=0
sensitivityAthroisma=0
specificityAthroisma=0
tn=0
fn=0
tp=0
fp=0
def acc(t, predict):
  global tn,fn,tp,fp
  zx=predict.shape[0]
  print "zxzxzxzxzxzxzxzxzxzx",zx
  for i in range(0,15):
      if((t[i]==0 and predict[i]==0) ):
        tn +=1
      elif((t[i]==1 and predict[i]==0) ):
        fn +=1
      elif((t[i]==1 and predict[i]==1) ):
        tp +=1
      elif((t[i]==0 and predict[i]==1) ):
        fp +=1
  accuracy=(tp+tn)/(tp+tn+fp+fn)  
  return accuracy

def evaluate(t, predict,criterion):
  
  global tn,fn,tp,fp
  global precisionP,recallP,fmeasure,sensitivity,specificity
  global accuracyAthroisma,precisionAthroisma,recallAthroisma,fmeasureAthroisma
  global sensitivityAthroisma,specificityAthroisma
  
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
    #print "Accuracy: ",accuracy
    
 
  elif(criterion =="precision"):
    p1=(tp+fp)
    if(p1 !=0):
     precisionP=tp/p1
    else:
     precisionP=99999
    precisionAthroisma += precisionP
    #precisionP=precision
    #print "Precision: ",precision
  
  elif(criterion =="recall"):
    re=tp+fn
    if(re !=0):
     recall=tp/re
    else:
      recall=999999
    recallAthroisma += recall
    
    recallP=recall
    #print "Recall: ",recall

  elif(criterion =="fmeasure"):
    f1=(precisionP+recallP)/2
    if(f1 !=0):
     fmeasure=(precisionP*recallP)/f1
    fmeasureAthroisma += fmeasure  
    #print "Fmeasure: ",fmeasure
  
  elif(criterion =="sensitivity"):
    s1=tp+fn
    if(s1 !=0):
     sensitivity=tp/(tp+fn)
    else:
      sensitivity=999999
    sensitivityAthroisma +=sensitivity
    
    #print "sensitivity: ", sensitivity
  elif(criterion =="specificity"):
    specificity = tn/(tn+fp)
    specificityAthroisma += specificity
    #print "specificity: ", specificity
    
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

    #ypologismos wT kai yT gia Test
    #proetimasia gia ton ypologismo
    eo=np.ones([30,1])
    xtestP=np.hstack((xtest,eo))
    xtestPlus=np.linalg.pinv(xtestP)
    ttest1=ttest*2-1
    ttestT=np.transpose(ttest1)
    
    
    
    #input_C=input("Dwse thn parametro C: ")
    #input_Gamma=input("Dwse thn parametro Gamma: ")
    gamma=[0.001,0.03,0.1,0.3,1]
    c=[1,10,100,1000]
    result={}
    for i in range(5):
    #print gamma[i]
     for k in range(4):
        #result[(gamma[i],c[k])]=i*k
        svc=svm.SVC(C=c[k],kernel='rbf',gamma=gamma[i])
        fitness3=svc.fit(xtrain,ttrain)
        prediction3=svc.predict(xtrain)
        #print"Accuracy: ",accuracy_score(ttrain,prediction3)
        result[(gamma[i],c[k])]=accuracy_score(ttrain,prediction3)*100

    print pprint.pformat(result)
    key_max = max(result.keys(), key=(lambda k: result[k]))
    print('Maximum Value: ',"Key: ",key_max," Value: ",result[key_max])
    #fitness2=mlpclass.fit(xtest,ttest)
    svc=svm.SVC(C=key_max[1],kernel='rbf',gamma=key_max[0])
    fitness=svc.fit(xtrain,ttrain)    
    predictions2=svc.predict(xtest)
    
    plt.figure(5)
    plt.title('Test-Predict Graph')
   
    plt.plot(ttest,'bs')
    plt.plot(predictions2,'r.')
    plt.show()
    print"Test Accuracy: ",accuracy_score(ttest,predictions2)
    irisData=fullData #iris.data
    irisTarget=t #iris.Targer
    #predictTestF=[]
    kkk=1
    lll=1
    array1=[]
    keeper=[0]*20
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
     #fitnessf=mlpclass.fit(X_train,T_train)
     #predictionTest=mlpclass.predict(X_test)
     print "==============FOLD: ",i,"=============="
     for z in range(5):
      for s in range(4):
       print "---","C: ",c[s],"Gamma: ",gamma[z],"---"
       svc2=svm.SVC(C=c[s],kernel='rbf',gamma=gamma[z])
       fitness4=svc.fit(X_train,T_train)
       prediction4=svc.predict(X_test)
       predi= accuracy_score(T_test,prediction4)
       print "Predi: ",predi
       array1.append(predi)
       #print "Arr",i, array1
     keeper=list( map(add,keeper, array1))
     array1=[]
     k=i;
           
     plt.subplot(3,3,lll)
     plt.title('Fold Num: {}'.format(lll))
     plt.plot(T_test,'bs')
     plt.plot(prediction4,'r.')
     plt.tight_layout(pad=0.4, w_pad=0.5, h_pad=1.0)
     
     #plt.show()
     #predictTestF=[]
     lll=lll+1
         
    ans=0#input("Dwse 4 gia sinexeia: ") 
resultF=np.asarray(keeper)   
mo=resultF/9
dict_results={}
count=0
for z in range(5):
  for s in range(4):
    dict_results[(gamma[z],c[s])]=mo[count]
    count+=1

print pprint.pformat(dict_results)
key_max2 = max(dict_results.keys(), key=(lambda k: dict_results[k]))
print('Maximum Value: ',"Key: ",key_max2," Value: ",dict_results[key_max2])

accuracyAthroisma=0
precisionAthroisma=0
recallAthroisma=0
fmeasureAthroisma=0
sensitivityAthroisma=0
specificityAthroisma=0
print "Telos Programmatos!"