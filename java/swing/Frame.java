import javax.swing.*;
import java.awt.*;

void main() {
    // Create a new JFrame instance — this is the main window container
    JFrame frame = new JFrame("My Awesome Program");

    // Define what happens when the user closes the window
    // 'EXIT_ON_CLOSE' will terminate the entire application
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 'HIDE_ON_CLOSE' is default

    // Prevent the user from resizing the window manually
    frame.setResizable(false);

    // Set the dimensions of the window
    frame.setSize(600, 400);

    // Set the layout manager to null for absolute positioning
    // Can be set to BorderLayout (default), FlowLayout, GridLayout, etc. for dynamic layouts
    frame.setLayout(null);

    // Set the window's position on screen
    frame.setLocation(300, 200);

    // Center the window on the screen (overrides setLocation)
    frame.setLocationRelativeTo(null);

    // Set the window icon using an image file
    ImageIcon icon = new ImageIcon("univ-cs-codes/java/swing/assets/logo.jpg"); // Ensure this file exists
    frame.setIconImage(icon.getImage());

    // Set the background color of the content pane
    frame.getContentPane().setBackground(new Color(0x123456)); // Hexadecimal color values
    frame.getContentPane().setBackground(new Color(0, 0, 0)); // RGB values
    frame.getContentPane().setBackground(Color.red); // Enum color

    // Set the window to always stay on top of other windows
    frame.setAlwaysOnTop(true);

    // Change the mouse cursor when hovering over the frame
    frame.setCursor(new Cursor(Cursor.HAND_CURSOR));

    // Make the window visible on the screen
    frame.setVisible(true);

    // Remove window decorations for borderless window (title bar, borders)
    // frame.setUndecorated(true);

    // Set the window's opacity for semi-transparent window, only works if undecorated and supported by OS
    // frame.setOpacity(0.85f); // Value between 0.0 (fully transparent) and 1.0 (fully opaque)

    // Maximize the window (optional)
    // frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

    // Minimize the window (optional)
    // frame.setState(Frame.ICONIFIED);

    // Automatically size the window based on its contents (if layout manager is used)
    // frame.pack();

    MyProgram myProgram = new MyProgram();
}

// JFrame can be extended instead for convenience and readability
class MyProgram extends JFrame {

    // Same output as creating new JFrame instance
    MyProgram () {
        setTitle("My Awesome Program"); // Set the title of the window (appears in the title bar)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(600, 400);
        setLayout(null);
        setLocation(300, 200);
        setLocationRelativeTo(null);
        setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        getContentPane().setBackground(new Color(0, 0, 0));

        ImageIcon icon = new ImageIcon("univ-cs-codes/java/swing/assets/logo.jpg");
        setIconImage(icon.getImage());

        setVisible(true);
    }
}