package GuessingGame;
import java.util.Scanner;

public class GuessTheNumber {
    // driver method
    public static void main(String[] args) {
            printDetails();
    }

    // TODO: Check for input mismatch exception
    public static String[] guessNum() {
        int randomNum = (int)(Math.ceil(Math.random() * 100));  // generate the random number
        byte count = 0;
        byte maxNumOfGuesses = 6;
        boolean correct = false;
        String[] gameStats = new String[3];   // store the game stats

        // System.out.println(randomNum);
        Scanner scan = new Scanner(System.in);
        while(count <= maxNumOfGuesses) {
            // exit the game if the user has used up all of his/her chances
            if(count == maxNumOfGuesses)
                break;

            // TODO: Tell user how many guesses are remaining
            System.out.println("Guess the number.");
            int userGuess = scan.nextInt();
            count++;
            
            // check if the user has guessed the correct number
            // exit the game if the guessed number is correct
            if(userGuess == randomNum) {
                System.out.println("Spot on!\n");
                scan.close();
                correct = true;
                gameStats[0] = Boolean.toString(correct);
                gameStats[1] = Integer.toString(count);
                gameStats[2] = Integer.toString(randomNum);
                return gameStats;
            }

            // informs the user about their choice
            // that is, if the number is too high or too low
            if(userGuess > randomNum)
                System.out.println("Too high!\n");
            else
                System.out.println("Too low!\n");
        } // end of while loop

        scan.close();
        // stores the stats if the user was unable to guess the correct number
        gameStats[0] = Boolean.toString(correct);
        gameStats[1] = Integer.toString(count);
        gameStats[2] = Integer.toString(randomNum);
        return gameStats;

    }

    // print the details
    public static void printDetails() {
        String blank = "";
        String heading = "Welcome to the Number Guessing Game!\n";
        String intro = String.format("%130s", blank).replace(" ", "-"); // format the output
        // tell the user about the game and how to play
        System.out.println(intro + "\n\n"
                            + String.format("%80s", heading) + "\n"
                            + intro
                            + "\n\nIn this exciting game, the program will randomly generate a secret number between 1 and 100.\nYour mission is to guess this number.\n\n"
                            + "Here's how it works:\n\n"
                            + "\t- You have 6 attempts to guess the correct number.\n"
                            + "\t- After each guess, the program will tell you if your guess is too high, too low or spot on!\n"
                            + "\t- Use the feedback to refine your next guess and try to pinpoint the secret number.\n"
                            + "\nThink you can outsmart the computer? Give it a try and see if you can guess the number within 6 attempts!\n"
                            + "\nGood luck and have fun!\n\n"
                            + intro + "\n");

        // TODO: Add press enter to start feature

        String[] stats = guessNum();
        String result;

        // check if the user guessed the right number
        if (stats[0] == "true")
            result = "Congratulations, you won the game! 🏆🎊";
        else
        result = "You’ve used all your chances 🥹. Better luck next time!";
    
        // print the stats of the game
        String headingStats = String.format("%60s", blank).replace(" ", "-");
        heading = "Game Stats";
        System.out.println(headingStats + "\n\n" 
                            + String.format("%32s", heading) + "\n\n"
                            + headingStats + "\n\n"
                            + result + "\n\n"
                            + "Number of guesses: " + stats[1] + "\n"
                            + "The correct number is " + stats[2] + "\n");
    }
}