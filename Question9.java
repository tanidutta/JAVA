import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / factorial(i); 
        }
        System.out.println("Sum of the series up to " + n + " terms is: " + sum);
        scanner.close();
    }
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i; 
        }
        return result;
    }
}