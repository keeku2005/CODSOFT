//task1
import java.util.Random;
import java.util.Scanner;

public class java1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rounds = 0;
        int totalAttempts = 0;
        boolean playAgain = true;

        while (playAgain) {
            int attempts = 0;
            rounds++;

            // Generate a random number between 1 and 100
            int randomNumber = random.nextInt(100) + 1;
            boolean correctGuess = false;

            System.out.println("Round " + rounds + ": You have 10 attempts to guess the number.");

            // Repeat until the user guesses the correct number or runs out of attempts
            while (attempts < 10) {
                System.out.print("Enter your guess (1 to 100): ");
                int guess = scanner.nextInt();
                attempts++;
                totalAttempts++;

                if (guess < randomNumber) {
                    System.out.println("Too low!");
                } else if (guess > randomNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                    correctGuess = true;
                    break;
                }
            }

            if (!correctGuess) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + randomNumber);
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Game Over!");
        System.out.println("Total rounds played: " + rounds);
        System.out.println("Total attempts: " + totalAttempts);
        System.out.println("Average attempts per round: " + (totalAttempts / (double) rounds));

        scanner.close();
    }
}