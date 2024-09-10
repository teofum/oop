package E06;

public class AndExpression extends BinaryExpression {
    public AndExpression(Expression left, Expression right) {
        super(left, right);
    }

    public boolean evaluate() {
        return getLeft().evaluate() && getRight().evaluate();
    }
}
