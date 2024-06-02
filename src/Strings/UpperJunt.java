package upperLetter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class UpperJunt {

    @Test
    public void testNullInput() {
        assertNull("Expected null for null input", Upper.toUpperCase(null));
    }

    @Test
    public void testEmptyString() {
        assertEquals("Expected empty string for empty input", "", Upper.toUpperCase(""));
    }

    @Test
    public void testMixedCaseLettersAndNumbers() {
        String input = "Abc123";
        String expected = "ABC123";
        assertEquals("Expected all uppercase letters with numbers unchanged", expected, Upper.toUpperCase(input));
    }

    @Test
    public void testAllLowerCaseLetters() {
        String input = "abc";
        String expected = "ABC";
        assertEquals("Expected all uppercase letters", expected, Upper.toUpperCase(input));
    }
}
