package E06;

public abstract class Expression {
    public abstract boolean evaluate();

    public NotExpression not() {
        return new NotExpression(this);
    }

    public OrExpression or(Expression other) {
        return new OrExpression(this, other);
    }

    public AndExpression and(Expression other) {
        return new AndExpression(this, other);
    }
}
