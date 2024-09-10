package E06;

public class OrExpression extends BinaryExpression {
    public OrExpression(Expression left, Expression right) {
        super(left, right);
    }

    public boolean evaluate() {
        return getLeft().evaluate() || getRight().evaluate();
    }
}
