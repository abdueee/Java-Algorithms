package CheckVowels;

import java.util.Set;
import java.util.stream.Collectors;

public class CheckVowels {

    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u'); // Simplified initialization
    public static boolean hasVowels(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        // Use streams for checking vowels. This avoids converting the entire string to lower case upfront.
        return input.chars() // Creates an IntStream
                .mapToObj(c -> (char) c) // Converts int to Character
                .map(Character::toLowerCase) // Converts to lower case
                .anyMatch(VOWELS::contains); // Checks if any characters match the vowels
    }
}
