'''
Created on Mar 23, 2016
Notes
    white space matters
    
@author: RK3lly
'''



print "river" #this is how you print a line
a = 15 #Initialize a Variable
b = 12

#Standard if statment
if a > b:
    print "A is greater than b"
    print "The value for a is " +str(a) #concatinate a string
    print "The Value of B is "+ str(b)
else:
    print "B is greater than A"
    #white space matters, the indent indicates the block 

#Standard while statmet
while(a > b):
    print "this is awesome"
    a = a-1
    
print a+b

a = "Change the identifier of A" # A is now a String
print a

a, b = input("Give me two numbers for (a and b):")
#Input must be the same as Assignment
# "7, 8" will work     "7 9" will not 

a = "6"
b = 7
c = int(a) + b # concatinate a int
print c



def river():
    print 1, # Print on the same line
    print 2
    print 4,
    print 5
    
river()










    
    