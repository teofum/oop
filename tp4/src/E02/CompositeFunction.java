package E02;

public class CompositeFunction implements Function {
    private final Function f, g;

    public CompositeFunction(Function f, Function g) {
        this.f = f;
        this.g = g;
    }

    @Override
    public double evaluate(double x) {
        return g.evaluate(f.evaluate(x));
    }
}
