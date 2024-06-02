package upperLetter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UpperTestISP {

    @Test
    public void testEmptyString() {
        assertEquals("Empty string should remain empty", "", Upper.toUpperCase(""));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals("Single lowercase letter should be uppercase", "A", Upper.toUpperCase("a"));
        assertEquals("Digit should remain unchanged", "1", Upper.toUpperCase("1"));
    }

    @Test
    public void testMixedCaseString() {
        assertEquals("Mixed case string should be all uppercase", "ABCDE", Upper.toUpperCase("AbcDe"));
    }

    @Test
    public void testLongStringWithLettersOnly() {
        String longInput = "abcdefghijklmnopqrstuvwxyz".repeat(10); // Example long string
        String expected = longInput.toUpperCase();
        assertEquals("Long string of letters should be all uppercase", expected, Upper.toUpperCase(longInput));
    }

    @Test
    public void testMaximumLengthStringWithMixedCharacters() {
        String mixedInput = "aBc123!@#".repeat(100); // Hypothetical maximum length mixed string
        String expected = mixedInput.toUpperCase();
        assertEquals("Maximum length mixed string should have letters in uppercase", expected, Upper.toUpperCase(mixedInput));
    }
}
