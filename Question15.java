import java.util.Random;

public class Question15 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Generated Random Numbers:");
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(100) + 1;
            System.out.println(randomNumber);
        }
    }
}