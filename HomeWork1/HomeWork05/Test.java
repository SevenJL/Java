package HomeWork05;

public class Test {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(500);
        System.out.println(checkingAccount.getBalance());
    }
}
