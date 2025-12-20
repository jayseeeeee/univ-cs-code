void main() {
    Student guest = new Student();
    Student eleven = new Student("Jane Hopper", "hopper.jane@st.upd", "ilikemike23");
    Student maxine = new Student("Maxine Mayfield", "mayfield.maxine@st.upd", "ilikelucas123", 12, 'A');

    guest.printDetails();
    eleven.printDetails();
    maxine.printDetails();
}

class Student {
    String name;
    String email;
    String password;
    int level;
    char standing;

    // Constructor - A special method to initialize/create objects named after the class
    // Arguments can be passed to a constructor and set up initial values
    Student() {
        this.name = "Guest";
        this.email = null;
        this.password = null;
        this.level = -1;
        this.standing = 0;
    }

    // Overloaded Constructors - Allows class to have multiple constructors with different parameters.
    // This enables objects to be initialized in various ways.
    Student(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.level = 0;
        this.standing = 0;
    }

    Student(String name, String email, String password, int level, char standing) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.level = level;
        this.standing = standing;
    }

    void printDetails() {
        if (email != null) {
            IO.println("\nStudent Name: " + this.name);
        } else {
            IO.println("\nUser logged in as Guest!");
        }

        if (level == 0) {
            IO.println("Kindergarten Student");
        } else if (level >= 1) {
            System.out.printf("Grade %s Student\n", this.level);
        }

        if (standing != 0) {
            IO.println("Academic Standing: " + this.standing);
        }
    }
}
