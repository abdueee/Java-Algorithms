package Anagram;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckAnagramsISP {

    @Test
    public void testWithEmptyStrings() {
        assertTrue("Both strings are empty, should be considered anagrams",
            CheckAnagrams.isAnagrams("", ""));
    }

    @Test
    public void testSingleCharacterStringsSame() {
        assertTrue("Single character strings that are the same should be considered anagrams",
            CheckAnagrams.isAnagrams("a", "a"));
    }

    @Test
    public void testSingleCharacterStringsDifferent() {
        assertFalse("Single character strings that are different should not be considered anagrams",
            CheckAnagrams.isAnagrams("a", "b"));
    }

    @Test
    public void testCaseSensitivity() {
        assertTrue("Anagrams with different cases should not be considered anagrams",
            CheckAnagrams.isAnagrams("Silent", "Listen"));
    }

    @Test
    public void testAnagramsIncludingSpacesAndPunctuation() {
        assertFalse("Strings that are anagrams but include spaces or punctuation should not be considered anagrams",
            CheckAnagrams.isAnagrams("dormitory", "dirty room##"));
    }

    @Test
    public void testPerfectAnagrams() {
        assertTrue("Strings that are perfect anagrams should be considered anagrams",
            CheckAnagrams.isAnagrams("binary", "brainy"));
    }

    @Test
    public void testNearAnagrams() {
        assertFalse("Strings that are almost anagrams except for one character should not be considered anagrams",
            CheckAnagrams.isAnagrams("binary", "brainly"));
    }
}
