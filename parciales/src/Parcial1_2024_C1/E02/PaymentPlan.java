package Parcial1_2024_C1.E02;

import java.util.Iterator;

public class PaymentPlan implements Iterator<PaymentDetail> {
    private final PaymentPlanType type;
    private final int installments;
    private final double installmentAmount;
    private int nextInstallment = 1;

    public PaymentPlan(PaymentPlanType type, double totalAmount, int installments) {
        if (installments < 1 || installments > type.getMaxInstallments())
            throw new InvalidPaymentPlanException("Installments must be between 1 and " + type.getMaxInstallments());
        if (totalAmount <= 0) throw new InvalidPaymentPlanException("Total amount must be greater than zero");

        this.type = type;
        this.installments = installments;
        this.installmentAmount = totalAmount / installments;
    }

    public PaymentDetail peek() {
        if (nextInstallment > installments) throw new IllegalArgumentException("No more installments");
        return type.getPaymentDetail(nextInstallment, installmentAmount);
    }

    @Override
    public PaymentDetail next() {
        PaymentDetail pd = peek();
        nextInstallment++;
        return pd;
    }

    @Override
    public boolean hasNext() {
        return nextInstallment <= installments;
    }
}
