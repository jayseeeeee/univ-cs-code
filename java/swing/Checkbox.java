import javax.swing.*;
import java.awt.*;

void main() {

    // JCheckBox = A GUI component that can be selected or deselected

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());

    Image normalImage = new ImageIcon("java/swing/assets/max_normal.png").getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
    ImageIcon normalIcon = new ImageIcon(normalImage);
    Image tranceImage = new ImageIcon("java/swing/assets/max_trance.png").getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
    ImageIcon tranceIcon = new ImageIcon(tranceImage);

    JCheckBox checkBox = new JCheckBox();
    checkBox.setText("Do you accept the risks?");
    checkBox.setFocusable(false);
    checkBox.setFont(new Font("Times New Roman",Font.BOLD, 12));
    checkBox.setIcon(normalIcon);
    checkBox.setSelectedIcon(tranceIcon);

    JButton button = new JButton();
    button.setText("I accept.");
    button.addActionListener(_ -> System.out.println(checkBox.isSelected()));

    frame.add(button);
    frame.add(checkBox);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}