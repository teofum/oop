package E06;

public abstract class BinaryExpression extends Expression {
    private final Expression left, right;

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    protected Expression getLeft() {
        return left;
    }

    protected Expression getRight() {
        return right;
    }
}
