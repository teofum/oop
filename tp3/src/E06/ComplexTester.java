package E06;

public class ComplexTester {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(12d, 5);
        ComplexNumber c2 = new ComplexNumber(10);
        System.out.println(c1.equals(c2)); // false
        System.out.println(c1.equals(new ComplexNumber(12, 5))); // true
        System.out.println(c1.add(c2)); // 22.00 + 5.00
        System.out.println(c1.add(-3)); // 9.00 + 5.00
        System.out.println(c1.add((double) -3)); // 9.00 + 5.00
    }
}
