void main() {
    Student max = new Student("Maxine Mayfield", "Hawkins, Indiana", 14, 'A');
    Guest eleven = new Guest("Where is Mike?");

    max.getBasicDetails();
    max.setAttendance("History");
    eleven.getBasicDetails();
    eleven.requestInquiry();
}

class Student extends Account {
    char grade;

    Student(String name, String address, int age, char grade) {
        // 'super' - Calls the superclass' attribute/method/constructor
        // It is also used for method overriding
        super(name, address, age);
        this.grade = grade;
    }

    void setAttendance(String subject) {
        System.out.printf("\n%s has attended %s class!\n", this.name, subject);
    }
}

class Guest extends Account {
    String purpose;

    Guest(String purpose) {
        // This class automatically runs 'super' with no parameters, no need to call super
        // This works since 'Account' has no-args constructor
        this.purpose = purpose;
    }

    void requestInquiry() {
        IO.readln("\nWhat would you like to ask? ");
        IO.println("Your question has been forwarded!");
    }
}

class Account {
    String name;
    String address;
    int age;

    // Constructor with no arguments runs automatically when this class is inherited
    Account() {
        this.name = "Guest";
    }

    // Constructor with arguments need to be manually called with 'super' when inherited
    Account(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    void getBasicDetails() {
        IO.println("\n***BASIC INFORMATION***");
        if (address != null) {
            System.out.printf("%s lives at %s.\n", name, address);
            System.out.printf("They are currently %d years old.\n", age);
        } else {
            IO.println("User is currently logged in as Guest");
        }
    }
}