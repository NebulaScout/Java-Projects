// A program that reverses a string input  and prints the output

package Reverse;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input some data");  // get user input
        String userInput = scan.nextLine();
        scan.close();

        // Convert the string to an array
        char[] input = userInput.toCharArray();

        System.out.println("\nInput string: " + userInput);
        System.out.print("Reversed String: ");
        // Traverse the array
        for(int i = input.length; i > 0; i--) {
            System.out.print(input[i -1]); // print output in reverse
        } // end of for loop
        System.out.println();
    } // end of main method
}
