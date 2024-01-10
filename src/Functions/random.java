package Functions;
import java.util.Random;

public class random {
    public static void main(String[] args) {
        int randomNumber = generateRandomNumber();
        System.out.println(randomNumber);
    }
    public static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(34); // Generates a random number between 0 (inclusive) and 34 (exclusive)
    }
}
