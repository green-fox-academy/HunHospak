import org.w3c.dom.css.RGBColor;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        Color myCol = new Color(125,180,110);
        graphics.setColor(myCol);
        int x = 20;
        int y = 30;
        int k = 15;
        for (int i = 0; i <4 ; i++) {
            graphics.drawRect(x,y,k,k);
            x+=10;
            y+=15;
            k*=2;




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