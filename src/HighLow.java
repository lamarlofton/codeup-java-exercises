import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static final Random RANDOM = new Random();
    public static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
         int numberToFind = RANDOM.nextInt(MAX_NUMBER) + 1;
            Scanner userInput = new Scanner(System.in);
         int numberTries = 0, userGuess = 0;

         while (userGuess != numberToFind) {
            System.out.println("Guess a number between 1 and " + MAX_NUMBER + " : ");
            userGuess = userInput.nextInt();
            numberTries++;

            if (userGuess < 1 || userGuess > MAX_NUMBER) {
                System.out.println("Make sure the number is between 1 and " + MAX_NUMBER);
            } else if (userGuess > numberToFind) {
                System.out.println("You are too high !");
            } else if (userGuess < numberToFind) {
                System.out.println("You are too low !");
            }
        }
             userInput.close();
             System.out.println("Congrats you got the number " + numberToFind + " in " + numberTries + " tries");

        }

    }

