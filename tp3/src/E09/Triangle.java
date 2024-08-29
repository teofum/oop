package E09;

public class Triangle extends Shape {
    private final Point p0, p1, p2;

    public Triangle(Point p0, Point p1, Point p2) {
        this.p0 = p0;
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public double perimeter() {
        return p0.distance(p1) + p1.distance(p2) + p2.distance(p0);
    }

    @Override
    public double area() {
        double a = p0.distance(p1), b = p1.distance(p2), c = p2.distance(p0);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return "Triangle [ %s, %s, %s ]".formatted(p0.toString(), p1.toString(), p2.toString());
    }
}
