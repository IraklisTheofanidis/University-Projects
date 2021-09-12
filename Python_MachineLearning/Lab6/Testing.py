# -*- coding: utf-8 -*-
"""
Created on Wed May 15 16:25:17 2019

@author: Errikos
"""
import numpy as np
a = np.array([[5, 2, 3,7], [2, 5, 6,7],[8,1,3,4],[3,2,3,5]])
target=np.array([1,0,1,0])
#split 0-1
zeroArray=np.ones((2,4))
oneArray=np.ones((2,4))
mu=np.ones((2,4))
sigma=np.ones((2,4))
oneMO=np.ones((1,4))
counterZeros=0;
counterOnes=0;
for k in range(0,target.shape[0]):
  if(target[k]==0):
   zeroArray[counterZeros]=a[k]
   counterZeros +=1
  else:
   oneArray[counterOnes]=a[k]  
   counterOnes+=1
   
for i in range(0,4):
  mu[0,i]= zeroArray[:,i].mean()
  sigma[0,i]=np.std(zeroArray[:,i])
  mu[1,i]=oneArray[:,i].mean()
  sigma[1,i]=np.std(oneArray[:,i])
  