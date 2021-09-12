# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
import random
import pprint
from collections import Counter
import numpy as np
from operator import add
gamma=[0.001,0.03,0.1,0.3,1]
c=[1,10,100,1000]
array1=[]
keeper=[]
resultR=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
counter=0
result={}
for i in range(1, 10):
  for i in range(5):
    #print gamma[i]
    for k in range(4):
        #print gamma[i],c[k]
        array1.append(random.randint(1,101))
        counter +=1      
  resultR=list( map(add, resultR, array1) )
  print keeper
  print array1
  array1=[]
myar=np.asarray(resultR)
#mo=keeper/9
print "mo: ",myar/9


#key_max = max(result.keys(), key=(lambda k: result[k]))
#print('Maximum Value: ',"Key: ",key_max," Value: ",result[key_max])
