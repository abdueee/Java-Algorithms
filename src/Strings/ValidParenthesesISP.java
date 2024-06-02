package ValidParentheses;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidParenthesesISP {

    // Minimum: Empty String
    @Test
    public void testEmptyString() {
        assertTrue("Expected true for an empty string", ValidParentheses.isValid(""));
    }

    // Above Minimum: Single Bracket
    @Test
    public void testSingleBracket() {
        assertFalse("Expected false for '('", ValidParentheses.isValid("("));
        assertFalse("Expected false for ')'", ValidParentheses.isValid(")"));
        assertFalse("Expected false for '['", ValidParentheses.isValid("["));
        assertFalse("Expected false for ']'", ValidParentheses.isValid("]"));
        assertFalse("Expected false for '{'", ValidParentheses.isValid("{"));
        assertFalse("Expected false for '}'", ValidParentheses.isValid("}"));
    }

    // Nominal: Simple Matching Pairs
    @Test
    public void testSimpleMatchingPairs() {
        assertTrue("Expected true for '()'", ValidParentheses.isValid("()"));
        assertTrue("Expected true for '[]'", ValidParentheses.isValid("[]"));
        assertTrue("Expected true for '{}'", ValidParentheses.isValid("{}"));
    }

    // Below Maximum: Nested Structures
    @Test
    public void testNestedStructures() {
        assertTrue("Expected true for '(())'", ValidParentheses.isValid("(())"));
        assertTrue("Expected true for '[[]]'", ValidParentheses.isValid("[[]]"));
        assertTrue("Expected true for '{{}}'", ValidParentheses.isValid("{{}}"));
        assertTrue("Expected true for '([{}])'", ValidParentheses.isValid("([{}])"));
    }

    // Maximum: Long Balanced Strings
    @Test
    public void testLongBalancedStrings() {
        // Building a long balanced string by repeating a pattern
        StringBuilder longBalancedString = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            longBalancedString.append("({[]})");
        }
        assertTrue("Expected true for a long balanced string", ValidParentheses.isValid(longBalancedString.toString()));
    }

}
