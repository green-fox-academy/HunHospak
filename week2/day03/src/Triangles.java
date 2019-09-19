import javax.swing.*;

import java.awt.*;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        int [] xValue = {160,150,170};
        int [] yValue = {0,15,15};
        int linelength=1;
        int width = 1;
        graphics.drawPolygon(xValue,yValue,3);
        for (int j=0;j<15;j++) {
            xValue[0] -= 10*width;
            xValue[1] -= 10*width;
            xValue[2] -= 10*width;
            yValue[0] += 15;
            yValue[1] += 15;
            yValue[2] += 15;
            graphics.drawPolygon(xValue, yValue, 3);
            for (int i = 0; i < linelength; i++) {
                xValue[0] += 20;
                xValue[1] += 20;
                xValue[2] += 20;
                graphics.drawPolygon(xValue, yValue, 3);
            }
            width +=2;
            linelength+=1;

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