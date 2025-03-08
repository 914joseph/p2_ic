package problema2;

public class Account {

    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;

    }

    int getNumber() {
        return number;
    }

    String getHolder() {
        return holder;
    }

    double getBalance() {
        return balance;
    }

    double getWithdrawLimit() {
        return withdrawLimit;
    }

}
