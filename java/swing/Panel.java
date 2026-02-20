import javax.swing.*;
import java.awt.*;

void main() {

    // JPanel - Container to group and organize other GUI components

    Image image = new ImageIcon("java/swing/assets/eleven.png").getImage();
    Image scaledImage = image.getScaledInstance(128, 144, Image.SCALE_SMOOTH);
    ImageIcon imageIcon = new ImageIcon(scaledImage);

    JLabel label = new JLabel("The Sorcerer - Eleven", imageIcon, JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.BOTTOM);
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setBounds(100, 100, 75, 75);

    JPanel redPanel = new JPanel();
    redPanel.setBackground(new Color(0xCA2128));
    redPanel.setBounds(0, 0, 250, 250);

    JPanel greenPanel = new JPanel();
    greenPanel.setBackground(Color.blue);
    greenPanel.setBounds(250, 0, 250, 250);

    JPanel blackPanel = new JPanel();
    blackPanel.setBackground(Color.green);
    blackPanel.setBounds(0, 250, 500, 1000);

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLocationRelativeTo(null);
    frame.setLayout(null);
    frame.setVisible(true);

    redPanel.add(label);
    frame.add(redPanel);
    frame.add(greenPanel);
    frame.add(blackPanel);
}