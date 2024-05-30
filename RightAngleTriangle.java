package com.javapractice;

public class RightAngleTriangle {

	public static void main(String[] args) {
		//printing row
		for(int i=1; i<=5; i++) {
			//printing column
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");//printing * with space
			}
			//printing next line
			System.out.println();
		}
		

	}

}
