package E02;

public class QuadraticFunction implements Function {
    private final double a, b, c;

    public QuadraticFunction(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double evaluate(double x) {
        return a * Math.pow(x,2) + b * x + c;
    }
}
