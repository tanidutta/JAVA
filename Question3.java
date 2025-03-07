import java.util.ArrayList;

public class Question3{
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();
        int num = 2;
        while (primes.size() < 8) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        System.out.println("First 8 positive prime numbers:");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println();
        System.out.println("Fibonacci sequence with the first 8 prime numbers:");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) return false; 
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}