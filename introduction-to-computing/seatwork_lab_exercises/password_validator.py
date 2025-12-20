import re

def validate_password(password):
    while True:
        if len(password) < 8:
            print("Invalid password, include at least 8 characters.")
        elif not re.search(r'[a-z]', password, re.IGNORECASE) or not re.search(r'[0-9]', password):
            print("Invalid password, include letters and numbers.")
        elif not re.search(r'[@_!#$%^&*( )<>?/\|}{~:]', password):
            print("Invalid password, include at least one special character.")
        else:
            print("You have succesfully created a password.")
            break
        password = input("Please enter a strong password: ")

password = input("Please enter a strong password: ")
validate_password(password)