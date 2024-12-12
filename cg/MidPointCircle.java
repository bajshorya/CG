import javax.swing.*;
import java.awt.*;

public class MidPointCircle extends JPanel {
    public void drawCircle(Graphics g, int xc, int yc, int r) {
        int x = 0, y = r, p = 1 - r;
        while (x <= y) {
            g.fillRect(xc + x, yc + y, 1, 1);
            g.fillRect(xc - x, yc + y, 1, 1);
            g.fillRect(xc + x, yc - y, 1, 1);
            g.fillRect(xc - x, yc - y, 1, 1);
            g.fillRect(xc + y, yc + x, 1, 1);
            g.fillRect(xc - y, yc + x, 1, 1);
            g.fillRect(xc + y, yc - x, 1, 1);
            g.fillRect(xc - y, yc - x, 1, 1);
            x++;
            if (p < 0)
                p += 2 * x + 1;
            else {
                y--;
                p += 2 * (x - y) + 1;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        drawCircle(g, 200, 200, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Midpoint Circle");
        MidPointCircle panel = new MidPointCircle();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
