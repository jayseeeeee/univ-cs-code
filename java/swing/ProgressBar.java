import javax.swing.*;
import java.awt.*;

void main() {

    // JProgressBar - Shows progress visually from min to max values

    JFrame frame = new JFrame("Progress Bar");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 100);
    frame.setLocationRelativeTo(null);

    JProgressBar progressBar = new JProgressBar(0,100); // Constructor args: min = 0, max = 100
    progressBar.setValue(0); // Initial value
    progressBar.setStringPainted(true); // Display percentage string inside the bar

    // Customize font and colors
    progressBar.setFont(new Font("Helvetica",Font.BOLD,25));
    progressBar.setForeground(Color.red);
    progressBar.setBackground(Color.black);

    frame.add(progressBar);
    frame.setVisible(true);

    int counter = 0;
    while(counter <= 100) {
        progressBar.setValue(counter);
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        counter +=1;
    }
    progressBar.setString("Loading Done");
}