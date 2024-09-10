package E03_04;

public class Rectangle extends Shape {
    private Point position;
    private final Point size;

    public Rectangle(Point position, Point size) {
        this.position = position;
        this.size = size;
    }

    public double base() {
        return size.getX();
    }

    public double height() {
        return size.getY();
    }

    @Override
    public double area() {
        return base() * height();
    }

    @Override
    public double perimeter() {
        return 2 * base() + 2 * height();
    }

    @Override
    public String toString() {
        return "Rectangle [ %s, %s ]".formatted(position.toString(), size.toString());
    }

    @Override
    public void moveNorth(double delta) {
        this.position = this.position.add(new Point(0, delta));
    }

    @Override
    public void moveSouth(double delta) {
        this.position = this.position.add(new Point(0, -delta));
    }

    @Override
    public void moveEast(double delta) {
        this.position = this.position.add(new Point(delta, 0));
    }

    @Override
    public void moveWest(double delta) {
        this.position = this.position.add(new Point(-delta, 0));
    }
}
