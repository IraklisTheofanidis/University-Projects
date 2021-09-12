# -*- coding: utf-8 -*-
"""
Created on Fri Apr 19 19:29:15 2019

@author: Errikos
"""
from operator import add
list1 = [1, 2, 3]
list2 = [4, 5, 6]
list3= list( map(add, list1, list2) )

list4=[7,8,9]

list3=list( map(add, list3, list4) )