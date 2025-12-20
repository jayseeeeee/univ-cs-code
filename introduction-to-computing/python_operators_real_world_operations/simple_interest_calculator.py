# Forces user to input correct number
def get_float_input(prompt):
    while True:
        try:
            userInput = float(input(prompt))
            return userInput
        except ValueError:
            print("Please enter a valid number!")

# Get the input values for the simple interest 
principal_balance = get_float_input("Please enter the initial principal balance of the loan (₱): ")
interest_rate = get_float_input("Please enter the anual interest rate of the loan (%): ")
time = get_float_input("Please enter the time in years of the loan (in years): ")

# Compute for the simple interest with each value with the formula: (P × R × T) / 100
simple_interest = (principal_balance * interest_rate * time) / 100
# Compute for the total amount by combining the principal amount to simple interest
total_amount = principal_balance + simple_interest

# Display the simple interest and total amount in pesos
print(f"The simple interest on an initial balance of ₱{principal_balance} at an interest rate of {interest_rate} for {time} is ₱{simple_interest:.2f} with the total amount of ₱{total_amount:.2f}")