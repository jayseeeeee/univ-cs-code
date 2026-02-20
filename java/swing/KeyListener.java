import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

void main() {

    // KeyListener - Handle keyboard events on component and only works when it has focus
    // Useful for low-level keyboard input but less flexible than Key Bindings

    JFrame frame = new JFrame("Key Listener");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(512,512);
    frame.setLocationRelativeTo(null);
    frame.setLayout(null);

    Image elevenImage = new ImageIcon("java/swing/assets/eleven_full.png").getImage().getScaledInstance(70, 128, Image.SCALE_SMOOTH);
    ImageIcon elevenIcon = new ImageIcon(elevenImage);

    JLabel label = new JLabel(elevenIcon);
    label.setBounds(100, 100, 70, 128);

    // KeyListener only works if frame itself has focus
    frame.addKeyListener(new KeyListener() {
        // KeyTyped - Fired when a key that produces a character is typed.
        // Uses getKeyChar() → returns the actual character (e.g., 'a', 'w', 's', 'd').
        @Override
        public void keyTyped(KeyEvent e) {
            switch(e.getKeyChar()) {
                case 'a' -> label.setLocation(label.getX() - 10, label.getY());
                case 'w' -> label.setLocation(label.getX(), label.getY() - 10);
                case 's' -> label.setLocation(label.getX(), label.getY() + 10);
                case 'd' -> label.setLocation(label.getX() + 10, label.getY());
            }
        }

        // KeyPressed - Fired when a physical key is pressed down
        // Uses getKeyCode() → returns an integer constant (e.g., VK_LEFT = 37).
        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
                case KeyEvent.VK_LEFT -> label.setLocation(label.getX() - 10, label.getY());
                case KeyEvent.VK_UP -> label.setLocation(label.getX(), label.getY() - 10);
                case KeyEvent.VK_RIGHT -> label.setLocation(label.getX() + 10, label.getY());
                case KeyEvent.VK_DOWN -> label.setLocation(label.getX(), label.getY() + 10);
            }
        }

        // KeyReleased - Fired when the key is released
        // Useful for stopping continuous actions or debugging
        @Override
        public void keyReleased(KeyEvent e) {
            // KeyReleased - Invoked when button is released
            System.out.println("You released key char: " + e.getKeyChar());
            System.out.println("You released key code: " + e.getKeyCode());
        }
    });

    frame.add(label);
    frame.setVisible(true);
}