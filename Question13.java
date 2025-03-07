import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean canBeExpressed = false;
        for (int i = 2; i <= number / 2; i++) {
            if (isPrime(i) && isPrime(number - i)) {
                System.out.println(number + " can be expressed as the sum of " + i + " and " + (number - i));
                canBeExpressed = true;
            }
        }

        if (!canBeExpressed) {
            System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
        }
        scanner.close();
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false; 
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}