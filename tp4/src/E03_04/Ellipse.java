package E03_04;

public class Ellipse extends Shape {
    protected Point center;
    protected final double a, b;

    public Ellipse(Point center, double dx, double dy) {
        this.center = center;
        this.a = dx / 2;
        this.b = dy / 2;
    }

    @Override
    public double area() {
        return Math.PI * a * b;
    }

    @Override
    public double perimeter() {
        // Elliptical circumference approximation (real solution is a nasty unsolvable integral)
        // https://en.wikipedia.org/wiki/Ellipse#Circumference
        double h = ((a - b) * (a - b)) / ((a + b) * (a + b)); // Math.pow more like Math.slow
        return Math.PI * (a + b) * (1 + 3 * h / (10 + Math.sqrt(4 - 3 * h)));
    }

    @Override
    public String toString() {
        return "Ellipse [ Center: %s, Dmaj: %.2f, Dmin: %.2f ]".formatted(center.toString(), a * 2, b * 2);
    }

    @Override
    public void moveNorth(double delta) {
        this.center = this.center.add(new Point(0, delta));
    }

    @Override
    public void moveSouth(double delta) {
        this.center = this.center.add(new Point(0, -delta));
    }

    @Override
    public void moveEast(double delta) {
        this.center = this.center.add(new Point(delta, 0));
    }

    @Override
    public void moveWest(double delta) {
        this.center = this.center.add(new Point(-delta, 0));
    }
}
