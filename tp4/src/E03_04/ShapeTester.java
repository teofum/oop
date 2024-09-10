package E03_04;

public class ShapeTester {
    public static void main(String[] args) {
        Ellipse myEllipse = new Ellipse(new Point(0, 0), 2, 1);
        System.out.println(myEllipse);
        myEllipse.moveNorth(5);
        myEllipse.moveWest(2);
        System.out.println(myEllipse);
        myEllipse.moveSouthWest(3, 3);
        System.out.println(myEllipse);
    }
}
