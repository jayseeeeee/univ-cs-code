void main() {

    // Object - An entity that holds data (attributes) and can perform actions (methods)
    // It is a reference data type

    // 'new' is used to create an object/copy of the class
    Student eleven = new Student();
    Student max = new Student();

    // Manual initializing of object fields
    eleven.school = "Lenora Hills High School";
    eleven.firstName = "Jane";
    eleven.lastName = "Hopper";
    eleven.age = 14;
    eleven.level = 9;
    max.school = "Hawkins High School";
    max.firstName = "Maxine";
    max.lastName = "Mayfield";
    max.age = 14;
    max.level = 9;

    // Calling object methods
    max.getStudentDetails();
    eleven.setFinalGrade(75, 94, 90, 92, 87, 75);
    eleven.getStudentDetails();
}

// This serves as the 'Blueprint' for creating objects
class Student {

    // The data/attributes/fields the object should bave
    String school;
    String firstName;
    String lastName;
    int age;
    int level;
    char grade = '?'; // By setting data, it will be the default value for all created objects

    // The actions/methods the object can do
    void getStudentDetails() {
        System.out.printf("\nStudent Name: %s, %s\n", this.lastName, this.firstName);
        System.out.printf("Age: %d years old\n", this.age);
        System.out.printf("School: %s\n", this.school);
        System.out.printf("Grade Level: %d\n", this.level);
        System.out.printf("Grade: %c\n", this.grade);
    }

    void setFinalGrade(int ... grades) {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        total /= grades.length;
        if (total >= 90) {
            this.grade = 'A';
        } else if (total >= 86) {
            this.grade = 'B';
        } else if (total >= 80) {
            this.grade = 'C';
        } else if (total >= 75) {
            this.grade = 'D';
        } else {
            this.grade = 'F';
        }
    }
}