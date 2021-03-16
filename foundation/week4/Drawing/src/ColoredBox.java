import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void drawImage(Graphics graphics) {
        // Draw a box that has different colored lines on each edge

        graphics.setColor (new Color (100, 0, 50, 150));
        graphics.drawLine(50, 50, 100, 50);

        graphics.setColor (new Color (50, 0, 50, 150));
        graphics.drawLine(100, 50, 100, 100);

        graphics.setColor (new Color (200, 0, 0, 150));
        graphics.drawLine(50, 100, 100, 100);

        graphics.setColor (new Color (12, 0, 0, 150));
        graphics.drawLine(50, 50, 50, 100);





    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}
