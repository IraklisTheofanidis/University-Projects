import numpy as np
#εισαγουμε τα data οπου ειναι δυο πινακες ο ενας ο χ και ο αλλος ο τ
data=np.load('./mnist_49.npz')
#παιρνουμε τον πινακα χ οπου περιεχει τις εικονες
x=data["x"]
#παιρνουμε  τον πινακα τ οπου εχει τους στοχους  0=4 1=9
t=data["t"]

from sklearn.naive_bayes import GaussianNB
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score
sumScoreTr=0
sumScoreTe=0
classifier=GaussianNB()
for i in range(1, 10):
    X_train, X_test, T_train, T_test = train_test_split(x, t,test_size=0.1)
    
    classifier.fit(X_train,T_train)
    predict= classifier.predict(X_test)
    predictTrain=classifier.predict(X_train)
    scoreTrain=accuracy_score(T_train,predictTrain)
    scoreTest=accuracy_score(T_test,predict)
    sumScoreTr+=scoreTrain
    sumScoreTe+=scoreTest
    
    
    #score3=classifier.score(T_test,predict)
#end for
    
print "Mo Train Score: ",sumScoreTr/10
print"Mo Test Score: ",sumScoreTe/10
#ταξινομηση με NB και PCA
num_components=[1,2,5,10,20,30,40,50,100,200]
acc_train=np.zeros((10,1))
acc_test=np.zeros((10,1))
from sklearn.decomposition import PCA

classifierPCA=GaussianNB()
for n in range(len(num_components)):
  pca = PCA(n_components = num_components[n])
  x_pca=pca.fit_transform(x)
  sumScoreTr2=0
  sumScoreTe2=0
  for i in range(1,10):
    X_train1, X_test1, T_train1, T_test1 = train_test_split(x_pca, t,test_size=0.1)
    classifierPCA.fit(X_train1,T_train1)
    predictTrain2=classifierPCA.predict(X_train1)
    scoreTrain2=accuracy_score(T_train1,predictTrain2)
    predict2=classifierPCA.predict(X_test1)
    scoreTest2=accuracy_score(T_test1,predict2)
    sumScoreTr2+=scoreTrain2
    sumScoreTe2+=scoreTest2
  #end for
  acc_train[n]=sumScoreTr2/10
  acc_test[n]=sumScoreTe2/10
#end for n
import matplotlib.pyplot as plt

plt.figure(1)
plt.title("Naive Baise(PCA)")
plt.ylabel("Accuracy")
plt.xlabel("Number of PCA Componets")
plt.plot(num_components,acc_train,'b')
plt.plot(num_components,acc_test,'r')
plt.show()