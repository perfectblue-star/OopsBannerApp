/**
 * OopsBannerApp UC6 - OOPS Banner Application (Use Case 6)
 *
 * This use case extends UC5 by implementing a modular approach to generate each
 * letter's pattern through dedicated methods. This enhances code reusability and
 * maintainability by separating pattern generation logic from the main display logic.
 *
 * @author Developer
 * @version 6.0
 */

// Extend the User Story 5 to display the OOPS banner using a modular approach
// where each letter (O, P, S) has its own dedicated method that returns a
// String array representing the rows of that letter's ASCII pattern.

// Key Requirements:
// - Create a separate static method for each letter: getOPattern(), getPPattern(), getSPattern()
// - Each method returns a String[] containing the rows for that letter
// - The main method assembles the full banner by combining patterns side by side
// - Use a for loop with index to combine each row across all letter patterns

// Hint: Each method returns a String[] of 5 rows. In main(), use a standard
// for loop with an index i to access oPattern[i], pPattern[i], sPattern[i]
// and concatenate them side by side for each row of the banner.

public class OopsBannerApp {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            " *** ",
            "*    ",
            " *   ",
            "   * ",
            " *** "
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {

        // Declare String Arrays to hold patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Use the loop to assemble each line of the banner to create the
        // visual effect for the message "OOPS"
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "  " + oPattern[i] + "  " + pPattern[i] + "  " + sPattern[i]);
        }
    }
}