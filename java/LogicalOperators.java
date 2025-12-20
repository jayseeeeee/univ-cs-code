void main() {
    boolean isMoralCertified = true;
    boolean isHighSchoolGraduate = false;
    boolean isAlsPasser = false;
    int mathGrade = 86;
    int scienceGrade = 90;

    // Logical Operators

    // ! (Not) - Inverse of condition
    if (!isMoralCertified) {
        IO.println("Sorry, you are not eligible to enter senior high school.");

        // || (Or) - Must meet at least one condition
    } else if (isHighSchoolGraduate || isAlsPasser) {

        // && (And) - Must meet both conditions
        if (mathGrade >= 86 && scienceGrade >= 86) {

            IO.println("Congratulations, you can apply for STEM strand :)");
        } else {
            IO.println("Sorry, you cannot apply for STEM Strand :(");
        }
    } else {
        IO.println("Sorry, you must be a Grade 10 completer at minimum.");
    }
}
