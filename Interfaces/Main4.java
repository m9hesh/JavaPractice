package com.javapractice;

//Define the BankingInterface interface
interface BankingInterface {
	// Method to deposit an amount into the account
	void deposit(double amount);

	// Method to withdraw an amount from the account
	void withdraw(double amount);

	// Method to get the current balance of the account
	double getBalance();
}

//Implement the SavingsAccount class
class SavingsAccount implements BankingInterface {
	// Private field to store the balance of the savings account
	private double balance;

	// Constructor to initialize the savings account with an initial balance
	public SavingsAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	// Implement the deposit method
	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount; // Add the deposit amount to the balance
			System.out.println("Deposited " + amount + " into Savings Account. New balance: " + balance);
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}

	// Implement the withdraw method
	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount; // Subtract the withdrawal amount from the balance
			System.out.println("Withdrew " + amount + " from Savings Account. New balance: " + balance);
		} else {
			System.out.println("Invalid withdraw amount or insufficient balance.");
		}
	}

	// Implement the getBalance method
	@Override
	public double getBalance() {
		return balance; // Return the current balance
	}
}

//Implement the CurrentAccount class
class CurrentAccount implements BankingInterface {
	// Private field to store the balance of the current account
	private double balance;

	// Constructor to initialize the current account with an initial balance
	public CurrentAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	// Implement the deposit method
	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount; // Add the deposit amount to the balance
			System.out.println("Deposited " + amount + " into Current Account. New balance: " + balance);
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}

	// Implement the withdraw method
	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount; // Subtract the withdrawal amount from the balance
			System.out.println("Withdrew " + amount + " from Current Account. New balance: " + balance);
		} else {
			System.out.println("Invalid withdraw amount or insufficient balance.");
		}
	}

	// Implement the getBalance method
	@Override
	public double getBalance() {
		return balance; // Return the current balance
	}
}

//Main class to test the implementation
public class Main4 {
	public static void main(String[] args) {
		// Create SavingsAccount and CurrentAccount objects with initial balances
		BankingInterface savings = new SavingsAccount(1000);
		BankingInterface current = new CurrentAccount(2000);

		// Test the SavingsAccount methods
		savings.deposit(500); 
		savings.withdraw(200);
		System.out.println("Savings Account balance: " + savings.getBalance()); 

		// Test the CurrentAccount methods
		current.deposit(1000); 
		current.withdraw(500); 
		System.out.println("Current Account balance: " + current.getBalance()); 
	}
}
