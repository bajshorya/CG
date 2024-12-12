import javax.swing.*;
import java.awt.*;

public class MovingVehicle extends JPanel {
    private int x = 0;

    public void move() {
        while (x < 400) {
            x += 10;
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(x, 200, 100, 50); // Body
        g.setColor(Color.BLACK);
        g.fillOval(x + 10, 250, 20, 20); // Wheel 1
        g.fillOval(x + 70, 250, 20, 20); // Wheel 2
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Vehicle");
        MovingVehicle panel = new MovingVehicle();
        frame.add(panel);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        panel.move();
    }
}
