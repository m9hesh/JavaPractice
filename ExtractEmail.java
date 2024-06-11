package com.javapractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    public static void main(String[] args) {
        String text = "Hey, there how are you? this is my email id great123@gmail.com";
        
        // Define the email pattern
        String emailPattern = "([a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6})";
        
        // Create a Pattern object
        Pattern pattern = Pattern.compile(emailPattern);
        
        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);
        
        // Find and print email addresses
        while (matcher.find()) {
            System.out.println("Found email: " + matcher.group());
        }
    }
}

