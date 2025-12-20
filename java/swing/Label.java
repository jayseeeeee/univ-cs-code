import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

void main() {

    // JLabel - GUI component used to display text, images, or both

    // JLabel - Create new label through this class
    JLabel label = new JLabel(); // Text can be directly passed to constructor
    label.setText("Sorcerer - Eleven"); // Set label text

    // Get scaled down image before setting as icon to label
    Image image = new ImageIcon("univ-cs-codes/java/swing/assets/eleven.png").getImage();
    Image scaledImage = image.getScaledInstance(128, 144, Image.SCALE_SMOOTH);
    ImageIcon imageIcon = new ImageIcon(scaledImage);
    label.setIcon(imageIcon); // Set label image icon

    // Set position of image and text within the label itself
    label.setHorizontalAlignment(JLabel.CENTER); // LEFT, CENTER, RIGHT
    label.setVerticalAlignment(JLabel.CENTER); // TOP, CENTER, BOTTOM

    // Set position of text relative to the label image
    label.setHorizontalTextPosition(JLabel.CENTER); // LEFT, CENTER, RIGHT
    label.setVerticalTextPosition(JLabel.BOTTOM); // Text TOP, CENTER, BOTTOM

    // Customize font name, style, size, and color of text
    label.setFont(new Font("Times New Roman", Font.BOLD,20));
    label.setForeground(new Color(255, 0, 0));

    // Set spacing between image and text
    label.setIconTextGap(5);

    // Set background color
    label.setBackground(Color.black);
    label.setOpaque(true); // Required to apply background color

    // Add a border around the label (not the image and/or text)
    Border border = BorderFactory.createLineBorder(Color.red, 5);
    label.setBorder(border);

    // Set tooltip when mouse hovers over the label
    label.setToolTipText("This is Eleven from Stranger Things");

    // Set preferred size (optional if using layout managers)
    label.setPreferredSize(new Dimension(250, 250));

    JFrame frame = new JFrame();

    // Use null layout for absolute positioning (not recommended for complex UIs)
    frame.setLayout(null);
    label.setBounds(100, 100, 250, 250); // Set position and dimension of label within frame

    frame.add(label);
    frame.setSize(500,500);
    frame.setLocationRelativeTo(null);
    frame.setBackground(Color.darkGray);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}