void main() {
    // 'Student' and 'Faculty' class inherits 'Account' class attributes and methods
    Student dustin = new Student();
    Faculty clarke = new Faculty();

    // Superclass attributes
    dustin.name = "Dustin Henderson";
    dustin.age = 13;
    clarke.name = "Scott Clarke";
    clarke.age = 40;

    // Superclass methods
    dustin.getBasicDetails();
    clarke.getBasicDetails();

    // Subclass attributes
    dustin.level = 8;
    dustin.grade = 'A';
    clarke.position = "Science Teacher";
    clarke.salary = 3200;

    // Subclass methods
    dustin.setAttendance("Science");
    dustin.setAttendance("Chemistry");
    clarke.timeIn();
    clarke.timeOut();
}

// Inheritance - One class inherits the attributes and methods from another class.
// This is achieved through the 'extends' keyword to another class

// 'Student' and 'Faculty' are the child classes while 'Account' is the parent class

// 'Student' class is inheriting everything from the 'Account' class
class Student extends Account {
    int level;
    char grade;
    boolean hasAttended;

    void setAttendance(String subject) {
        hasAttended = true;
        System.out.printf("\n%s is currently attending %s!\n", name, subject);
    }
}

// 'Faculty' class is inheriting everything from the 'Account' class
class Faculty extends Account {
    String position;
    int salary;
    boolean isWorking;

    void timeIn() {
        isWorking = true;
        System.out.printf("\n%s has started working for the day!\n", name);
    }

    void timeOut() {
        isWorking = false;
        System.out.printf("\n%s has finished his shift for the day!\n", name);
    }
}

// This is the parent class, any changes here will reflect to child class
class Account {
    String name;
    String address = "Hawkins, Indiana"; // This will reflect to all child classes as well
    int age;

    void getBasicDetails() {
        System.out.println("\n***BASIC INFORMATION***");
        System.out.printf("%s lives at %s.\n", name, address);
        System.out.printf("They are currently %d years old.\n", age);
    }
}