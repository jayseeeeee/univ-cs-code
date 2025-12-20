void main() {
    Guest eleven = new Guest("Jane Hopper");
    Student max = new Student("Maxine Mayfield", "Transferee", 8);
    Faculty clarke = new Faculty("Scott Clarke", "Science Teacher", 3200);

    eleven.setAttendance("Visiting");
    max.setAttendance("Science");
    clarke.setAttendance("Science");
}

class Guest extends Account {
    Guest(String name) {
        super(name);
    }

    // Method Overriding - When a subclass provides its own implementation of a defined method from the superclass
    // Allows for code reusability and gives specific implementations
    @Override // This keyword is needed to show your overriding and prevent bugs
    void setAttendance(String purpose) {
        this.isPresent = true;
        System.out.printf("%s is currently at this school for: %s", this.name, purpose);
    }
}

class Student extends Account {
    String type;
    int level;

    Student(String name, String type, int level) {
        super(name);
        this.type = type;
        this.level = level;
    }
}

class Faculty extends Account {
    String position;
    int salary;

    Faculty(String name, String position, int salary) {
        super(name);
        this.position = position;
        this.salary = salary;
    }
}

class Account {
    String name;
    boolean isPresent;

    Account(String name) {
        this.name = name;
    }

    void setAttendance(String course) {
        isPresent = true;
        System.out.printf("%s has attended their %s class for today!", this.name, course);
    }
}