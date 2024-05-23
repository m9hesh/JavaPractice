package Anudip2005;
//2.Design a Java program to manage bank accounts. Implement a class called BankAccount with the following functionalities:
//
//    Overload constructors to initialize the account with different types (e.g., savings account, checking account).
//    Implement methods to deposit, withdraw, and check the balance in the account.
//    Overload the deposit method to accept different types of deposits (e.g., deposit by cash, deposit by check).
public class BankAccount {
	String accType;
	double bal;
	
	//default constructor for "checking account"
	BankAccount(){
		this.accType = "Checking";
		this.bal = 0.00;
	}
	
	//overloaded constructor for "Savings Account"
	BankAccount(String accType, double bal){
		this.accType = accType;
		this.bal = bal;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			bal+=amount;
			System.out.println("Deposited $" + amount + " in cash. New balance: $" + bal);
		}else {
			System.out.println("Please enter amount Greater Than 0");
		}
	}
	
	public void withdraw(double amount) {
		if(0<=amount) {
			bal-=amount;
			System.out.println("Withdrew $" + amount + ". New balance: $" + bal);
		}else {
			System.out.println("Please enter valid Amount to Withdraw");
		}
	}
	
	public void checkBal() {
		System.out.println("Your Total Balence :"+ bal);
	}
	public static void main(String[] args) {
		BankAccount savingAccount = new BankAccount("Savings", 10000);
		savingAccount.checkBal();
		savingAccount.withdraw(500);
		
		BankAccount checkingAccount = new BankAccount();
		checkingAccount.deposit(500);
		
		
	}

}
