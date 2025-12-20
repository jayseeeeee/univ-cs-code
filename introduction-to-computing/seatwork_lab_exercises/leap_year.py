def check_leap_year(year):
    if year % 400 == 0:
        return True
    elif year % 100 == 0:
        return False
    elif year % 4 == 0:
        return True
    else:
        return False

given_year = int(input("Please enter a year: "))

if check_leap_year(given_year):
    print(given_year, "is a leap year.")
else:
    print(given_year, "is not a leap year.")