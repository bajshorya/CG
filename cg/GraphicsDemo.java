import javax.swing.*;
import java.awt.*;

public class GraphicsDemo extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw a rectangle
        g.drawRect(50, 50, 100, 50);
        // Draw a circle
        g.drawOval(200, 50, 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        GraphicsDemo panel = new GraphicsDemo();
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
