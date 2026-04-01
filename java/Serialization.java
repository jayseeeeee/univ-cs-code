import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        // Serialization - Convert object into byte stream by saving object state after program exit
        // Deserialization - Converts byte stream back to object

        Students maxine = new Students("Maxine Mayfield", "mayfield.maxine@st.upd", "ilikelucas123", 12, 'A');

        // Serialize the object to a file
        try (
            // Create a 'FileOutputStream' to write to Students.ser
            FileOutputStream studentFile = new FileOutputStream("out/Serialization/Students.ser");
            // Wrap the file stream with an 'ObjectOutputStream' to write objects
            ObjectOutputStream studentObject = new ObjectOutputStream(studentFile)
        ) {
            // Write the object to the file
            studentObject.writeObject(maxine);
        } catch (RuntimeException e) {
            IO.println("Error: Unexpected runtime error occurred.\n" + e);
        } catch (FileNotFoundException e) {
            IO.println("Error: File not found: Please check the file path or name.\n" + e);
        } catch (IOException e) {
            IO.println("Error: I/O error encountered while processing the file.\n" + e);
        }

        // Prepare a variable to hold the deserialized object
        Students maxineSave = null;

        // Deserialize the object from the file
        try (
            // Create a 'FileInputStream' to read from Students.ser
            FileInputStream studentFile = new FileInputStream("out/Serialization/Students.ser");
            // Wrap the file stream with an 'ObjectInputStream' to read objects
            ObjectInputStream studentObject = new ObjectInputStream(studentFile)
        ) {
            // Read the object and cast it back to Students
            maxineSave = (Students) studentObject.readObject();
        } catch (RuntimeException e) {
            IO.println("Error: Unexpected runtime error occurred.\n" + e);
        } catch (FileNotFoundException e) {
            IO.println("Error: File not found: Please check the file path or name.\n" + e);
        } catch (IOException e) {
            IO.println("Error: I/O error encountered while processing the file.\n" + e);
        } catch (ClassNotFoundException e) {
            IO.println("Error: Required class definition not found.\n" + e);
        }
        maxineSave.printDetails();
    }
}

// Serializable class representing a student
class Students implements Serializable {
    // Unique ID for serialization version control
    @Serial
    private static final long serialVersionUID = 1L;

    String name;
    String email;
    transient String password; // Marked transient to exclude from serialization
    int level;
    char standing;

    // Constructor to initialize student fields
    Students(String name, String email, String password, int level, char standing) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.level = level;
        this.standing = standing;
    }

    void printDetails() {
        IO.println("\nStudent Name: " + this.name);

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