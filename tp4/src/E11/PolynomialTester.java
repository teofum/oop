package E11;

public class PolynomialTester {
    public static void main(String[] args) throws InvalidDegreeException, InvalidIndexException {
        Polynomial fourthDegreePol = new Polynomial(4);
        fourthDegreePol.set(2, 3.1); // 3.1 * x^2
        fourthDegreePol.set(3, 2); // 2 * x^3 + 3.1 * x^2
        System.out.println(fourthDegreePol.eval(2)); // 28.4
        System.out.println(new Polynomial(3).eval(5)); // 0
        try {
            new Polynomial(-4);
        } catch (InvalidDegreeException e) {
            System.out.println(e.getMessage()); // 0
        }
        fourthDegreePol.set(7, 1.5); // 1.5 * x^7
    }
}
