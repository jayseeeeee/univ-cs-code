void main() {
    // Methods - Block of reusable code that is executed when called
    // Data inside parenthesis are "arguments"
    happyBirthday("Jane Hopper", 11);
    happyBirthday("Maxine Mayfield", 12);

    // Non-void methods will return a value after being called
    int finalGrade = getFinalGrade(98, 99);
    IO.println("Final Grade: " + finalGrade);

    double circumference = getCircumference(6);
    IO.println("Circumference: " + circumference);

    boolean isAdult = isAdult(14);
    IO.println("Is the current age an adult? " + isAdult);

    char letterGrade = getLetterGrade(92);
    IO.println("Letter Grade Equivalent of 92: " + letterGrade);

    String fullName = getFullname("Jane", "Hopper");
    IO.println("Full name of Eleven: " + fullName);
}

// Fields inside parenthesis are "parameters"
// Parameter data depends on data
void happyBirthday(String name, int age) {
    System.out.printf("Happy Birthday, %s!\n", name);
    System.out.printf("You are now %d years old! :)\n", age);
}

// Non-void methods must RETURN their method type
int getFinalGrade(int firstGrade, int secondGrade) {
    return (int) Math.round((firstGrade + secondGrade) / 2.0);
}

double getCircumference(double radius) {
    return Math.round(Math.PI * radius * 2 * 100.0) / 100.0;
}

boolean isAdult(int age) {
    return (age >= 18) ? true : false;
}

char getLetterGrade(double finalGrade) {
    if (finalGrade >= 96) {
        return 'A';
    } else if (finalGrade >= 90) {
        return 'B';
    } else if (finalGrade >= 86) {
        return 'C';
    } else if (finalGrade >= 75) {
        return 'D';
    } else {
        return 'F';
    }
}

String getFullname(String firstName, String lastName) {
    return firstName + " " + lastName;
}