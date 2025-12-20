import javax.swing.*;
import java.awt.*;

void main() {
    JFrame frame = new JFrame("Color Chooser");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());

    JLabel label = new JLabel("STRANGER THINGS", SwingConstants.CENTER);
    label.setBackground(Color.white);
    label.setText("STRANGER THINGS");
    label.setFont(new Font("Times New Roman",Font.PLAIN,64));
    label.setOpaque(true);

    // Reusable chooser instance (optional) — can be embedded or used via static dialog
    JColorChooser colorChooser = new JColorChooser();

    JButton bgButton = new JButton("Set Background Color");
    bgButton.addActionListener(e -> {
        // showDialog returns null if user cancels; always check before applying
        Color chosen = JColorChooser.showDialog(frame, "Background Color", label.getBackground());
        if (chosen != null) {
            label.setBackground(chosen);
        } else {
            System.out.println("Background selection cancelled.");
        }
    });

    JButton fgButton = new JButton("Set Text Color");
    fgButton.addActionListener(e -> {
        Color chosen = JColorChooser.showDialog(frame, "Text Color", label.getForeground());
        if (chosen != null) {
            label.setForeground(chosen);
        } else {
            System.out.println("Text color selection cancelled.");
        }
    });

    frame.add(bgButton);
    frame.add(fgButton);
    frame.add(label);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}