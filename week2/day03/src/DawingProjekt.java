import javax.swing.*;

import java.awt.*;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DawingProjekt {
    public static void mainDraw(Graphics graphics) {
        int x = 30;
        int y = 0;
        int s = 320;
        int r = 30;
        graphics.setColor(new Color(67,189,21));
        for (double i = 0; i < 21; i++) {
            graphics.drawLine(x,y,s,r);
            x+=25;
            y+=0;
            r+=25;

        }
        graphics.setColor(new Color(178,57,196));
        x=0;
        y=30;
        s=30;
        r=320;
        for (double i = 0; i < 21; i++) {
            graphics.drawLine(x, y, s, r);
            x += 0;
            y += 25;
            s += 25;
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