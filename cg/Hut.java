
import javax.swing.*;
import java.awt.*;

public class Hut extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(100, 150, 150, 100); // Base
        g.setColor(Color.RED);
        g.drawLine(100, 150, 175, 100); // Left Roof
        g.drawLine(175, 100, 250, 150); // Right Roof
        g.setColor(Color.BLACK);
        g.fillRect(140, 200, 50, 50); // Door
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hut");
        Hut panel = new Hut();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
