package Anagram;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckAnagramsMutation {

    @Test
    public void testEmptyStringsAreAnagrams() {
        assertTrue("Empty strings should be considered anagrams", CheckAnagrams.isAnagrams("", ""));
    }

    @Test
    public void testSingleCharacterAnagrams() {
        assertTrue("Single characters that are the same should be anagrams", CheckAnagrams.isAnagrams("a", "a"));
    }

    @Test
    public void testSingleCharacterNonAnagrams() {
        assertFalse("Single characters that are different should not be anagrams", CheckAnagrams.isAnagrams("a", "b"));
    }

    @Test
    public void testDifferentLengthStrings() {
        assertFalse("Strings of different lengths should not be anagrams", CheckAnagrams.isAnagrams("abc", "ab"));
    }

    @Test
    public void testIdenticalStringsAreAnagrams() {
        assertTrue("Identical strings should be considered anagrams", CheckAnagrams.isAnagrams("abc", "abc"));
    }

    @Test
    public void testActualAnagrams() {
        assertTrue("Strings that are anagrams should be recognized as such", CheckAnagrams.isAnagrams("listen", "silent"));
    }

    @Test
    public void testNonAnagrams() {
        assertFalse("Strings that are not anagrams should be recognized as such", CheckAnagrams.isAnagrams("example", "samples"));
    }

    @Test
    public void testAnagramsCaseInsensitive() {
        assertTrue("Anagrams regardless of case should be detected", CheckAnagrams.isAnagrams("Listen", "Silent"));
    }

    @Test
    public void testStringsWithNonAlphabeticCharacters() {
        assertTrue("Non-alphabetic characters should not affect anagram status", CheckAnagrams.isAnagrams("a!b@c#", "c#b@a!"));
    }

    @Test
    public void testNotAnagramsDueToExtraLetter() {
        assertFalse("An extra letter in one string should prevent them from being anagrams", CheckAnagrams.isAnagrams("abcde", "abcd"));
    }

}
