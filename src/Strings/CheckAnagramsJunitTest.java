package Anagram;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckAnagramsJunitTest {

    @Test
    public void testIsAnagramsPositive() {
        assertTrue(CheckAnagrams.isAnagrams("Listen", "Silent"));
    }

    @Test
    public void testIsAnagramsNegative() {
        assertFalse(CheckAnagrams.isAnagrams("Hello", "World"));
    }

    @Test
    public void testIsAnagramsEdgeCaseEmptyStrings() {
        assertTrue(CheckAnagrams.isAnagrams("", ""));
    }
}
