import javax.swing.*;

import java.awt.*;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawingTwo {
    public static void mainDraw(Graphics graphics) {
    int m=0;
    int b=0;

        for (int i = 0; i <4 ; i++) {
            if(i==0) {
            }else if (i == 1) {
                b = 160;
            } else if (i == 2) {
                m = 160;
                b = 0;
            } else if (i == 3) {
                m = 160;
                b = 160;
            }

            int x = 30 / 2 + m;
            int y = b;
            int s = 320 / 2 + m;
            int r = 30 / 2 + b;
            graphics.setColor(new Color(67, 189, 21));
            for (double j = 0; j < 13; j++) {
                graphics.drawLine(x, y, s, r);
                x += 25 / 2;
                y += 0;
                r += 25 / 2;

            }
            graphics.setColor(new Color(178, 57, 196));
            x = m;
            y = 30 / 2 + b;
            s = 30 / 2 + m;
            r = 320 / 2 + b;
            for (double j = 0; j < 13; j++) {
                graphics.drawLine(x, y, s, r);
                x += 0;
                y += 25 / 2;
                s += 25 / 2;
            }
        }
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
            mainDraw(graphics);
        }
    }
}