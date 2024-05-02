import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        long factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
        
        scanner.close();
    }
    
    public static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
