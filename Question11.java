import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        double result = 1.0;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base; 
        }
        if (exponent < 0) {
            result = 1.0 / result;
        }
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        scanner.close();
    }
}