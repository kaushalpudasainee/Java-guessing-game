import java.util.Scanner;//read user input
import java.util.Random;//generate random number

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//to read user guess
        Random random = new Random();//generate random numbers
        int secretNumber = random.nextInt(10) + 1;//random integer between 1 to 10
        int guess = 0;//initialized before the user has guessed
        int numGuesses = 0;//increases everytime by 1 when user make guesses

        System.out.println("Guess a number between 1 and 10:");

        while (guess != secretNumber) {
            guess = input.nextInt();//reads the integer value from user and the process continued until user guess was correct.
            numGuesses++;

            if (guess < secretNumber) {
                System.out.println("Too low! Guess again:");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Guess again:");
            }
        }

        System.out.println("Congratulations, you guessed the secret number correctly" + numGuesses + " guesses!");
    }
}