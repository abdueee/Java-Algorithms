package ValidParentheses;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidParenthesesJunitTest {

    @Test
    public void testValidParenthesesSimple() {
        assertTrue("Expected true for '()'", ValidParentheses.isValid("()"));
        assertTrue("Expected true for '[]'", ValidParentheses.isValid("[]"));
        assertTrue("Expected true for '{}'", ValidParentheses.isValid("{}"));
    }

    @Test
    public void testValidComplexParentheses() {
        assertTrue("Expected true for '({[]})'", ValidParentheses.isValid("({[]})"));
        assertTrue("Expected true for '([]{})'", ValidParentheses.isValid("([]{})"));
        assertTrue("Expected true for '{[()()]}'", ValidParentheses.isValid("{[()()]}"));
    }

    @Test
    public void testInvalidParentheses() {
        assertFalse("Expected false for '(]'", ValidParentheses.isValid("(]"));
        assertFalse("Expected false for '([)]'", ValidParentheses.isValid("([)]"));
        assertFalse("Expected false for '{[(])}'", ValidParentheses.isValid("{[(])}"));
    }

    @Test
    public void testInvalidCloseParenthesesFirst() {
        assertFalse("Expected false for ')('", ValidParentheses.isValid(")("));
        assertFalse("Expected false for ']['", ValidParentheses.isValid("]["));
    }

    @Test
    public void testEmptyString() {
        assertTrue("Expected true for an empty string", ValidParentheses.isValid(""));
    }

    @Test
    public void testSingleOpenBracket() {
        assertFalse("Expected false for '('", ValidParentheses.isValid("("));
        assertFalse("Expected false for '['", ValidParentheses.isValid("["));
        assertFalse("Expected false for '{'", ValidParentheses.isValid("{"));
    }

    @Test
    public void testSingleCloseBracket() {
        assertFalse("Expected false for ')'", ValidParentheses.isValid(")"));
        assertFalse("Expected false for ']'", ValidParentheses.isValid("]"));
        assertFalse("Expected false for '}'", ValidParentheses.isValid("}"));
    }

    @Test
    public void testMismatchedLengths() {
        assertFalse("Expected false for '(()'", ValidParentheses.isValid("(()"));
        assertFalse("Expected false for '([]'", ValidParentheses.isValid("([]"));
        assertFalse("Expected false for '{()'", ValidParentheses.isValid("{()"));
    }
}
