/**
 * OopsBannerApp UC4 - Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 *
 * @author Developer
 * @version 4
 */

// Extend the user story 3 to further develop the OOPS Banner Application
// by using String arrays to hold banner lines and printing them in a loop.
// This use case improves upon UC3 by using a String array to store banner lines
// and iterating through them with a for-each loop, eliminating hardcoded print
// statements and improving modularity and reusability.

// Hint: Store each row of the banner as a String in an array, then use a
// for-each loop to iterate through the array and print each line.

public class OopsBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {
        String[] bannerLines = {
            String.join(" ", " ***  ", " ***  ", "****  ", " *** "),
            String.join(" ", "*   * ", "*   * ", "*   * ", "*    "),
            String.join(" ", "*   * ", "*   * ", "****  ", " *   "),
            String.join(" ", "*   * ", "*   * ", "*     ", "  *  "),
            String.join(" ", " ***  ", " ***  ", "*     ", "***  ")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

}