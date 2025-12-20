void main() {
    Student dustin = new Student("Dustin Henderson");
    Faculty clarke = new Faculty("Scott Clarke");

    dustin.setAttendance("Science");
    dustin.getDetails();
    clarke.setAttendance("RM 431");
    clarke.getDetails();
}

class Student extends Account {
    Student(String name) {
        super(name);
    }

    @Override
    void setAttendance(String subject) {
        System.out.printf("\n%s has attended their %s class today!\n", this.name, subject);
    }
}

class Faculty extends Account {
    Faculty(String name) {
        super(name);
    }

    @Override
    void setAttendance(String room) {
        System.out.printf("\n%s has completed their teaching session on %s!\n", this.name, room);
    }
}

// Abstraction - the process of hiding implementation details and showing only the essential features
// Turns a class or methods into a 'template' and guarantees that no default behavior exists
// the 'abstract' keyword can be applied to class and methods only under abstract class

// Abstract class cannot be instantiated directly (only a blueprint the predefines the behavior of a class)
// They can only be inherited by subclass
abstract class Account {
    String name;

    Account(String name) {
        this.name = name;
    }

    // Abstract methods must be overridden and implemented in subclass
    // No method body since it is only a 'template' but their data arguments must be followed
    abstract void setAttendance(String details); // Implemented methods must have 'String' arguments

    // Concrete methods are standard methods that are inherited to subclass
    void getDetails() {
        System.out.printf("\n%s is currently situated at Hawkins High!\n", this.name);
    }
}