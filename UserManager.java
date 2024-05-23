package com.javapractice;
//You are building a user authentication system in Java. 
//Implement a class called UserManager that contains overloaded 
//methods for user authentication. The overloaded methods should 
//accept different combinations of parameters, such as username and password,
//email and password, or phone number and PIN. Ensure that the method 
//implementations correctly authenticate users based on the provided parameters
public class UserManager {
	public static void userAuthentication(String userName, String password) {
		System.out.println("UserName/email: " + userName +" "+"Password: "+password);
	}
	
	public static void userAuthentication(long phNO, int pin) {
		System.out.println("Phone Number: " + phNO +" "+"Pin: "+pin);
	}

	public static void main(String[] args) {
		String userName;
		String email;
		String passWord;
		long phNo;;
		short pin;
		userAuthentication("maheshmahi12", "Mahesh12");
		userAuthentication("medaboinamahesh79970@gmail.com", "Mahesh12");
		userAuthentication(8074818128L, 1218);

	}

}
