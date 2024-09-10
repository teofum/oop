package E06;

public class NotExpression extends Expression {
    private final Expression exp;

    public NotExpression(Expression exp) {
        this.exp = exp;
    }

    public boolean evaluate() {
        return !exp.evaluate();
    }
}
