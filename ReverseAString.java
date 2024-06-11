package com.javapractice;
//1)How to reverse a String in place in Java?
public class ReverseAString {
    public static void main(String[] args) {
        // Initialize the string to be reversed
        String str = "Hello World";
        
        // Initialize an empty string to store the reversed version
        String temp = "";
        
        // Loop through the original string from the end to the beginning
        for(int i = str.length() - 1; i >= 0; i--) {
            // Append the current character to the 'temp' string
            temp += str.charAt(i);
        }
        
        // Print the reversed string
        System.out.println(temp);
    }
}
