package Anudip1505;
//Program - 2
//Write a Java program to check if a given string "Java Programming" 
//contains the substring "Programming".
public class ContainsString {
	
	//Write a Java program to check if a given string "Java Programming"
	public static void subString() {
		String s1 = "Java Programming";
		String s2 = "Programming";
		
		System.out.println(s1.contains(s2));
	}
	//Write a Java program to find the index of the first occurrence of the character 'a' in the string "Banana".
	public static void firstOccurence() {
		String s1 = "banana";
		char s2 = 'a';
		
		System.out.println(s1.indexOf(s2));
	}
	
	// Write a Java program to convert the string "java" to uppercase.
	private static void convertStringToUpperCase() {
		String s1 = "Java";
		System.out.println(s1.toUpperCase());
		
	}
	//Write a Java program to replace all occurrences of the character 'e' with 'a' in the string "Hello Everyone".
	private static void replaceAll() {
		String s1 = "Hello Everyone";
		System.out.println(s1.replace('e', 'a'));
		
	}
	public static void main(String[] args) {
		subString();
		firstOccurence();
		convertStringToUpperCase();
		replaceAll();

	}
	
	
	

}
