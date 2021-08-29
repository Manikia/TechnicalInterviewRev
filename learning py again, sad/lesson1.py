num = 4
print(num)
# complex numbers:first one will be the real part 
# of the complex number, while the second value 
# will be the imaginary part.

#used to solve quadratic equations that = 0 or
#squareroot 0
com = complex(10, -2)
print(com)

#finding the length of a string
str = 'a string'
print(len(str))

#accessing characters in a string
name = 'monika angel'
#getting the first character
first = name[0]
print(first)
#getting the last character
last = name[0-1]
print(last)
#gets last character in string
print(name[-1]) #maybe we can 
#create a for loop that reverses everything
# if we substitute the 1 w an i and increase
print(name[-12])

newstr = "this-is-a-string"
print(newstr[0:4]) #slices to only have 'this'
print(newstr[8:len(newstr)]) 
# prints everything from beginning to the end by
# getting the string length 
#[start:end:step]
print("Skipping splits")
print(newstr[0:5])
print(newstr[0:5:2])
print(newstr[0:5:4])

#reversing a string
#if we reverse a string we switch the start and end indices
print(newstr[len(newstr):0:-1])

#to print the whole string we do
print(newstr[:])

#to reverse the whole string we do
print(newstr[::-1])

#we can do floor division which gets you the smallest float integer
print(5.5//4.5)

#is checks if two things are the same objects
#and is not check if theyre not
x = ["apple", "banana", "cherry"]
y = x
print(x is y)

#=	Assign
#+= Add
#-= Subtract
#*= Multiply
#/= Divide
#//= Divide, Floor
#**= Raise power
#%= Take Modulo
#|= OR
#&= AND
#^= XOR
#>>= Right-shift
#<<= Left-shift


