import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BresenhamLine extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Example points to draw a line from (x1, y1) to (x2, y2)
        int x1 = 50, y1 = 50, x2 = 200, y2 = 150;
        drawLine(g, x1, y1, x2, y2);
    }

    public void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int sx = x1 < x2 ? 1 : -1;
        int sy = y1 < y2 ? 1 : -1;
        int err = dx - dy;

        while (true) {
            g.drawRect(x1, y1, 1, 1); // Plot the pixel at (x1, y1)

            if (x1 == x2 && y1 == y2)
                break;

            int e2 = 2 * err;

            if (e2 > -dy) {
                err -= dy;
                x1 += sx;
            }
            if (e2 < dx) {
                err += dx;
                y1 += sy;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        BresenhamLine linePanel = new BresenhamLine();
        frame.add(linePanel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
