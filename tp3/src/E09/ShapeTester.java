package E09;

public class ShapeTester {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(new Point(0, 0), new Point(2, 4));
        System.out.println(myRectangle);
        System.out.printf("%.2f%n", myRectangle.perimeter());
        System.out.printf("%.2f%n", myRectangle.area());
        System.out.printf("%.2f%n", myRectangle.base());
        System.out.printf("%.2f%n", myRectangle.height());

        Triangle myTriangle = new Triangle(new Point(0, 0), new Point(1, 0), new Point(0, 1));
        System.out.println(myTriangle);
        System.out.printf("%.2f%n", myTriangle.perimeter());
        System.out.printf("%.2f%n", myTriangle.area());

        Ellipse myEllipse = new Ellipse(new Point(0, 0), 2, 1);
        System.out.println(myEllipse);
        System.out.printf("%.2f%n", myEllipse.perimeter());
        System.out.printf("%.2f%n", myEllipse.area());

        Circle myCircle = new Circle(new Point(0, 0), 3);
        System.out.println(myCircle);
        System.out.printf("%.2f%n", myCircle.perimeter());
        System.out.printf("%.2f%n", myCircle.area());
    }

}
