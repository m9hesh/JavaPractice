package Anudip1605;
import java.util.Scanner;

public class ConcatString {
//	Develop a Java program that takes two strings as input 
//	from the user and concatenates them without using the + operator. 
//	Instead, implement your own method or logic to concatenate the strings. 
//	Print the concatenated result.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String :");
		String s1 = sc.next();
		System.out.println("Enter Second String :");
		String s2 = sc.next();
		
		System.out.println("Your Result: "+s1.concat(s2));

	}

}
