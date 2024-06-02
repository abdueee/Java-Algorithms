package CheckVowels;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckVowelsJunit {

    @Test
    public void isVowel() {
        assertTrue(CheckVowels.hasVowels("foo"));
        assertTrue(CheckVowels.hasVowels("bar"));
        assertFalse(CheckVowels.hasVowels("why"));
        assertFalse(CheckVowels.hasVowels("myths"));
    }
}