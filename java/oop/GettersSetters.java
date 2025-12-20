public class GettersSetters {
    public static void main(String[] args) {

        Student eleven = new Student("Jane", "Hopper", "Transferee", 9);

        System.out.printf("\nStudent Name: %s\n", eleven.getFullName());
        System.out.printf("Status: %s\n", eleven.getType());
        System.out.printf("Grade Level: %d\n", eleven.getLevel());

        eleven.setPresent("Math");
        eleven.setPresent("Science");

        System.out.println("\n***FAILING GRADE EXAMPLE***");
        eleven.setGrade(75, 82, 65, 62, 67, 75);
        System.out.printf("Grade Standing: %c", eleven.getGrade());
        eleven.setLevel(eleven.getGrade());
        System.out.printf("Grade Level: %d\n", eleven.getLevel());

        System.out.println("\n***PASSING GRADE EXAMPLE***");
        eleven.setGrade(92, 82, 86, 99, 96, 93);
        System.out.printf("Grade Standing: %c", eleven.getGrade());
        eleven.setLevel(eleven.getGrade());
        System.out.printf("Grade Level: %d\n", eleven.getLevel());
    }
}

class Student {
    // 'private' makes attribute/method inaccessible outside of this class
    // 'final' makes attribute unchangeable after being assigned a value
    final private String firstName;
    final private String lastName;
    final private String type;
    private int level;
    private char grade;
    private boolean isPresent;

    Student(String firstName, String lastName, String type, int level) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.level = level;
    }

    // 'Getters' and 'Setters' - Protect object data and add rules for accessing or modifying them
    // Utilizes encapsulation which allows certain attribute to be hidden from user
    // 'Getters' - Methods that make a field readable
    // 'Setters' - Methods that make a field writeable
    String getFullName() { // Prevents users from accessing 'firstName' and 'lastName' attributes
        return firstName + " " + lastName;
    }

    String getType() {
        return type;
    }

    int getLevel() {
        return level;
    }

    void setLevel(char grade) {
        switch (grade) {
            case 'A', 'B', 'C', 'D' -> {
                level += 1;
                System.out.printf("\nStudent has been promoted to Grade %d!\n", level);
            }
            default -> System.out.printf("\n%s is at failing grade! Student will be retained!\n", getFullName());
        }
    }

    char getGrade() {
        return grade;
    }

    void setGrade(int... grades) {
        int total = 0;
        for (int grade : grades) {
            if (grade < 0 || grade > 100) {
                IO.println("Error: Grade out of range!");
            } else {
                total += grade;
            }
        }
        total /= grades.length;
        if (total > 96) {
            grade = 'A';
        } else if (total > 90) {
            grade = 'B';
        } else if (total > 86) {
            grade = 'C';
        } else if (total > 75) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    void setPresent(String course) {
        if (course == null) {
            if (isPresent) {
                isPresent = false;
                System.out.printf("\n%s has left the school campus!\n", getFullName());
            } else {
                System.out.printf("\n%s did not go to the school campus today!\n", getFullName());
            }
        } else {
            if (!isPresent) {
                isPresent = true;
                System.out.printf("\n%s has attended their first course, %s!\n", getFullName(), course);
            } else {
                System.out.printf("\n%s has attended their next course, %s!\n", getFullName(), course);
            }
        }
    }
}