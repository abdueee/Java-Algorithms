package CheckVowels;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckVowelsLogicalCoverage {

    // Test for reachability - empty string
    @Test
    public void whenEmptyString_thenNoVowels() {
        assertFalse("An empty string should not have vowels", CheckVowels.hasVowels(""));
    }

    // Predicate tests
    // Test for string without vowels
    @Test
    public void whenStringHasNoVowels_thenFalse() {
        assertFalse("A string without vowels should return false", CheckVowels.hasVowels("bcdfg"));
    }

    // Test for string with vowels
    @Test
    public void whenStringHasVowels_thenTrue() {
        assertTrue("A string with vowels should return true", CheckVowels.hasVowels("hello"));
    }

    // Active Clause Coverage (ACC) tests
    // Test single vowel (active clause directly influences outcome)
    @Test
    public void whenSingleVowel_thenTrue() {
        assertTrue("A single vowel 'a' should return true", CheckVowels.hasVowels("a"));
    }

    // Test single non-vowel
    @Test
    public void whenSingleNonVowel_thenFalse() {
        assertFalse("A single non-vowel 'b' should return false", CheckVowels.hasVowels("b"));
    }

    // Test mixed case and special characters, ensuring vowels are detected amidst noise
    @Test
    public void whenMixedCaseAndSpecialCharacters_thenDetectedVowelTrue() {
        assertTrue("A string with mixed case and special characters that contains a vowel should return true", CheckVowels.hasVowels("!@#E$%"));
    }
}
