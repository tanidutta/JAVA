import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the limit
        System.out.print("Enter the limit for the sequence: ");
        int limit = scanner.nextInt();
        
        System.out.println("Generated sequence:");
        
        // Initialize variables
        int evenNumber = 2; // Start with the first even number
        int factorialIndex = 1; // Start with 1! for factorials
        
        // Generate the sequence
        for (int i = 1; ; i++) {
            // Print even numbers
            if (evenNumber <= limit) {
                System.out.print(evenNumber + ", ");
            } else {
                break; 
            }
            int factorial = calculateFactorial(factorialIndex);
            if (factorial <= limit) {
                System.out.print(factorial + ", ");
            } else {
                break; 
            }
            evenNumber += 2; 
            factorialIndex++; 
        }
        scanner.close();
    }
    public static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; 
        }
        return result;
    }
}