# FORMATIVE EXERCISES: PYTHON PROGRAMMING

################### 
### 1. VARIABLE ###
###################

# EXERCISE 1.1
# Create a variable city and assign it the name of your favorite city.
city = "Tokyo"
# Print the value of city.
print("EXERCISE 1.1:", city)

# EXERCISE 1.2
# Create two variables a and b with values 12 and 7, respectively. 
a = 12
b = 7
# Swap the values of a and b.
temp = a
a = b
b = temp
# Print the new values.
print("EXERCISE 1.2:", a, b)

# EXERCISE 1.3
# Assign the value 2024 to a variable current_year.
current_year = 2024
# Subtract 5 from current_year and store the result in a new variable called previous_year.
previous_year = current_year - 5
# Print previous year.
print("EXERCISE 1.3:", previous_year)

# EXERCISE 1.4: 
# Create a variable is_sunny and set it to True.
is_sunny = True
# Change its value to False
is_sunny = False
# Print the updated value.
print("EXERCISE 1.4:", is_sunny)

# EXERCISE 1.5:
# Assign the value of 3.14 to a variable pi.
pi = 3.14
# Create another variable circumference that stores the product of pi and 10.
circumference = pi * 10
# Print circumference.
print("EXERCISE 1.5:", circumference)

##################
### 2. NUMBERS ###
##################

# EXERCISE 2.1: 
# Create a variable length with the value 15.5.
length = 15.5
# Multiply length by 2 and store the result in a variable double_length. 
double_length = length * 2
# Print double_length.
print("EXERCISE 2.1:", double_length)

# EXERCISE 2.2: 
# Assign the values 20, 45, and 65 to variables x, y, and z. 
x = 20
y = 45
z = 65
# Calculate the average of these three numbers.
average = (x + y + z) / 3
# Print the result.
print("EXERCISE 2.2:", average)

# EXERCISE 2.3: 
# Create a variable side with the value 4. 
side = 4
# Calculate the area of a square using the formula area = side^2
area = side * side
# Print the result.
print("EXERCISE 2.3:", area)

# EXERCISE 2.4:
# Assign the number 200 to a variable total.
total = 200 
# Divide total by 8 and store the quotient in a variable result. 
result = total / 8
# Print result.
print("EXERCISE 2.4:", result)

# EXERCISE 2.5:
# Create a variable hours_worked with the value 40 and a variable hourly_rate with the value 15. 
hours_worked = 40
hourly_rate = 15
# Calculate the total weekly pay by multiplying these two values
weekly_pay = hours_worked * hourly_rate
# Print the result.
print("EXERCISE 2.5:", weekly_pay)

##################
### 3. STRINGS ###
##################

# EXERCISE 3.1:
# Create a string variable welcome_message with the value "Welcome to Python Programming!"
welcome_message = "Welcome to Python Programming!"
# Print the first and last character of the string.
print("EXERCISE 3.1:", welcome_message[0], welcome_message[-1])

# EXERCISE 3.2:
# Create a string variable hobby with your favorite hobby. 
hobby = "Playing video games"
# Print the string reversed.
print("EXERCISE 3.2:", hobby[::-1])

# EXERCISE 3.3:
# Assign the string "data analysis" to a variable task. 
task = "data analysis"
# Convert the string to title case (where each word starts with an uppercase letter).
title_case = task.title()
# Print the result
print("EXERCISE 3.3:", title_case)

# EXERCISE 3.4: 
# Create two string variables fruit1 and fruit2 with the values "apple" and "orange". 
fruit1 = "apple"
fruit2 = "orange"
# Print a new string that says "I like apple and orange." by concatenating these variables.
new_string = "I like " + fruit1 + " and " + fruit2 + "."
print("EXERCISE 3.4:", new_string)

# EXERCISE 3.5:
# Assign the sentence "The quick brown fox jumps over the lazy dog" to a variable sentence.
sentence = "The quick brown fox jumps over the lazy dog"
# Count the number of times the letter "o" appears in the sentence and print the count.
print("EXERCISE 3.5:", sentence.count('o'))

###########################
### 4. PRINT FORMATTING ###
###########################

# EXERCISE 4.1: 
# Use print formatting to display the following information:
product = "Smartphone"
price = 299.99
print(f"EXERCISE 4.1: The price of the {product} is ${price}.")

# EXERCISE 4.2: 
# Format and print the following information as a receipt:
item1 = "Book"
price1 = 12.99
item2 = "Pen"
price2 = 1.99
print(f"EXERCISE 4.2:\nItem Price\n----------------\n{item1} ${price1} \n{item2} ${price2}")

# EXERCISE 4.3:
# Use print formatting to print the following sentence:
name = "Alice"
age = 30
print(f"EXERCISE 4.3: {name} is {age} years old.")

# EXERCISE 4.4: 
# Given the following variables:
num1 = 5.678
num2 = 3.456
# Print the numbers rounded to one decimal place: "5.7" and "3.5".
print("EXERCISE 4.4:", round(num1, 1), round(num2, 1))

# EXERCISE 4.5: 
# Create variables for your first name, last name, and a score out of 100.
first_name = "John Christian"
last_name = "Dacasin"
score = 95
# Print a formatted string showing the name and score, e.g., "John Doe: 95/100".
print(f"EXERCISE 4.5: {first_name} {last_name}: {score}/100")

####################################
### 5. INPUT AND BASIC OPERATORS ###
####################################

# EXERCISE 5.1:
# Write a program that asks the user for their favorite number.
favorite_number = int(input("EXERCISE 5.1: Please enter your favorite number. "))
# Print a message saying "Your favorite number is <number>".
print(f"EXERCISE 5.1: Your favorite number is {favorite_number}")

# EXERCISE 5.2:
# Create a Python script that asks the user to input their birth year.
birth_year = int(input("EXERCISE 5.2: Please enter your birth year. "))
# Calculate and print their age based on the current year.
print(f"EXERCISE 5.2: Your current age is", current_year - birth_year)

# EXERCISE 5.3:
# Write a program that asks the user to input the length and width of a rectangle. 
length = float(input("EXERCISE 5.3: Please enter the length of rectangle. "))
width = float(input("EXERCISE 5.3: Please enter the width of rectangle. "))
# Calculate the area of the rectangle and print the result.
print("EXERCISE 5.3: The area of the rectangle is", length * width)

# EXERCISE 5.4: Ask the user to input two numbers.
first_number = float(input("EXERCISE 5.4: Please enter a number. "))
second_number = float(input("EXERCISE 5.4: Please enter another number. "))
# Calculate and print the sum, difference, product, and quotient of the two numbers.
print("EXERCISE 5.4: The sum of two numbers is", first_number + second_number)
print("EXERCISE 5.4: The difference of two numbers is", first_number - second_number)
print("EXERCISE 5.4: The product of two numbers is", first_number * second_number)
print("EXERCISE 5.4: The quotient of two numbers is", first_number / second_number)

# EXERCISE 5.5: 
# Create a Python script that asks the user to input a string.
string_input = input("EXERCISE 5.5: Please enter a string. ")
# Print the number of characters in the string using the len() function.
print("EXERCISE 5.5: The number of characters in the string is", len(string_input))

##############################################
### 6. ASSIGNMENT AND ARITHMETIC OPERATORS ###
##############################################

# EXERCISE 6.1:
# Assign the value 50 to a variable score.
score = 50
# Add 20 to score using the += operator
score += 20
# Print the updated value.
print("EXERCISE 6.1:", score)

# EXERCISE 6.2:
# Create a variable number with the value 100.
number = 100
# Subtract 15 from number using the -= operator
number -= 15
# Print the new value.
print("EXERCISE 6.2:", number)

# EXERCISE 6.3: 
# Assign the value 8 to a variable x. 
x = 8
# Multiply x by 5 using the *= operator
x *= 5
# Print the result.
print("EXERCISE 6.3:", x)

# EXERCISE 6.4: 
# Create a variable balance with an initial value of 1000.
balance = 1000
# Deduct 50 from balance using the -= operator, then add 200 to it using the += operator. 
balance -= 50 
balance += 200
# Print the final balance.
print("EXERCISE 6.4:", balance)

# EXERCISE 6.5:
# Assign the value 10 to a variable counter.
counter = 10
# Use the **= operator to square counter. 
counter **= 2
# Print the squared value.
print("EXERCISE 6.5:", counter)