import javax.swing.*;
import java.awt.*;

void main() {

    // Paint - Used to draw graphics on a component and define what appears on the screen

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel() {
        @Override
        public void paint(Graphics g) {
            // Cast to unlock all the advanced features and customizability
            Graphics2D g2D = (Graphics2D) g;

            // Enable anti-aliasing for smoother graphics
            g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Draw Image
            Image background = new ImageIcon("univ-cs-codes/java/swing/assets/background.jpg").getImage();
            g2D.drawImage(background, 0, 0, 1280, 720, null);

            // Draw Line
            g2D.setPaint(Color.red);
            g2D.setStroke(new BasicStroke(5));
            g2D.drawLine(450, 550, 810, 550);
            g2D.drawLine(450, 610, 490, 610);
            g2D.drawLine(760, 610, 810, 610);

            // Draw Rectangle
            g2D.setPaint(Color.black);
            g2D.setStroke(new BasicStroke(10));
            g2D.drawRect(50, 50, 200, 100);

            // Gradient Paint
            GradientPaint gradient = new GradientPaint(300, 50, Color.BLACK, 500, 150, Color.RED, true);

            // Fill Rectangle
            g2D.setPaint(gradient);
            g2D.fillRect(300, 50, 200, 100);

            // Draw Oval
            g2D.setPaint(Color.black);
            g2D.setStroke(new BasicStroke(15));
            g2D.drawOval(50, 200, 100, 100);

            // Set Transparency
            g2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f));

            // Fill Oval
            g2D.setPaint(Color.red);
            g2D.fillOval(200, 200, 100, 100);

            // Reset Transparency
            g2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));

            // Draw Arcs
            g2D.setPaint(Color.RED);
            g2D.setStroke(new BasicStroke(5));
            g2D.drawArc(50, 350, 100, 100, 0, 90);
            g2D.drawArc(50, 350, 100, 100, 180, 90);
            g2D.setPaint(Color.BLACK);
            g2D.drawArc(50, 350, 100, 100, 90, 90);
            g2D.drawArc(50, 350, 100, 100, 270, 90);

            // Fill Arcs
            g2D.setPaint(Color.RED);
            g2D.fillArc(200, 350, 100, 100, 0, 90);
            g2D.fillArc(200, 350, 100, 100, 180, 90);
            g2D.setPaint(Color.BLACK);
            g2D.fillArc(200, 350, 100, 100, 90, 90);
            g2D.fillArc(200, 350, 100, 100, 270, 90);

            // Draw Polygon
            int[] xPoints = {50, 125, 200};
            int[] yPoints = {600, 500, 600};
            g2D.setPaint(Color.RED);
            g2D.drawPolygon(xPoints, yPoints, 3);

            // Fill Polygon
            g2D.setPaint(Color.RED);
            g2D.fillPolygon(new int[] {250, 250, 350, 350}, new int[] {500, 600, 600, 500}, 4);

            // Draw Text
            g2D.setPaint(Color.RED);
            g2D.setFont(new Font("Times New Roman",Font.BOLD,64));
            g2D.drawString("STRANGER", 450, 600);
            g2D.drawString("THINGS", 500, 650);
        }
    };

    panel.setPreferredSize(new Dimension(1280, 720));

    frame.add(panel);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}