import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// A simple JFrame example with a button and a text field
void main() {

    // JTextField = A GUI textbox component that can be used to add, set, or get text

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());

    JTextField textField = new JTextField();
    textField.setPreferredSize(new Dimension(250, 40));
    textField.setFont(new Font("Times New Roman", Font.ITALIC, 32));
    textField.setForeground(Color.red);
    textField.setBackground(Color.black);

    JButton button = new JButton("Submit");
    button.addActionListener(e -> {
        // Retrieve text from the text field
        String input = textField.getText();

        // Show the input in a message dialog.
        JOptionPane.showMessageDialog(null, "You entered: " + input);
        textField.setEditable(false);
    });

    // Set caret (cursor) color - red
    textField.setCaretColor(Color.red);
    // Set default text inside the field
    textField.setText("Jane Hopper");

    frame.add(button);
    frame.add(textField);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}