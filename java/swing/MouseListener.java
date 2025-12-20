import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

void main() {
    JFrame frame = new JFrame("Mouse Listener");
    JLabel label = new JLabel();
    frame.setSize(512,512);

    label.setBounds(0, 0, 100, 100);
    label.setFont(new Font("Times New Roman", Font.BOLD, 64));
    label.setBackground(Color.black);
    label.setForeground(Color.red);
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setOpaque(true);
    label.addMouseListener(new java.awt.event.MouseListener() {
        // Called when mouse button is clicked (pressed + released)
        @Override
        public void mouseClicked(MouseEvent e) {
            label.setText("Mouse Clicked");
        }

        // Called when mouse button is pressed down
        @Override
        public void mousePressed(MouseEvent e) {
            label.setText("Mouse Pressed");
        }

        // Called when mouse button is released
        @Override
        public void mouseReleased(MouseEvent e) {
            label.setText("Mouse Released");
        }

        // Called when mouse enters the label’s area
        @Override
        public void mouseEntered(MouseEvent e) {
            label.setText("Mouse Entered");
        }

        // Called when mouse exits the label’s area
        @Override
        public void mouseExited(MouseEvent e) {
            label.setText("Mouse Exited");
        }
    });

    label.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            label.setText("Clicked!");
        }
    });

    frame.add(label);
    frame.setVisible(true);
}