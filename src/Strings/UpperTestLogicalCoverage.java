package upperLetter;

import org.junit.Test;
import static org.junit.Assert.*;

public class UpperTestLogicalCoverage {

    @Test
    public void whenNullInput_thenNullOutput() {
        assertNull("Null input should return null", Upper.toUpperCase(null));
    }

    @Test
    public void whenEmptyString_thenEmptyOutput() {
        assertEquals("Empty string should return empty", "", Upper.toUpperCase(""));
    }

    @Test
    public void whenAllLowercase_thenAllUppercase() {
        assertEquals("All lowercase should be converted to uppercase", "HELLO", Upper.toUpperCase("hello"));
    }

    @Test
    public void whenAllUppercase_thenUnchanged() {
        assertEquals("All uppercase should remain unchanged", "WORLD", Upper.toUpperCase("WORLD"));
    }

    @Test
    public void whenMixedCharacters_thenLowercaseConverted() {
        assertEquals("Mixed characters should only have lowercase letters converted", "123ABC!@", Upper.toUpperCase("123abc!@"));
    }

    @Test
    public void whenSingleLowercase_thenSingleUppercase() {
        assertEquals("Single lowercase letter should be converted to uppercase", "A", Upper.toUpperCase("a"));
    }

    @Test
    public void whenSingleUppercase_thenUnchanged() {
        assertEquals("Single uppercase letter should remain unchanged", "B", Upper.toUpperCase("B"));
    }
}
