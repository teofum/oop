package E03_04;

public class Circle extends Ellipse {
    public Circle(Point center, double r) {
        super(center, r * 2, r * 2);
    }

    @Override
    public double perimeter() {
        return 2.0 * Math.PI * a;
    }

    @Override
    public String toString() {
        return "Circle [ Center: %s, Radius: %.2f ]".formatted(center.toString(), a);
    }
}
