
import javax.swing.*;
import java.awt.*;

public class smileyFace extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        g.fillOval(100, 50, 200, 200); // Face
        g.setColor(Color.BLACK);
        g.fillOval(150, 100, 20, 20); // Left Eye
        g.fillOval(230, 100, 20, 20); // Right Eye
        g.drawArc(150, 150, 100, 50, 0, -180); // Smile
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiley Face");
        smileyFace panel = new smileyFace();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
