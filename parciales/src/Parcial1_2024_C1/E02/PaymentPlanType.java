package Parcial1_2024_C1.E02;

public enum PaymentPlanType {
    BASIC(12, (i, amt) -> amt),
    FIRST_THREE_FREE(24, (i, amt) -> (i <= 3) ? 0 : amt),
    EVEN_HALF_OFF(360, (i, amt) -> (i % 2 == 0) ? (amt / 2) : amt);

    private final int maxInstallments;
    private final InstallmentAmountCalculator calculatorFn;

    PaymentPlanType(int maxInstallments, InstallmentAmountCalculator calculatorFn) {
        this.maxInstallments = maxInstallments;
        this.calculatorFn = calculatorFn;
    }

    @FunctionalInterface
    private interface InstallmentAmountCalculator {
        double getInstallmentAmount(int installment, double baseAmount);
    }

    public PaymentDetail getPaymentDetail(int installment, double baseAmount) {
        return new PaymentDetail(installment, calculatorFn.getInstallmentAmount(installment, baseAmount));
    }

    public int getMaxInstallments() {
        return maxInstallments;
    }
}
