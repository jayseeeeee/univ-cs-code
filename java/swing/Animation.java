import javax.swing.*;
import java.awt.*;
import java.util.Timer;

void main() {

    // 2D Animation - Update object position/rotation then repaint with timer for smooth motion

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new MyPanel());
    frame.pack();
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}

class MyPanel extends JPanel {
    int xVelocity = 1;
    int yVelocity = 1;
    int x = new Random().nextInt(314);
    int y = new Random().nextInt(314);
    double angle = 0; // Rotation angle in radians

    Image demogorgon = new ImageIcon("java/swing/assets/demogorgon_head.png").getImage();
    Image iconSize = demogorgon.getScaledInstance(106, 128, Image.SCALE_SMOOTH);
    Image background = new ImageIcon("java/swing/assets/alphabet_background.png").getImage();

    MyPanel() {
        setPreferredSize(new Dimension(512, 512));
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            @Override
            public void run(){
                if (x >= 512 - iconSize.getWidth(null) || x < 0) {
                    xVelocity *= -1;
                }
                if (y >= 512 - iconSize.getHeight(null) || y < 0) {
                    yVelocity = yVelocity * -1;
                }
                if (angle > 2 * Math.PI) {
                    angle = 0;
                }
                x = x + xVelocity;
                y = y + yVelocity;
                angle += Math.toRadians(1);
                repaint();
            }
        };
        timer.schedule(task, 0, 5);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        // Draw background
        g2D.drawImage(background, 0, 0, 512, 512, null);

        // Compute center of the image
        int imgW = iconSize.getWidth(null);
        int imgH = iconSize.getHeight(null);
        double centerX = x + imgW / 2.0;
        double centerY = y + imgH / 2.0;

        // Translate to image center, rotate, then draw
        g2D.translate(centerX, centerY);
        g2D.rotate(angle);
        g2D.drawImage(iconSize, -imgW / 2, -imgH / 2, imgW, imgH, null);
    }
}