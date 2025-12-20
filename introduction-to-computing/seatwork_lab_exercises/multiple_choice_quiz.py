QUESTIONS = [
    "1. Which country was the first to colonize the Philippines?",
    "2. Who was the first president of the Philippines Republic?",
    "3. When did the Philippine Revolution begin?",
    "4. Who is the national hero of the Philippines?",
    "5. Which book did Rizal wrote dedicated to the GomBurZa priests"
]

ANSWER_CHOICES = [
    ["Spain", "United States", "Japan", "China"],
    ["Antonio Luna", "Andres Bonifacio", "Emilio Aguinaldo", "Apolinario Mabini"],
    ["1869", "1896", "1898", "1899"],
    ["Andres Bonifacio", "Jose Rizal", "Marcelo H. del Pilar", "Emilio Aguinaldo"],
    ["Isang Kaibigan", "El Filibusterismo", "Noli Me Tangere", "Quran"]
]

ANSWER_KEY = ["Spain", "Emilio Aguinaldo", "1896", "Jose Rizal", "El FIlibusterismo"]
score = 0

print("==================================================")
print("Readings in the Philippine History: Quiz")
print("Quiz Difficulty - Easy")
print("==================================================")
input("If you are ready, enter any key to continue: ")
print("==================================================")

for index, question in enumerate(QUESTIONS):
    print(question)
    # Display choices properly
    for answer_key in ANSWER_CHOICES[index]:
        print(answer_key, end=", ")
    print()
    print("==================================================")
    answer = input("Please enter your answer: ")
    print("==================================================")
    if answer.upper() == ANSWER_KEY[index].upper():
        score += 1

print("==================================================")
print(f"Your total score is {score}/5")
print("==================================================")
        