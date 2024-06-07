package GuessingGame;
import java.util.Scanner;

public class GuessTheNumber {
    // driver method
    public static void main(String[] args) {
        // TODO: Tell the user how the game works
            printDetails();
    }

    // TODO: Check for input mismatch exception
    public static String[] guessNum() {
        int randomNum = (int)(Math.ceil(Math.random() * 100));  // generate the random number
        byte count = 0;
        byte maxNumOfGuesses = 5;
        boolean correct = false;
        String[] gameStats = new String[3];   // store the game stats

        System.out.println(randomNum);
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
                System.out.println("Correct\n");
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

    public static void printDetails() {
        String[] stats = guessNum();
        String result;

        if (stats[0] == "true")
            result = "Congratulations, you won the game 🏆 🎊";
        else
            result = "Better luck next time 🥹";

        String blank = "";
        String heading = "Game Stats";
        String hyphens = String.format("%50s", blank).replace(" ", "-");
        System.out.println(hyphens + "\n" 
                            + String.format("%32s", heading) + "\n"
                            + hyphens + "\n"
                            + result + "\n\n"
                            + "Number of guesses: " + stats[1] + "\n"
                            + "The correct number is " + stats[2] + "\n");
    }
}