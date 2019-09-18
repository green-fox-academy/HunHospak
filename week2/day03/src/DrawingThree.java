/*
import javax.swing.*;

import java.awt.*;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawingThree {
    public static void mainDraw(Graphics graphics) {
        negyedel(2,160,graphics);

    }

    public static void negyedel (int i, int j,Graphics graphics) {
        for (int k = 0; k < 4; k++) {
            if (k==0) {
                j=90;
                int x = 30 / i+j;
                int y = 0+l;
                int s = 320 / i+m;
                int r = 30 / i+n;

                graphics.setColor(new Color(67, 189, 21));
                for (double p = 0; p < 13; p++) {
                    graphics.drawLine(x, y, s, r);
                    x += 25 / i;
                    y += 0;
                    r += 25 / i;
                }

                graphics.setColor(new Color(178, 57, 196));
                x = 0;
                y = 30 / i;
                s = 30 / i;
                r = 320 / i;
                for (double p = 0; p < 13; p++) {
                    graphics.drawLine(x, y, s, r);
                    x += 0;
                    y += 25 / i;
                    s += 25 / i;
                }

            }

            if (k==1) {
                int x = 30 / i + j;
                int y = 0;
                int s = 320 / i +j;
                int r = 30 / i;

                graphics.setColor(new Color(67, 189, 21));
                for (double p = 0; p < 13; p++) {
                    graphics.drawLine(x, y, s, r);
                    x += 25 / i;
                    y += 0;
                    r += 25 / i ;
                }

                graphics.setColor(new Color(178, 57, 196));
                x = j;
                y = 30 / i;
                s = 30 / i+j;
                r = 320 / i;
                for (double p = 0; p < 13; p++) {
                    graphics.drawLine(x, y, s, r);
                    x = j;
                    y += 25 / i;
                    s += 25 / i;
                }

            }
            if (k==2);
            int x = 30 / i + j;
            int y = j;
            int s = 320 / i +j;
            int r = 30 / i+j;

            graphics.setColor(new Color(67, 189, 21));
            for (double p = 0; p < 13; p++) {
                graphics.drawLine(x, y, s, r);
                x += 25 / i;
                y += 0;
                r += 25 / i ;
            }

            graphics.setColor(new Color(178, 57, 196));
            x = j;
            y = 30 / i+j;
            s = 30 / i+j;
            r = 320 / i+j;
            for (double p = 0; p < 13; p++) {
                graphics.drawLine(x, y, s, r);
                x = j;
                y += 25 / i;
                s += 25 / i;
            }
            if (k==3) {
                x = 30 / i;
                y = 0+j;
                s = 320 / i;
                r = 30 / i+j;

                graphics.setColor(new Color(67, 189, 21));
                for (double p = 0; p < 13; p++) {
                    graphics.drawLine(x, y, s, r);
                    x += 25 / i;
                    y += 0;
                    r += 25 / i;
                }

                graphics.setColor(new Color(178, 57, 196));
                x = 0;
                y = 30 / i+j;
                s = 30 / i;
                r = 320 / i+j;
                for (double p = 0; p < 13; p++) {
                    graphics.drawLine(x, y, s, r);
                    x += 0;
                    y += 25 / i;
                    s += 25 / i;
                }

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
}*/
