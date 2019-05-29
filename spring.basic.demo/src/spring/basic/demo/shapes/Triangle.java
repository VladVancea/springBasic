package spring.basic.demo.shapes;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    private List<Point> points = new ArrayList<Point>();

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw() {
        for (Point point : points) {
            System.out.println("(" + point.getX() + "," + point.getY() + ")");
        }
    }
}
