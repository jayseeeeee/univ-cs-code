# Forces user to input correct number
def get_float_input(prompt):
    while True:
        try:
            userInput = float(input(prompt))
            return userInput
        except ValueError:
            print("Please enter a valid number!")

# Get price and discount from the user
price = get_float_input("Please input the price of the item in (₱): ")
discount_percentage = get_float_input("Please input the discount percentage (%): ")

# Calculate the item's discount amount and final price
discount_amount = price * (discount_percentage / 100)
final_price = price - discount_amount

# Output the discounted amount and final price
print(f"The discount amount of the item is ₱{discount_amount:.2f}")
print(f"The final price of the item with the discount is ₱{final_price:.2f}")