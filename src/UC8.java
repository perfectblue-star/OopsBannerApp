import java.util.HashMap;

/**
 * OopsBannerApp UC8 - Use Map for Character Patterns and Render via Function
 * This final version utilizes the Collections Framework (HashMap) and 
 * StringBuilder for an efficient, modular, and scalable banner system.
 * * @author Developer
 * @version 8.0
 */
public class UC8 {

    public static void main(String[] args) {
        // 1. Initialize the character map
        HashMap<Character, String[]> charMap = createCharacterMap();
        
        // 2. Define the message to display
        String message = "Oops";
        
        // 3. Display the banner using the modular function
        displayBanner(message, charMap);
    }

    /**
     * Creates a HashMap containing ASCII art patterns for characters.
     * Each character (key) maps to a String array (value) representing the pattern lines.
     */
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
            " OOO ", "O   O", "O   O", "O   O", "O   O", "O   O", " OOO "
        });
        charMap.put('P', new String[]{
            "PPPP ", "P   P", "P   P", "PPPP ", "P    ", "P    ", "P    "
        });
        charMap.put('S', new String[]{
            " SSSS", "S    ", "S    ", " SSS ", "    S", "    S", "SSSS "
        });

        return charMap;
    }

    /**
     * Renders the input message as a large ASCII art banner.
     * Uses StringBuilder for efficient horizontal concatenation of character lines.
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        // Assuming all patterns have the same height (7 lines)
        int patternHeight = 7;

        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : message.toUpperCase().toCharArray()) {
                if (charMap.containsKey(ch)) {
                    // Append the specific line for the current character plus a separator space
                    sb.append(charMap.get(ch)[line]).append("  ");
                }
            }
            // Print the completed line to the console
            System.out.println(sb.toString());
        }
    }
}