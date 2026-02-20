import javax.swing.*;
import java.awt.*;

void main() {

    // FlowLayout - Places components in a row, sized at their preferred size
    // If the horizontal space is insufficient, it wraps to the next row

    JFrame frame = new JFrame("FlowLayout");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLocationRelativeTo(null);

    JPanel panel = new JPanel();
    panel.setPreferredSize(new Dimension(150, 200));
    panel.setBackground(Color.gray);

    // Set FlowLayout alignment to LEFT CENTER, RIGHT
    panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // FlowLayout is the default layout manager for JPanel

    // Add buttons to the frame and placed in a row, wrapping if needed
    for (int i = 1; i <= 20; i++) {
        JButton newButton = new JButton(String.valueOf(i));
        newButton.setPreferredSize(new Dimension(50, 15)); // Set preferred size when using FlowLayout
        panel.add(newButton);
    }

    frame.add(panel, BorderLayout.NORTH);
    frame.setVisible(true);
}