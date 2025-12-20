import javax.swing.*; // Import Swing library for GUI dialogs
import java.awt.*;

void main() {

    // JOptionPane - Show a pop-up dialog message that can also prompt users for input

    // Plain message (no icon)
    JOptionPane.showMessageDialog(null, "Welcome, Party Member to the Upside Down!", "Plain Message", JOptionPane.PLAIN_MESSAGE);

    // Information message (blue 'i' icon)
    JOptionPane.showMessageDialog(null, "Mornings are for coffee and contemplation.", "Information", JOptionPane.INFORMATION_MESSAGE);

    // Question message (question mark icon)
    JOptionPane.showMessageDialog(null, "Why do you lie?", "Question", JOptionPane.QUESTION_MESSAGE);

    // Warning message (yellow triangle icon)
    JOptionPane.showMessageDialog(null, "Your time is almost at an end.", "Warning", JOptionPane.WARNING_MESSAGE);

    // Error message (red 'X' icon)
    JOptionPane.showMessageDialog(null, "YOU LIEEEEE!", "Error", JOptionPane.ERROR_MESSAGE);

    // Input Dialog - Prompt to enter text as String
    String name = JOptionPane.showInputDialog("Enter your name:");

    // Text to Numbers - Prompt to enter text then convert from String to number
    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in cm:"));

    // Message Dialog - Display message using String
    JOptionPane.showMessageDialog(null, String.format("""
            Hello, %s!
            You are currently %d years old.
            Current height: %.1fcm""", name, age, height));

    // Confirm Dialog – Displays a pop-up with 'Yes/No' or 'Yes/No/Cancel' buttons.
    Image trance = new ImageIcon("univ-cs-codes/java/swing/assets/max_trance.png").getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
    ImageIcon tranceIcon = new ImageIcon(trance);
    int answer = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
    int confirm = JOptionPane.showConfirmDialog(null, "Do you accept the risks?", "Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, tranceIcon); // 'ImageIcon' replaces 'MessageType' icon
    if (confirm == JOptionPane.NO_OPTION) {
        System.exit(0); // Exit the program
    }

    // Option Dialog – Displays a pop-up of selectable predefined list of options.
    ImageIcon icon = new ImageIcon("univ-cs-codes/java/swing/assets/logo.jpg");
    String[] party = {"Mike", "Dustin", "Lucas", "Will", "Eleven", "Max"};
    String member = JOptionPane.showInputDialog(
            null,
            "Choose your favorite member of the party:",
            "Party Selection",
            JOptionPane.QUESTION_MESSAGE,
            icon,
            party, // Options to show
            party[1] // Default selected option
    ).toString();
    JOptionPane.showMessageDialog(null, "You selected: " + member);

    // Input Validation - Ensure a number is entered correctly
    int luckyNumber = 0;
    while (true) {
        try {
            luckyNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter your lucky number:"));
            break;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number.");
        }
    }
    JOptionPane.showMessageDialog(null, "Your lucky number is: " + luckyNumber);
}