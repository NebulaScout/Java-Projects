/* 99 Bottles of Beer on the Wall," a traditional American folk song that counts down bottles of beer on the wall.
 * As the song progresses, the number of bottles decreases until reaching zero. */

public class BeerSong {
    public static void main(String[] args) {
        byte bottlesNum = 99;
        String word = "bottles";

        while (bottlesNum > 0) {
            System.out.println(bottlesNum + " " + word + " of beer hanging on the wall.\n" + bottlesNum + " " + word + " of beer hanging on the wall.\nAnd if one bottle should accidentally fall,");
            bottlesNum--;

            if (bottlesNum == 1)
                word = "bottle";

            if (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum + " " + word + " of beer hanging on the wall.\n");
            } else {
                System.out.println("There'll be no bottles of beer hanging on the wall.");
            } // end of else
        } // end of while
    } // end of main method
} // end of class
