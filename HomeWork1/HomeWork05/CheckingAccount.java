package HomeWork05;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(double initialBallance) {
        super(initialBallance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}
