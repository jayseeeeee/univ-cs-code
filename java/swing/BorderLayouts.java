import javax.swing.*;
import java.awt.*;

void main() {

    // BorderLayout - Places components in five areas: NORTH, SOUTH, WEST, EAST, CENTER
    // All extra space is placed in the center area

    JFrame frame = new JFrame("BorderLayout");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLocationRelativeTo(null);

    // Set BorderLayout with horizontal and vertical gaps
    frame.setLayout(new BorderLayout(10, 10)); // BorderLayout is the default layout manager for JFrames

    // Create five main panels representing the five BorderLayout regions
    JPanel panelNorth = new JPanel();
    JPanel panelWest = new JPanel();
    JPanel panelEast = new JPanel();
    JPanel panelSouth = new JPanel();
    JPanel panelCenter = new JPanel(); // This will contain sub-panels

    panelNorth.setBackground(Color.RED);
    panelWest.setBackground(Color.GREEN);
    panelEast.setBackground(Color.YELLOW);
    panelSouth.setBackground(Color.MAGENTA);
    panelCenter.setBackground(Color.BLUE);

    // Set preferred sizes for edge panels
    panelNorth.setPreferredSize(new Dimension(100, 100)); // Height for NORTH
    panelSouth.setPreferredSize(new Dimension(100, 100)); // Height for SOUTH
    panelWest.setPreferredSize(new Dimension(150, 100));  // Width for WEST
    panelEast.setPreferredSize(new Dimension(150, 100));  // Width for EAST
    panelCenter.setPreferredSize(new Dimension(100, 100)); // CENTER fills remaining space

    // Add main panels to the frame using BorderLayout positions
    frame.add(panelNorth, BorderLayout.NORTH);
    frame.add(panelWest, BorderLayout.WEST);
    frame.add(panelEast, BorderLayout.EAST);
    frame.add(panelSouth, BorderLayout.SOUTH);
    frame.add(panelCenter, BorderLayout.CENTER);

    // Set BorderLayout for the center panel to nest sub-panels
    panelCenter.setLayout(new BorderLayout());

    // Create sub-panels to demonstrate nested BorderLayout
    JPanel subPanelNorth = new JPanel();
    JPanel subPanelSouth = new JPanel();
    JPanel subPanelWest = new JPanel();
    JPanel subPanelEast = new JPanel();
    JPanel subPanelCenter = new JPanel();

    // Set background colors for sub-panels
    subPanelNorth.setBackground(Color.BLACK);
    subPanelSouth.setBackground(Color.DARK_GRAY);
    subPanelWest.setBackground(Color.GRAY);
    subPanelEast.setBackground(Color.LIGHT_GRAY);
    subPanelCenter.setBackground(Color.WHITE);

    // Set preferred sizes for sub-panels
    subPanelNorth.setPreferredSize(new Dimension(50, 50));
    subPanelSouth.setPreferredSize(new Dimension(50, 50));
    subPanelWest.setPreferredSize(new Dimension(50, 50));
    subPanelEast.setPreferredSize(new Dimension(50, 50));
    subPanelCenter.setPreferredSize(new Dimension(50, 50));

    // Add sub-panels to the center panel using BorderLayout
    panelCenter.add(subPanelNorth, BorderLayout.NORTH);
    panelCenter.add(subPanelSouth, BorderLayout.SOUTH);
    panelCenter.add(subPanelWest, BorderLayout.WEST);
    panelCenter.add(subPanelEast, BorderLayout.EAST);
    panelCenter.add(subPanelCenter, BorderLayout.CENTER);

    // Make the frame visible
    frame.setVisible(true);
}