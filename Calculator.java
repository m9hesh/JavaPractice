package Anudip1605;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		boolean con = true;
		while(con) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First Number :");
			int no1 = sc.nextInt();
			System.out.println("Enter Second Number :");
			int no2 = sc.nextInt();
			if(no2==0) {
				System.out.println("Please do not enter zero");
				
			}
			
			System.out.println("Choose Operation('+', '-', '*', '/,) :"+"Enter 'e' for Exit:");
			char ch = sc.next().charAt(0);
			
			switch(ch) {
			case '+':
				System.out.println(no1+" + "+no2+" = "+(no1+no2));
				break;
			case '-':
				System.out.println(no1+" - "+no2+" = "+(no1-no2));
				break;
			case '*':
				System.out.println(no1+" * "+no2+" = "+(no1*no2));
				break;
			case '/':
				System.out.println(no1+" / "+no2+" = "+(no1/no2));
				break;
			case 'e':
				con = false;
				break;
			}
			
		}
		System.out.println("Exited from the program");
		

	}

}
