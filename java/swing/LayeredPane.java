import javax.swing.*;
import java.awt.*;

void main() {
    // JLayeredPane = Swing container that provides third dimension for positioning components
    // Allows stacking components using depth (Z-index) for popups, drag-and-drop, overlapping visuals, etc.

    JFrame frame = new JFrame("Layered Pane");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLocationRelativeTo(null);
    frame.setLayout(null);

    // Create three overlapping labels
    JLabel redLabel = new JLabel();
    redLabel.setOpaque(true);
    redLabel.setBackground(Color.RED);
    redLabel.setBounds(50, 50, 200, 200);

    JLabel greenLabel = new JLabel();
    greenLabel.setOpaque(true);
    greenLabel.setBackground(Color.GREEN);
    greenLabel.setBounds(100, 100, 200, 200);

    JLabel blueLabel = new JLabel();
    blueLabel.setOpaque(true);
    blueLabel.setBackground(Color.BLUE);
    blueLabel.setBounds(150, 150, 200, 200);

    // Create a JLayeredPane to hold the labels
    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setBounds(0, 0, 500, 500);

    // Add labels to the layered pane with custom layer values
    // Higher layer value means closer to the front
    layeredPane.add(redLabel, Integer.valueOf(0)); // Integer value
    layeredPane.add(greenLabel, JLayeredPane.PALETTE_LAYER); // Enum value (Default, Palette, Modal, Popup, Drag)
    layeredPane.add(blueLabel, JLayeredPane.DRAG_LAYER);

    frame.add(layeredPane);
    frame.setVisible(true);
}