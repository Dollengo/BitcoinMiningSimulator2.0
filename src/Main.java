import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Create a Random object for generating random numbers
        Random rand = new Random();

        // Create a Scanner object for reading input from the console
        Scanner scanner = new Scanner(System.in);

        // Ask the user how long they want to wait for mining bitcoins
        System.out.println("How much secont want wait for mining bitcoins? ");
        int time = scanner.nextInt();  // Read the time from the user

        // Initialize a variable to keep track of the number of bitcoins found
        float bitcoin = 0;

        // Get the current time in milliseconds
        long startTime = System.currentTimeMillis();

        // Keep mining bitcoins until the specified time has passed
        while (System.currentTimeMillis() - startTime < TimeUnit.SECONDS.toMillis(time)) {
            float num1 = rand.nextFloat(999999999);

            // If the sum of the two numbers is close to 1, increment the bitcoin count
            if (Math.abs(num1 - 1) < 0.01) {
                bitcoin += rand.nextFloat() * 2;
            }

            // Print the number of bitcoins found so far
            System.out.println("Founded Bitcoins: " + bitcoin);
        }

        // Close the scanner
        scanner.close();
    }
}
