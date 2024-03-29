import java.awt.*;

public class PointClient {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel();
        Graphics g = panel.getGraphics();

        Point p1 = new Point();
        Point p2 = new Point();

        p1.x = 50;
        p1.y = 100;

        g.fillOval(p1.x, p1.y, 3, 3);
        g.drawString("(" + p1.x + ", " + p1.y + ")", p1.x, p1.y);

        System.out.println("(" + p1.x + ", " + p1.y + ")");
    }
}
