import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

void main() {

    // JMenuBar - Top-level container that holds menus (e.g., File, Edit) for application-wide actions

    JFrame frame = new JFrame("Menu Bar");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,200);
    frame.setLocationRelativeTo(null);

    Image mikeImage = new ImageIcon("univ-cs-codes/java/swing/assets/mike.png").getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
    ImageIcon mikeIcon = new ImageIcon(mikeImage);
    Image willImage = new ImageIcon("univ-cs-codes/java/swing/assets/will.png").getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
    ImageIcon willIcon = new ImageIcon(willImage);
    Image dustinImage = new ImageIcon("univ-cs-codes/java/swing/assets/dustin.png").getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
    ImageIcon dustinIcon = new ImageIcon(dustinImage);
    Image lucasImage = new ImageIcon("univ-cs-codes/java/swing/assets/lucas.png").getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
    ImageIcon lucasIcon = new ImageIcon(lucasImage);

    // Build menu bar and menus
    JMenuBar menuBar = new JMenuBar();
    JMenu party = new JMenu("Party");
    JMenu map = new JMenu("Map");
    JMenu exit = new JMenu("Exit");

    // Create menu items and attach icons if available
    JMenuItem mike = new JMenuItem("Mike", mikeIcon);
    JMenuItem will = new JMenuItem("Will", willIcon);
    JMenuItem dustin = new JMenuItem("Dustin", dustinIcon);
    JMenuItem lucas = new JMenuItem("Lucas", lucasIcon);

    // Action listeners should be short, heavy work should be offloaded to background threads.
    exit.addActionListener(_ -> System.exit(0));
    mike.addActionListener(_ -> IO.println("You selected Mike Wheeler!"));
    will.addActionListener(_ -> IO.println("You selected Will Byers!"));
    dustin.addActionListener(_ -> IO.println("You selected Dustin Henderson!"));
    lucas.addActionListener(_ -> IO.println("You selected Lucas Sinclair!"));

    // Alt key must be pressed along with Mnemonic key to press
    party.setMnemonic(KeyEvent.VK_P);
    map.setMnemonic(KeyEvent.VK_M);
    exit.setMnemonic(KeyEvent.VK_E);

    // Key can be directly pressed after opening menu
    mike.setMnemonic(KeyEvent.VK_M);
    will.setMnemonic(KeyEvent.VK_W);
    dustin.setMnemonic(KeyEvent.VK_D);
    lucas.setMnemonic(KeyEvent.VK_L);

    // Assemble menu hierarchy
    party.add(mike);
    party.add(will);
    party.add(dustin);
    party.add(lucas);

    menuBar.add(party);
    menuBar.add(map);
    menuBar.add(exit);

    frame.setJMenuBar(menuBar);
    frame.setVisible(true);
}