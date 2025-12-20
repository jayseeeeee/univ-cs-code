global MY_SAVINGS
MY_NAME = "John Christian B. Dacasin"
MY_SAVINGS = 50000
MY_ACCOUNT_NUMBER = 123456789
MY_PIN_NUMBER = 123456

account_number = int(input("Please enter Account Number: "))
pin_number = int(input("Please enter PIN Number: "))
print("==================================================")

while(not(MY_ACCOUNT_NUMBER == account_number and MY_PIN_NUMBER == pin_number)):
    print("Incorrect account details, please try again.")
    account_number = int(input("Please enter Account Number: "))
    pin_number = int(input("Please enter PIN Number: "))
    print("==================================================")

print(f"Welcome, {MY_NAME}!")
print("==================================================")

def balance():
    print(f"Your current balance is ₱{MY_SAVINGS}")
    print("==================================================")

def withdraw():
    global MY_SAVINGS
    withdraw_amount = float(input("Please enter withdrawal amount (₱): "))
    print("==================================================")
    while(withdraw_amount > MY_SAVINGS or withdraw_amount < 0):
        print("Invalid withdrawal amount, please enter valid amount.")
        withdraw_amount = float(input("Please enter withdrawal amount: "))
        print("==================================================")
    MY_SAVINGS = MY_SAVINGS - withdraw_amount
    print(f"You have succesfully withdrawn ₱{withdraw_amount}")
    print(f"Your new current balance is ₱{MY_SAVINGS}")
    print("==================================================")

def deposit():
    global MY_SAVINGS
    deposit_amount = float(input("Please enter deposit amount (₱): "))
    print("==================================================")
    while(deposit_amount < 0):
        print("Invalid deposit amount, please enter valid amount.")
        deposit_amount = float(input("Please enter deposit amount: "))
        print("==================================================")
    MY_SAVINGS = MY_SAVINGS + deposit_amount
    print(f"You have succesfully deposited ₱{deposit_amount}")
    print(f"Your new current balance is ₱{MY_SAVINGS}")
    print("==================================================")

choice = None
while(not choice == 0):
    print("0 - Exit\n1 - Balance\n2 - Withdraw\n3 - Deposit")
    print("==================================================")
    choice = int(input("Please enter from the list: "))
    print("==================================================")
    if choice == 0:
        break
    elif choice == 1:
        balance()
    elif choice == 2:
        withdraw()
    elif choice == 3:
        deposit()