# Forces user to input correct number
def get_float_input(prompt):
    while True:
        try:
            userInput = float(input(prompt))
            return userInput
        except ValueError:
            print("Please enter a valid number!")

# Get values for BMI
height = get_float_input("Please input your height (in meters): ")
weight = get_float_input("Please input your weight (in kilograms): ")

# Calculate for the body mass index 
body_mass_index = weight / (height * height)

# Display BMI
print(f"Your BMI is equal to {body_mass_index:.2f}")