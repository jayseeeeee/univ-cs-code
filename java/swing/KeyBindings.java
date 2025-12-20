import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

void main() {

    // Key Bindings - Bind action to KeyStroke that do not require to click a component to give focus
    // All Swing components use Key Bindings that increase flexibility compared to KeyListeners

    JFrame frame = new JFrame("Key Bindings");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(512,512);
    frame.setLocationRelativeTo(null);
    frame.setLayout(null);

    Image elevenImage = new ImageIcon("univ-cs-codes/java/swing/assets/eleven_full.png").getImage().getScaledInstance(70, 128, Image.SCALE_SMOOTH);
    ImageIcon elevenIcon = new ImageIcon(elevenImage);

    JLabel label = new JLabel(elevenIcon);
    label.setBounds(100, 100, 70, 128);

    // InputMap - Maps KeyStroke (physical key press) to a string action name
    InputMap inputMap = label.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
    // ActionMap = Maps string action name to an Action (the code to run)
    ActionMap actionMap = label.getActionMap();

    // Can assign keystrokes to individual Swing components
    inputMap.put(KeyStroke.getKeyStroke("UP"), "upAction");
    inputMap.put(KeyStroke.getKeyStroke('w'), "upAction");
    actionMap.put("upAction", new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() - 10);
        }
    });

    inputMap.put(KeyStroke.getKeyStroke("DOWN"), "downAction");
    inputMap.put(KeyStroke.getKeyStroke('s'), "downAction");
    actionMap.put("downAction", new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + 10);
        }
    });

    inputMap.put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
    inputMap.put(KeyStroke.getKeyStroke('a'), "leftAction");
    actionMap.put("leftAction", new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());
        }
    });

    inputMap.put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
    inputMap.put(KeyStroke.getKeyStroke('d'), "rightAction");
    actionMap.put("rightAction", new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
        }
    });

    frame.add(label);
    frame.setVisible(true);
}