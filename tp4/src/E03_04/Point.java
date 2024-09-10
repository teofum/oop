package E03_04;

public class Point {
    private final double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point other) {
        double dx = x - other.x;
        double dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point add(Point other) {
        return new Point(x + other.x, y + other.y);
    }

    @Override
    public String toString() {
        return "{%.2f, %.2f}".formatted(x, y);
    }
}
