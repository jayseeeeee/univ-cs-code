import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

void main() {
    JFrame frame = new JFrame();
    frame.setSize(800, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setLayout(null);

    Image image = new ImageIcon("univ-cs-codes/java/swing/assets/eleven.png").getImage();
    Image scaledImage = image.getScaledInstance(128, 144, Image.SCALE_SMOOTH);
    ImageIcon imageIcon = new ImageIcon(scaledImage);

    // Create a custom button (TopButton extends JButton and implements ActionListener)
    TopButton topButton = new TopButton();
    topButton.setBounds(300, 50, 200, 50);
    topButton.setText("Eleven");
    topButton.setIcon(imageIcon);
    topButton.setFocusable(false);
    topButton.setIconTextGap(-20);
    topButton.setFont(new Font("Times New Roman",Font.BOLD,14));
    topButton.setForeground(Color.red);
    topButton.setBackground(Color.black);
    topButton.setBorder(BorderFactory.createEtchedBorder());
    topButton.addActionListener(topButton);

    // Create a standard JButton with an anonymous ActionListener
    JButton leftButton = new JButton();
    leftButton.setBounds(150, 200, 200, 50);
    leftButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent event) {
            new Thread() {
                @Override
                public void run() {
                    leftButton.setText("Left button clicked!");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    leftButton.setText("");
                }
            }.start();
        }
    });

    // Create another JButton using lambda for concise event handling
    JButton rightButton = new JButton();
    rightButton.setBounds(450, 200, 200, 50);
    rightButton.addActionListener(_ -> System.out.println("Right Button Clicked"));

    JButton bottomButton = new JButton("Exit");
    bottomButton.setBounds(300, 350, 200, 50);
    bottomButton.addActionListener(_ -> frame.dispose()); // Exits frame

    frame.add(topButton);
    frame.add(leftButton);
    frame.add(rightButton);
    frame.add(bottomButton);

    frame.setVisible(true);
}

class TopButton extends JButton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        setText("Jane Hopper");
    }
}