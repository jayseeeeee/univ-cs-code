import javax.swing.*;
import java.awt.*;

void main() {

    // JSlider - Component that selects numeric value by dragging knob along track

    JFrame frame = new JFrame("Slider");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JSlider slider = new JSlider(0,100,20);
    slider.setPreferredSize(new Dimension(400,200));

    // JLabel displays text for slider value
    JLabel label = new JLabel();
    label.setFont(new Font("Helvetica",Font.BOLD,12));

    JPanel panel = new JPanel();

    // Enable tick marks (minor ticks every 10 units, major ticks every 25 units)
    slider.setPaintTicks(true);
    slider.setPaintTrack(true);
    slider.setMinorTickSpacing(5);
    slider.setMajorTickSpacing(25);

    slider.setPaintLabels(true); // Enable numeric labels at tick marks
    slider.setFont(new Font("Helvetica",Font.BOLD,12)); // Set font style after enabling numeric label
    slider.setOrientation(SwingConstants.VERTICAL); // Orientation can be horizontal or vertical
    label.setText(String.format("Sugar Level: %sg", slider.getValue())); // Initialize label text with current slider value

    slider.addChangeListener(_ -> { // Add ChangeListener to update label when slider moves
        label.setText(String.format("Sugar Level: %sg", slider.getValue()));
    });

    panel.add(slider);
    panel.add(label);
    frame.add(panel, BorderLayout.CENTER);
    frame.setSize(480, 480);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}