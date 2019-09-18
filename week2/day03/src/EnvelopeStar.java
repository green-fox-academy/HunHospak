import javax.swing.*;

import java.awt.*;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.RED);
        int x=160;
        int y=0;
        int c=160;
        int v=160;
        int s=0;
        int h=0;
        for (int j = 0; j < 4 ; j++) {
            x=160;
            y=0;
            c=160;
            v=160;
            h=0;
            if (j==0) {
                s=10;
                h=10;
            } else if (j==1) {
                s=-10;
                h=10;
            } else if (j==2) {
                x=160;
                y=320;
                c=160;
                v=160;
                s=10;
                h=-10;
            } else if (j==3) {
                x=160;
                y=320;
                c=160;
                v=160;
                s=-10;
                h=-10;
            }
            for (int i = 0; i < 17; i++) {
                graphics.drawLine(x, y, c, v);
                c += s;
                y += h;
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
