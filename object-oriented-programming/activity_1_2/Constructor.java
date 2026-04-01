import java.util.Scanner;

class Student {
    // variables
    String name;
    byte age;
    float grade;

    // constructor
    public Student(String name, byte age, float grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // display student details
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

void main() {
    // instantiate scanner
    Scanner input = new Scanner(System.in);

    // get user input
    System.out.print("Enter Student Name: ");
    String name = input.nextLine();

    System.out.print("Enter Age: ");
    byte age = input.nextByte();

    System.out.print("Enter Grade: ");
    float grade = input.nextFloat();

    // instantiate student
    Student myStudent = new Student(name, age, grade);

    // display input details
    System.out.println("\nStudent Information:");
    myStudent.displayStudentInfo();

    // close scanner to avoid memory leak
    input.close();
}