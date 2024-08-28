package E06;

public class ComplexNumber {
    private double r, i;

    public ComplexNumber(double r, double i) {
        this.r = r;
        this.i = i;
    }

    public ComplexNumber(double r) {
        this(r, 0);
    }

    @Override
    public String toString() {
        return "(%g, %g)".formatted(r, i);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ComplexNumber c)) return false;
        return r == c.r && i == c.i;
    }

    public ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(r + c.r, i + c.i);
    }

    public ComplexNumber add(double x) {
        return new ComplexNumber(r + x, i);
    }

    public double re() {
        return r;
    }

    public double im() {
        return i;
    }
}
