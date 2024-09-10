package E11;

public class Polynomial {
    private final double[] coeffs;

    public Polynomial(int degree) throws InvalidDegreeException {
        if (degree < 0) throw new InvalidDegreeException("Invalid degree");
        coeffs = new double[degree + 1];
    }

    public void set(int idx, double value) throws InvalidIndexException {
        if (idx < 0 || idx >= coeffs.length) throw new InvalidIndexException("Invalid index");
        coeffs[idx] = value;
    }

    public double eval(double x) {
        double value = 0;
        double xPower = 1;
        for (double c : coeffs) {
            value += c * xPower;
            xPower *= x;
        }

        return value;
    }
}
