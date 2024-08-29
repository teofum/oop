package E09;

public class Rectangle extends Shape {
    private final Point position, size;

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
}
