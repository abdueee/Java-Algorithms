package CheckVowels;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckVowelsISP {

    // 1. Minimum: Empty String
    @Test
    public void testEmptyString() {
        assertFalse("Expected false for an empty string", CheckVowels.hasVowels(""));
    }

    // 2. Above Minimum: Single Character
    @Test
    public void testSingleVowel() {
        assertTrue("Expected true for a single vowel 'a'", CheckVowels.hasVowels("a"));
    }

    @Test
    public void testSingleNonVowel() {
        assertFalse("Expected false for a single non-vowel 'b'", CheckVowels.hasVowels("b"));
    }

    // 3. Nominal: Short String With Mixed Characters
    @Test
    public void testShortStringWithVowels() {
        assertTrue("Expected true for 'hello'", CheckVowels.hasVowels("hello"));
    }

    @Test
    public void testShortStringWithoutVowels() {
        assertFalse("Expected false for 'bcdf'", CheckVowels.hasVowels("bcdf"));
    }

    // 4. Below Maximum: Long String
    @Test
    public void testLongStringWithVowels() {
        assertTrue("Expected true for a long word with vowels", CheckVowels.hasVowels("pneumonoultramicroscopicsilicovolcanoconiosis"));
    }

    // 5. Maximum: String at Maximum Length
    @Test
    public void testMaximumLengthStringWithoutVowels() {
        String longString = new String(new char[1000]).replace('\0', 'b'); // 1000 'b' characters
        assertFalse("Expected false for a maximum length string without vowels", CheckVowels.hasVowels(longString));
    }
}
