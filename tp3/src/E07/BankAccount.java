package E07;

public abstract class BankAccount {
    private int id;
    private double overdraft, balance;

    public BankAccount(int id, double overdraft) {
        this.id = id;
        this.overdraft = overdraft;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void extract(double amount) throws InsufficientFundsException {
        if (balance - amount >= -overdraft) {
            balance -= amount;
        } else {
            throw new InsufficientFundsException(amount, balance + overdraft);
        }
    }

    @Override
    public String toString() {
        return "Account %d with balance %.2f".formatted(id, balance);
    }
}

