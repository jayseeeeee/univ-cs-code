# Use datetime and calendar to determine age based on birthday
from datetime import datetime
import calendar

today = datetime.today()

# Forces user to input correct number based on given criteria
def get_integer_input(prompt, min_value, max_value):
    while True:
        try:
            userInput = int(input(prompt))
            if userInput >= min_value and userInput <= max_value:
                return userInput
            print(f"Please enter a number between {min_value} and {max_value}")
        except ValueError:
            print("Please enter a valid number!")

# Get person's birth day
birth_year = get_integer_input("Please enter your birth year (YYYY): ", today.year - 120, today.year)
birth_month = get_integer_input("Please enter your birth month (MM): ", 1, 12)
birth_day = get_integer_input("Please enter your birth day (DD): ", 1, calendar.monthrange(birth_year, birth_month)[1])

# Determine tentative age
current_age = today.year - birth_year
# Determine final age if person had a birthday in the current year
if (today.month, today.day) < (birth_month, birth_day):
    current_age -= 1
# Display current age
print(f"You are currently {current_age} years old!")

# Input nationality
nationality = input("Please enter your nationality: ").title()
# Display nationality
print(f"Your current citizenship is {nationality}")

# Determine vote eligibility
if current_age >= 18 and "Filipino" in nationality:
    print("Congratulations! You are above 18 years old and a Filipino citizen! You are eligible to vote in the upcoming election!")
elif current_age < 18 and "Filipino" in nationality:
    print("Unfortunately, you are still under 18 years old which means you are ineligible to vote in the upcoming election.")
else:
    print(f"Unfortunately, you have stated your citizenship as {nationality}. Only Filipino citizens are eligible to vote in the upcoming election.")