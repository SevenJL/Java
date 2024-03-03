package HomeWork05;

public class BankAccount {
    public BankAccount() {
    }
    private double balance;
    public BankAccount(double initialBallance){
        this.balance = initialBallance;
    }
    //´æ¿î
    public void deposit(double amount) {
        balance+=amount;
    }
    //qÈ¡¿î
    public void withdraw(double amount){
        balance+=amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
