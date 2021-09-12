# -*- coding: utf-8 -*-
"""
Created on Mon Mar 25 12:36:09 2019

@author: Errikos
"""
import matplotlib.pyplot as plt
import numpy as np
x1=[-2.3, -3.1, -0.3, -3.3, -2.2, -3.3, -3.4, -1.6,
 -2.1, -2.5, 0.6, 1.2, 2.6, 0.9, 2.7, 1.8,1.7, 2.1, 3.5, 1.8,]
x2 = [1.2, 4.5, 2.3, 1.1, 2.8, -0.3, 2.3, 2.5,
 2.2, 2.9, -1.5, -2.3, -1.0, -0.7, -2.1, -2.2,-2.0, -1.2, -1.5, -1.4];

#arxikos pinakas x
x1=np.array(x1)
x2=np.array(x2)
x=np.vstack((x1,x2))
print "Arxikos pinakas x :\n ",x
#dhmiourgoume ton pinaka t
t=np.ones([10,1])
ones=np.ones([20,1])
minus=-np.ones([10,1])
t=np.vstack((t,minus))
print "Pinakas t:\n ",t

#kanoume ton anastrofo toy x kai prosthetoume thn sthlh t
x=np.transpose(x)
print "kanoume transpose ton pinaka x:\n",x
X=np.hstack((x,ones))
print "prosthetoume thn sthlh ones ston X:\n",X

#vriskoume to w
t=np.transpose(t)
w=np.linalg.pinv(X)*t
print "W: ",w
wT=np.transpose(w)
#w=x*t
y = X*wT;
print "Y: ",y


plt.figure(1)
plt.title("Graph")
