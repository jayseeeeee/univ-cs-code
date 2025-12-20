void main() {
    Student lucas = new Student("Lucas", "Sinclair",  "Continuing", 13, 7);
    Student max = new Student("Maxine", "Mayfield", "Transferee", 13, 7);
    // When Java tries to print an object, it will call the 'toString' method of the object
    IO.println(lucas);
    IO.println(max);
}

// All classes are subclass of the 'Object' superclass
// This means they also inherit the 'toString' method
class Student {
    String firstName;
    String lastName;
    String type;
    int age;
    int level;

    public Student(String firstName, String lastName, String type, int age, int level) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.age = age;
        this.level = level;
    }

    // By default, Java returns a unique hashcode identifier for the object
    // This can be overridden to return a meaningful detail instead
    @Override
    public String toString() {
        return String.format("""
        ***STUDENT INFORMATION***
        Full Name: %s, %s
        Student Type: %s
        Grade Level: %d
        Age: %d
        """, lastName, firstName, type, level, age);
    }
}