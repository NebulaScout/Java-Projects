// A program that reverses a string input  and prints the output

package Reverse;
import java.util.Scanner;
// import java.util.Thread;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean reverse = true;

        while(reverse) {
            System.out.println("Input some data:[Leave blank and press Enter to exit the program]");  // get user input
            String userInput = scan.nextLine();

            if(userInput.isBlank()) {
                reverse = false;
                System.out.println("Exiting the program.");
                System.exit((0));
            }

            // Convert the string to an array
            char[] input = userInput.toCharArray();

            System.out.println("\nInput string: " + userInput);
            System.out.print("Reversed String: ");
            
            // Traverse the array
            for(int i = input.length; i > 0; i--) {
                System.out.print(input[i -1]); // print output in reverse
            } // end of for loop
            System.out.println("\n");
        }
        scan.close();
    } // end of main method
}
