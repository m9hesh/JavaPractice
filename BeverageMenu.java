package Anudip0205;

import java.util.Scanner;

public class BeverageMenu {

	public static void main(String[] args) {
		BeverageMenu.beverageMenu();
	}

	public static void beverageMenu() {
		
		System.out.println("1.Tea");
		System.out.println("2.Coffee");
		System.out.println("3.Water Bottle");
		System.out.println("4.Cool Drink");
		System.out.println("5.Exit");
		System.out.println("Choose 1 From Above: ");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();

		switch (val) {
		case 1:
			System.out.println("You've ordered Tea.");
			break;
		case 2:
			System.out.println("You've ordered Coffee.");
			break;
		case 3:
			System.out.println("You've ordered Water Bottle.");
			break;
		case 4:
			System.out.println("You've ordered Cool Drink.");
			break;
		case 5:
			System.out.println("Exiting the menu...");
			break;
		default:
			System.out.println("Invalid choice! Please select a valid option.");

		}

	}

}
