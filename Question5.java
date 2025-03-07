import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for the sequence: ");
        int limit = scanner.nextInt();
        int fib1 = 0; 
        int fib2 = 1; 
        int oddNegative = -1; 
        System.out.println("Generated sequence:");
        for (int i = 0; ; i++) {
            if (fib1 <= limit) {
                System.out.print(fib1 + ", ");
            } else {
                break; 
            }
            if (oddNegative <= limit) {
                System.out.print(oddNegative + ", ");
            } else {
                break; 
            }
            int nextFib = fib1 + fib2; 
            fib1 = fib2; 
            fib2 = nextFib;
            oddNegative -= 3;
        }
        scanner.close();
    }
}