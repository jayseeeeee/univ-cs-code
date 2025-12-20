import javax.swing.*;
import java.awt.*;

void main() {

    // JComboBox - Component that combines text field or button with drop‑down list of items.

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());

    Character[] party = {Character.Vecna, Character.Demogorgon, Character.Mike, Character.Will, Character.Dustin, Character.Lucas};
    // JComboBox is generic, specify <Character> for type safety
    JComboBox<Character> comboBox = new JComboBox<>(party);
    comboBox.setPreferredSize(new Dimension(200, 32));

    int itemCount = comboBox.getItemCount(); // Get number of items in the combo box
    comboBox.setEditable(true); // Allow to type custom values into combo box
    comboBox.setSelectedIndex(1); // Select initial selected item
    comboBox.addItem(Character.Max); // Add new item to combo box
    comboBox.insertItemAt(Character.Eleven, 6); // Insert item at specified position
    comboBox.removeItemAt(1); // Remove item at specified index
    comboBox.removeItem(Character.Vecna); // Remove specific item by value
    JOptionPane.showMessageDialog(null, "Total Party Count: " + itemCount);

    comboBox.addActionListener(_ -> {
        Character selectedItem = (Character) comboBox.getSelectedItem(); // Get selected item (cast to Character since JComboBox is generic)
        int selectedIndex = comboBox.getSelectedIndex(); // Get index of selected item
        JOptionPane.showMessageDialog(null, String.format("You selected %s at Position %d!", selectedItem, selectedIndex + 1));
        comboBox.removeAllItems(); // Clear all items from the combo box
    });

    frame.add(comboBox);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}

enum Character {
    Vecna,
    Demogorgon,
    Mike,
    Will,
    Dustin,
    Lucas,
    Max,
    Eleven
}