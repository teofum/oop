package E07;

public class BankAccountTester {
    public static void main(String[] args) {
        CheckingAccount myCheckingAccount = new CheckingAccount(1001, 50);
        myCheckingAccount.deposit(100.0);
        System.out.println(myCheckingAccount);
        try {
            myCheckingAccount.extract(150.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myCheckingAccount);

        SavingsAccount mySavingsAccount = new SavingsAccount(1002);
        mySavingsAccount.deposit(100.0);
        System.out.println(mySavingsAccount);
        try {
            mySavingsAccount.extract(150.0); // No se realiza por falta de fondos
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(mySavingsAccount);
    }
}
