package Anudip1505;

//Program - 01
//Write a Java program to concatenate two strings: "Hello, " and "World!".
//Concatening String
//Most common ways to concatening the string
public class StringConcat {

	// Using + operator
	public static void usingPlusOperator() {
		String s1 = "Virat";
		String s2 = "Kohli";
		System.out.print("by usingPlusOperator :");
		System.out.println(s1 + " " + s2);

	}
	
	// Using Concat Method
	private static void usingConcat() {
		String s1 = "Virat ";
		String s2 = "Kohli";
		
		System.out.print("by usingConcat method :");
		System.out.println(s1.concat(s2));
	}
	
	// append methid()-->using StringBuilder 
	//Faster than StringBuffer but not thread Safe
	private static void usingStringBuilder() {
		StringBuilder sb = new StringBuilder();
		sb.append("Virat ");
		sb.append("Kohli");
		System.out.print("by using String Builder :");
		System.out.print(sb);
		
	}

	public static void main(String[] args) {
		usingPlusOperator();
		usingConcat();
		usingStringBuilder();
	}

	

	

}
