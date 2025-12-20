import javax.swing.*;
import java.awt.*;

void main() {

    // GridLayout - Places components in a grid of equally sized cells
    // Each component fills its entire cell regardless of component size

    JFrame frame = new JFrame("Grid Layout");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLocationRelativeTo(null);

    // Set GridLayout with rows, columns, horizontal and vertical gaps
    frame.setLayout(new GridLayout(3, 3, 10, 10));

    // Add buttons to the grid
    // Components are added left to right, top to bottom
    for (int i = 1; i <= 9; i++) {
        frame.add(new JButton("Button " + i));
    }

    frame.setVisible(true);
}