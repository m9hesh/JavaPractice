package Anudip0705;
import java.util.Scanner;
// JavaPractice - 3
//3.Write a program to print ASCII value for a character
public class ASCIIPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        
        // Convert the character to its ASCII value
        int asciiValue = (int) character;
        
        // Print the ASCII value
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);
        
        scanner.close();
    }
}
