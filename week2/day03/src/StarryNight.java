import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        graphics.setColor(Color.black);
        graphics.fillRect(0,0,1920,1080);
        int k;
        int x;
        int y;
        int j;
        for (int i = 0; i < 15001; i++) {
            k = (int)(Math.random()*255);
            x = (int)(Math.random()*1920);
            y = (int)(Math.random()*1080);
            j = (int)(Math.random()*3);
            graphics.setColor(new Color(k,k,k));
            graphics.fillRect(x,y,j,j);
        }






    }

    // Don't touch the code below
    static int WIDTH = 1920;
    static int HEIGHT = 1080;

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