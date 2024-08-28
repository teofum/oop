package E07;

public class InsufficientFundsException extends Exception {
    private double maxWithdrawal, attemptedWithdrawal;

    public InsufficientFundsException(double attemptedWithdrawal, double maxWithdrawal) {
        this.maxWithdrawal = maxWithdrawal;
        this.attemptedWithdrawal = attemptedWithdrawal;
    }

    @Override
    public String getMessage() {
        return "Insufficient funds: attempted to withdraw %.2f, maximum withdrawal amount is %.2f"
                .formatted(attemptedWithdrawal, maxWithdrawal);
    }
}
