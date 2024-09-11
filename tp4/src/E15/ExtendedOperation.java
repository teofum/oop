package E15;

public enum ExtendedOperation implements Operation {
    POWER("^") {
        @Override
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    },
    MODULO("%") {
        @Override
        public double apply(double x, double y) {
            return x % y;
        }
    };

    private final String operator;

    ExtendedOperation(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return operator;
    }
}
