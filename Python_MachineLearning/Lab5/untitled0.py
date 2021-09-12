# -*- coding: utf-8 -*-
"""
Created on Tue May  7 19:06:04 2019

@author: Errikos
"""

import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn import svm
from sklearn.metrics import classification_report


#from sklearn.metrics import classification_report, confusion_matrix




data = pd.read_csv('http://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data',header=None).values

print data
#iris.head()

map_dict = {
     "Iris-setosa" : 0,
     "Iris-versicolor" : 1,
     "Iris-virginica":0
     }

x=data[:,[0,1,2,3]].astype(np.float64)
babis=x.shape[0]
t=np.zeros((x.shape[0],1))

map_dict = {"Iris-setosa": 0
    , "Iris-versicolor": 1
    , "Iris-virginica": 0}
for pattern in range(0, babis):

    if (data[pattern, 4] == "Iris-versicolor"):

        t[pattern] = map_dict['Iris-versicolor']

    elif (data[pattern, 4] == "Iris-setosa"):

        t[pattern] = map_dict['Iris-setosa']

    else:
        t[pattern] = map_dict['Iris-virginica']
iris = datasets.load_iris()
x=iris.iloc[:,:-1]
t=iris.iloc[:,4]



C = input("Dwse timi:  ")
gamma = input("Dwse timi: ")


for i in range(1, 10):

    xtrain, xtest, ttrain, ttest = train_test_split(x, t, test_size=0.1)


    slf=svm.SVC(kernel='rbf',C=C,gamma=gamma,degree=3,coef0=0.0)
    slf.fit(xtrain,ttrain)

    predict = slf.predict(xtest)

   #print(slf.score(xtest,ttest))


#plooting the data

x_min, x_max = x[:, 0].min() - 1, x[:, 0].max() + 1
t_min, t_max = x[:, 1].min() - 1, x[:, 1].max() + 1
h = (x_max / x_min)/100
xx, tt = np.meshgrid(np.arange(x_min, x_max, h),
 np.arange(t_min, t_max, h))

plt.subplot(1, 1, 1)
Z = slf.predict(np.c_[xx.ravel(), tt.ravel()])
Z = Z.reshape(xx.shape)
plt.contourf(xx, tt, Z, cmap=plt.cm.Paired, alpha=0.8)

plt.scatter(x[:, 0], x[:, 1], c=t, cmap=plt.cm.Paired)
plt.xlabel('Sepal length')
plt.ylabel('Sepal width')
plt.xlim(xx.min(), xx.max())
plt.title('SVC with rbf kernel')
plt.show()
