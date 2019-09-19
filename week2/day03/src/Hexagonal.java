import javax.swing.*;

import java.awt.*;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagonal {
    public static void mainDraw(Graphics graphics) {
        int fontos=0;
        for (int s=0;s<2;s++) {
            if (s==0) {
                fontos = 15;
            } else {
                fontos = -15;
            }
            int[] x = {155, 160, 170, 175, 170, 160};
            int[] y = {10, 0, 0, 10, 20, 20};
                for (int p = 8; p > 3; p -= 1) {
                    for (int i = 0; i < p; i++) {
                        graphics.drawPolygon(x, y, 6);
                        for (int j = 0; j < 6; j++) {
                            y[j] +=20;
                        }
                    }
                    for (int i = 0; i < 6; i++) {
                        x[i] += fontos;
                        y[i] -= 20 * (p) - 10;
                    }

                }

        }


    }
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