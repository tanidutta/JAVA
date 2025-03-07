public class Question2 {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 1000:");

        for (int num = 2; num <= 1000; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}