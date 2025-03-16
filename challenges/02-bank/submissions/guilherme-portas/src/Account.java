public class Account {
    private int id;
    private double balance;
    public static int accountCounter;

    public Account() {
        id += 1;
        balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance() {
        if(balance < 0) balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
