import javax.swing.*;
import java.awt.*;

void main() {

    // JRadioButton - Two-state button (selected or not), usually grouped to enforce mutual exclusivity

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());

    Image mike = new ImageIcon("univ-cs-codes/java/swing/assets/mike.png").getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
    ImageIcon mikeIcon = new ImageIcon(mike);
    Image will = new ImageIcon("univ-cs-codes/java/swing/assets/will.png").getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
    ImageIcon willIcon = new ImageIcon(will);
    Image dustin = new ImageIcon("univ-cs-codes/java/swing/assets/dustin.png").getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
    ImageIcon dustinIcon = new ImageIcon(dustin);
    Image lucas = new ImageIcon("univ-cs-codes/java/swing/assets/lucas.png").getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
    ImageIcon lucasIcon = new ImageIcon(lucas);

    JRadioButton mikeButton = new JRadioButton("Mike");
    JRadioButton willButton = new JRadioButton("Will");
    JRadioButton dustinButton = new JRadioButton("Dustin");
    JRadioButton lucasButton = new JRadioButton("Lucas");

    // ButtonGroup - ensures only ONE radio button in the group can be selected at a time
    // Without ButtonGroup, each radio button behaves independently like checkboxes
    ButtonGroup group = new ButtonGroup();
    group.add(mikeButton);
    group.add(willButton);
    group.add(dustinButton);
    group.add(lucasButton);

    mikeButton.addActionListener(e ->
            JOptionPane.showMessageDialog(null,
                    "You selected Mike Wheeler!",
                    "Character Selection",
                    JOptionPane.PLAIN_MESSAGE,
                    mikeIcon));

    willButton.addActionListener(e ->
            JOptionPane.showMessageDialog(null,
                    "You selected Will Byers!",
                    "Character Selection",
                    JOptionPane.PLAIN_MESSAGE,
                    willIcon));

    dustinButton.addActionListener(e ->
            JOptionPane.showMessageDialog(null,
                    "You selected Dustin Henderson!",
                    "Character Selection",
                    JOptionPane.PLAIN_MESSAGE,
                    dustinIcon));

    lucasButton.addActionListener(e ->
            JOptionPane.showMessageDialog(null,
                    "You selected Lucas Sinclair!",
                    "Character Selection",
                    JOptionPane.PLAIN_MESSAGE,
                    lucasIcon));

    mikeButton.setIcon(mikeIcon);
    willButton.setIcon(willIcon);
    dustinButton.setIcon(dustinIcon);
    lucasButton.setIcon(lucasIcon);

    frame.add(mikeButton);
    frame.add(willButton);
    frame.add(dustinButton);
    frame.add(lucasButton);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}