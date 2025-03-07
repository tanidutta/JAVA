import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for the sequence: ");
        int limit = scanner.nextInt();
        int index = 0; 
        int power = 1; 
        System.out.println("Generated sequence:");
        while (true) {
            if (index <= limit) {
                System.out.print(index + ", ");
            } else {
                break; 
            }
            if (power <= limit) {
                System.out.print(power + ", ");
            } else {
                break; 
            }
            index++;
            power *= 2; 
        }
        scanner.close();
    }
}