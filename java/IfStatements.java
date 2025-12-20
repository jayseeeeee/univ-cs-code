void main() {
    int age = 60;
    String ageGroup;
    boolean isPwd = false;

    // If Statement - Performs a block of code if condition is true
    if (age >= 60) {
        ageGroup = "Senior Citizen";
    } else if (age >= 18) {
        ageGroup = "Adult";
    } else if (age >= 13) {
        ageGroup = "Teenager";
    } else if (age > 3) {
        ageGroup = "Kid";
    } else if (age > 0) {
        ageGroup = "Baby";
    } else {
        ageGroup = "Fetus";
    }
    System.out.printf("Age Group of %d: %s\n", age, ageGroup);

    // Nested If Statements
    if (age >= 60 || age <= 13) {
        if (isPwd) {
            IO.println("Congratulations! Your entry fee is FREE!");
        } else {
            IO.println("Your entrance fee has a small discount.");
        }
    } else {
        if (isPwd) {
            IO.println("Your entrance fee has a large discount!");
        } else {
            IO.println("Sorry! No discounts to avail :()");
        }
    }

}
