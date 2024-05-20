/* A sum-based project where the user will input two numbers (which are treated as the variables A and B),
 and the program will add them together and present the sum of A + B. */

package Sum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumAB {
    private int numA;
    private int numB;
    private int sum;

    public void userInput() {
        boolean inputValue = true;  //flag
        Scanner scan = new Scanner(System.in);
        //loop through the input
        do {    
            try {   // handle invalid inputs
                System.out.println("Enter the first integer.");
                numA = scan.nextInt();
                System.out.println("\nEnter the second integer.");
                numB = scan.nextInt();
                inputValue = false;
            } catch(InputMismatchException im) {
                System.out.println("\nValue must be an integer");
                scan.nextLine();
            }
        } while(inputValue);
        scan.close();
    }

    public int getNumA() { return numA; }

    public int getNumB() { return numB; }

    public int getSum() {
        sum = Integer.sum(numA, numB);
        return sum;
    }

    // main method
    public static void main(String[] args) {
        SumAB s = new SumAB();
        s.userInput();
        System.out.println( "The sum of " + s.getNumA() + " and " + s.getNumB() + " is " + s.getSum() + ".");
    }
} // end of sumAB
