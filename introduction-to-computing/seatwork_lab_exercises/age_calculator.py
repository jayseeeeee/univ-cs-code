name = input("Enter your name: ")
age = int(input("Enter your age: "))
favorite_number = int(input("Enter your favorite number: "))

def check_age(age):
    if age < 18:
        print("You're still a minor!")
    elif 18 <= age <= 65:
        print("You're an adult!")
    else:
        print("You're a senior citizen!")

check_age(age)