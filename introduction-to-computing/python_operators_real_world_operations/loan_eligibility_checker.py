MAXIMUM_DTI_RATIO = 30 # Measured in percentages
MINIMUM_CREDIT_SCORE = 650 # Common credit scores locally

# Forces correct input depending on data type
def get_number_input(prompt, object):
    while True:
        try:
            userInput = object(input(prompt))
            return userInput
        except ValueError:
            print("Please enter a valid number!")

# Get the input values for calculation
monthly_income = get_number_input("Please enter your monthly income (₱): ", float)
current_debt = get_number_input("Please enter you current debt (₱): ", float)
credit_score = get_number_input("Please enter your current score: ", int)

# Calculate the DTI ratio ()
dti_ratio = (current_debt / monthly_income ) * 100

# Check DTI ratio and credit score for loan eligibility
if dti_ratio <= MAXIMUM_DTI_RATIO and credit_score >= MINIMUM_CREDIT_SCORE:
    print("Congratulation! You have met the debt-to-income ratio and have good standing in your credit score which makes you ELIGIBLE for a loan application")
elif dti_ratio > MAXIMUM_DTI_RATIO and credit_score < MINIMUM_CREDIT_SCORE:
    print("Unfortunately, you exceeded the maximum debt-to-income ratio and you have poor standing in credit score which means you are INELIGIBLE for a loan application")
elif dti_ratio > MAXIMUM_DTI_RATIO:
    print("Unfortunately, you did not meet one of the criterias for a loan application due to exceeding the maximum debt-to-income ratio")
elif credit_score < MINIMUM_CREDIT_SCORE:
    print("Unfortunately, you did not meet one of the criterias for a loan application due to poor standing in your credit score")
