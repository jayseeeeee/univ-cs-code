# Forces user to input correct number
def get_float_input():
    while True:
        try:
            userInput = float(input("Please enter the initial value of temperature: "))
            return userInput
        except ValueError:
            print("Please enter a valid number!")

# Converts the temperature depending on initial unit
def convert_temperature(unit, temperature):
    if unit == "F":
        # Converts the temperature from fahrenheit to celsius
        return (temperature - 32) * (5/9), "C"
    elif unit == "C":
        # Converts the temperature from celsius to fahrenheit
        return (temperature * (9/5)) + 32, "F"
    else:
        print("Invalid input, please try again!")
        return None, None

initial_temperature = get_float_input()

# Forces user to input correct unit of temperature
while True:
    initial_unit = input("Please enter the initial unit of temperature (C/F): ")
    final_temperature, final_unit = convert_temperature(initial_unit, initial_temperature)
    if final_temperature is not None:
        # Output the converted temperature
        print(f"{initial_temperature}°{initial_unit} is equivalent to {final_temperature:.2f}°{final_unit}")  
        break