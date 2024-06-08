package atm;

import bank.BankAccount;

public class ATM {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 1000.0, "Mahesh", "password123");

        // Accessing public member
        System.out.println("Account Number: " + account.accountNumber);

        // Accessing protected member - allowed because it is accessed through a public method within the same package
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Accessing default member - Not allowed because ATM is in a different package
        // account.updateAccountHolderName("Jane Doe"); // This will cause a compile-time error

        // Accessing private member - Not allowed from outside the BankAccount class
        // boolean isAuthenticated = account.verifyPassword("password123"); // This will cause a compile-time error

        // Using public method to authenticate
        boolean isAuthenticated = account.authenticate("password123");
        System.out.println("Authentication successful: " + isAuthenticated);
    }
}
