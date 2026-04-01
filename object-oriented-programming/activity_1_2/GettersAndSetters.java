import java.util.Scanner;

class Student {
    // variables
    private String name;
    private byte age;
    private float grade;

    // constructor
    public Student(String name, byte age, float grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // setter & getter for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // setter & getter for age
    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return age;
    }

    // setter & getter for grade
    public void setGrade(float grade) {
        this.grade = grade;
    }

    public float getGrade() {
        return grade;
    }

    // display student details
    void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

void main() {
    // instantiate scanner
    Scanner input = new Scanner(System.in);

    // get initial input
    System.out.print("Enter Student Name: ");
    String name = input.nextLine();

    System.out.print("Enter Age: ");
    byte age = input.nextByte();

    System.out.print("Enter Grade: ");
    float grade = input.nextFloat();

    // instantiate student
    Student myStudent = new Student(name, age, grade);

    // display initial details
    System.out.println("\nStudent Information:");
    myStudent.displayStudentInfo();

    // update grade
    System.out.print("\nEnter New Grade: ");
    myStudent.setGrade(input.nextFloat());

    // display updated details
    System.out.println("Updated Student Information:");
    myStudent.displayStudentInfo();

    // close scanner to avoid memory leak
    input.close();
}