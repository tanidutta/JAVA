public class Question1 {
    public static void main(String[] args) {
        int n = 10; 
        int a = 0, b = 1; 
        int sum = a + b; 
        System.out.print(a + " " + b + " "); 
        for (int i = 2; i < n; i++) {
            int next = a + b; 
            System.out.print(next + " "); 
            sum += next; 
            a = b; 
            b = next; 
        }
        System.out.println("\nSum of the first " + n + " Fibonacci numbers: " + sum);
    }
}