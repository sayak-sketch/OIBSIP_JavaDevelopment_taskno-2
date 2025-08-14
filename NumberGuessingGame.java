import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalScore = 0;
        final int SIGNIFICANT_DIFFERENCE = 20; 
        final int MODERATE_DIFFERENCE = 5;    
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("!!!!Welcome to the Number Guessing Game!!!!");
        System.out.println("-------------------------------------------");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("--------------------------------------------");
        System.out.println("Can you guess it?");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        while (playAgain) 
        {
            int numberToGuess = random.nextInt(100) + 1; 
            int numberOfAttempts = 0;
            int maxAttempts = 10; 
            boolean hasGuessedCorrectly = false;
            System.out.println("\n--- New Round ---");
            System.out.println("You have " + maxAttempts + " attempts to guess the number.");
            while (numberOfAttempts < maxAttempts && !hasGuessedCorrectly) 
            {
                System.out.print("Enter your guess: ");
                if (scanner.hasNextInt()) {
                    int userGuess = scanner.nextInt();
                    numberOfAttempts++;

                    if (userGuess < 1 || userGuess > 100) 
                    {
                        System.out.println("Please guess a number between 1 and 100.");
                    } 
                    else if (userGuess < numberToGuess) 
                    {
                        int difference = numberToGuess - userGuess;
                        if (difference > SIGNIFICANT_DIFFERENCE) 
                        {
                            System.out.println("Your guess is too low!");
                        } 
                        else if (difference >= MODERATE_DIFFERENCE) 
                        {
                            System.out.println("Your guess is low.");
                        } 
                        else 
                        {
                            System.out.println("Your guess is a little bit low."); 
                        }
                    } 
                    else if (userGuess > numberToGuess) 
                    {
                        int difference = userGuess - numberToGuess;
                        if (difference > SIGNIFICANT_DIFFERENCE) 
                        {
                            System.out.println("Your guess is too high!");
                        } else if (difference >= MODERATE_DIFFERENCE) 
                        {
                            System.out.println("Your guess is high.");
                        } else 
                        {
                            System.out.println("Your guess is a little bit high."); 
                        }
                    } 
                    else 
                    {
                        System.out.println("Congratulations! You guessed the number " + numberToGuess + " correctly in " + numberOfAttempts + " attempts!");
                        hasGuessedCorrectly = true;
                        int roundScore = maxAttempts - numberOfAttempts + 1; 
                        totalScore += roundScore;
                        System.out.println("You scored " + roundScore + " points this round.");
                    }
                } 
                else 
                {
                    System.out.println("Invalid input. Please enter a whole number.");
                    scanner.next(); 
                }
                if (!hasGuessedCorrectly && numberOfAttempts < maxAttempts) 
                {
                    System.out.println("Attempts left: " + (maxAttempts - numberOfAttempts));
                }
            }

            if (!hasGuessedCorrectly) 
            {
                System.out.println("Sorry, you ran out of attempts! The number was " + numberToGuess + ".");
            }
            System.out.println("Your total score is: " + totalScore);
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgainChoice = scanner.next().toLowerCase();
            playAgain = playAgainChoice.equals("yes");
        }
        System.out.println("Thanks for playing! Your final score is: " + totalScore);
        scanner.close();
    }
}