# one line comment

'''
multiple line comment
'''

# print "Hello World" on console
print("Hello World")

print("----------------------------- variables = containers to store values")

# declaration and initialization of a variable
brand_car = "Volvo"
model_car = "XC 60"

# no spaces in name of a variable
# variables start with small letters

# loosely typed = don't have to specify the data type of variables
print(f"I bought a car with the brand: {brand_car}")
print(f"The model is: {model_car}")

# ----------------------------- overwriting a variable
model_car = "XC 60 Facelift"

print(f"The new model is {model_car}")

first_name = "Michael"
last_name = "Jordan"
age = 34
print(f"The full name is: {first_name} + {last_name}. The age is {age}")

print("----------------------------- 4 Data types")
# String = characters that are separated with ' ' between them
brand = "Dacia"
# make the 'brand' to upper case
print(brand.upper())
# length of a string
print(len(brand))
model = "1310"
# int
released_year = 1990
# double/float
price = 23000.32
# boolean
insurance = False

print("----------------------------- Operators")
#  arithmetics: +, -, *, /, %
#  comparison: ==, <, >, !=
#  logical: and, or, !

a, b = 3, 5
print(a + b)
print(a - b)
print(a * b)
print(a / b)
print(a % b)

print(a == b)
print(a > b)
print(a < b)
print(a != b)

print(a > 2 and b > 6)
print(a > 2 or b > 6)

# with mother or with father or (with grandMother and with grandFather)
mother = True
father = False
grandMother = False
grandFather = False

print(mother or father or (grandMother and grandFather))




print("----------------------------- flow control: if else")
# = check the condition. if is true, it executes, if is false go to next statement

# if
print("Turn on radio")
# if the song is good, make it louder
good_song = True
if (good_song == True):
    print("Make is louder")
    print("Start to sing")
print("Turn of radio")


print("----------------------------- if - else")
# check if the number is even
number = 3
if number % 2 == 0:
    print("The number is even")
else:
    print("The number is odd")

# check if the number is positive
if number > 0:
    print("The number is positive")
else:
    print("The number is not positive")

# if the person has under 18, can't vote

# if, else, if, else
# the robot says hi at specific hour
# cast from string to int & take data from keyboard
# hour = int(input("write the hour: "))
hour = 19
if hour < 0:
    print("Hour doesn't exist")
elif hour <= 11:
    print("Good morning")
elif hour <= 18:
    print("Hello")
elif hour <= 21:
    print("Good evening")
elif hour <= 24:
    print("Good night")
else:
    print("Hour doesn't exist")


print("----------------------------- phone robot")
# option = int(input("choose the option: "))
option = 1
if option == 0:
    print("previous menu")
elif option == 1:
    print("romanian language")
elif option == 2:
    print("english language")
else:
    print("no such options. choose again")

print("----------------------------- lists")
# can be with different data types
# has a dynamic dimension
empty_list = []
fruits = ["apple", "banana", "orange", 3, True]
print(fruits)

# access an element by the index
print(fruits[0])
# add an element to the list
fruits.append("grapefruit")
print(fruits)
# overwrite an element
fruits[0] = "pomelo"
print(fruits)
# dimension of the list
print(len(fruits))

# take and return the last element from the list
last = fruits.pop()
print(last)
print(fruits)

# count the elements on the list
print(fruits.count(3))

# extend the list
exotic_fruits = ['ananas', 'kiwi']
fruits.extend(exotic_fruits)
print(fruits)

print("----------------------------- dictionaries")
empty_dict = {}

# declare and initialize a dict
grade_students = {"Michael": 10, "John": 9, "Mary": 8}

# add elements
grade_students["Eva"] = 10
print(grade_students)

# find the elements
print(grade_students["Michael"])

# update values
grade_students["John"] = 10
print(grade_students)

# size of the dict
print(len(grade_students))

# delete and return the value
grade_students.pop("Michael")
print(grade_students.get("Michael", "Student Michael is not anymore here"))
print(grade_students)

# return the keys
print(grade_students.keys())
# return the values
print(grade_students.values())


print("----------------------------- loops")
print("----------------------------- while")

liter_gas = 5
while liter_gas > 0:
    # car drives
    print("Car drives")
    liter_gas = liter_gas - 1
    if liter_gas <= 3:
        print("the light bulb is red")
print("Stop! No more gas.")


print("----------------------------- for")
# dalmatians
for i in range(0, 102):
    print(f"Dalmatian with the number {i}")

# to go through a list by the index
numbers = [3, 7, 10]
for i in range(0, len(numbers)):
    print(f"The index is: {i} and The number is: {numbers[i]}")

print("----------------------------- for each")
for number in numbers:
    print(f"The number is {number}")

# sum of numbers
sum = 0
for number in numbers:
    sum += number
print(f"The sum is {sum}")

# how many times '3' apears in the lis
list_numbers = [3, 4, 5, 6, 7, 2, 3, 3, 3]
count = 0
for number in list_numbers:
    if number == 3:
        count = count + 1
print(f"The number '3' apears in the list {count} times")

print("----------------------------- functions")


# define the functions
def printGreetings():
    print("Hello! Welcome!")
def printGreetingByName(first_name, last_name):
    print(f"Hello! {first_name} {last_name}")

def averageNumbers(number1, number2, number3):
    return (number1 + number2 + number3) / 3

def piValue():
    return 3.14
# if the person is adult or not
def checkPersonAdult(age):
    if age >= 18:
        return True
    else:
        return False


# calling the function
printGreetings()
printGreetingByName("Michael", "Jordan")
print(averageNumbers(3, 4, 5))
print(piValue())
print(checkPersonAdult(17))