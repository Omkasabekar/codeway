import java.util.*;

public class Ass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int count = 0;
        int maxAttempts;

        // Step 1: Guess a number between 1 to 100 in 7 attempts
        int randomNumberStep1 = random.nextInt(100) + 1;
        System.out.println("Step 1: Welcome! You have to guess the number between 1 to 100 in 7 attempts.");
        maxAttempts = 7;
        count = playGame(sc, randomNumberStep1, maxAttempts);

        // If Step 1 is cleared, proceed to Step 2
        if (count < maxAttempts) {
            // Step 2: Guess a number between 1 to 500 in 10 attempts
            int randomNumberStep2 = random.nextInt(500) + 1;
            System.out.println("\nStep 2: Great job! Now guess the number between 1 to 500 in 10 attempts.");
            maxAttempts = 10;
            count = playGame(sc, randomNumberStep2, maxAttempts);
        }

        // If Step 2 is cleared, proceed to Step 3
        if (count < maxAttempts) {
            // Step 3: Guess a number between 1 to 1000 in 15 attempts
            int randomNumberStep3 = random.nextInt(1000) + 1;
            System.out.println("\nStep 3: Excellent! Now guess the number between 1 to 1000 in 15 attempts.");
            maxAttempts = 15;
            playGame(sc, randomNumberStep3, maxAttempts);
        }

        sc.close();
    }

    private static int playGame(Scanner sc, int randomNumber, int maxAttempts) {
        int num;
        int count = 0;

        System.out.print("Please enter the number: ");

        do {
            count++;
            num = sc.nextInt();

            if (num == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + count + " attempts.");
                break; // Exit the loop if the correct number is guessed
            } else if (num > randomNumber) {
                System.out.print("Try again! Enter a number less than " + num + ": ");
            } else {
                System.out.print("Try again! Enter a number greater than " + num + ": ");
            }

        } while (count < maxAttempts);

        System.out.println();

        if (count >= maxAttempts) {
            System.out.println("Sorry, you've reached the maximum number of attempts. Better luck next time!");
        }

        return count;
    }
}