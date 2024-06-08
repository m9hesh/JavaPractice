package bank;

public class BankAccount {
    public String accountNumber; // Public access
    protected double balance; // Protected access
    String accountHolderName; // Default (package-private) access
    private String password; // Private access

    public BankAccount(String accountNumber, double balance, String accountHolderName, String password) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    protected void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    void updateAccountHolderName(String newName) {
        this.accountHolderName = newName;
    }

    private boolean verifyPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public boolean authenticate(String inputPassword) {
        return verifyPassword(inputPassword);
    }
}

