package ValidParentheses;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidParenthesesLogicalTesting {

    // Reachability: Ensure all types of brackets are reached
    @Test
    public void testAllBracketsReach() {
        assertTrue("Expected true for '{[()]}'", ValidParentheses.isValid("{[()]}"));
    }

    // Test Predicates
    // Open brackets not closed (predicate fails)
    @Test
    public void testOpenBracketsNotClosed() {
        assertFalse("Expected false for '('", ValidParentheses.isValid("("));
    }

    // Open brackets closed by different type (predicate fails)
    @Test
    public void testMismatchClosingBracket() {
        assertFalse("Expected false for '(]'", ValidParentheses.isValid("(]"));
    }

    // Properly closed brackets (both predicates pass)
    @Test
    public void testProperlyClosedBrackets() {
        assertTrue("Expected true for '()'", ValidParentheses.isValid("()"));
    }

    // Active Clause Coverage (ACC)
    // Ensure `head == 0` influences the outcome
    @Test
    public void testClosingBracketFirst() {
        assertFalse("Expected false for ')'", ValidParentheses.isValid(")"));
    }

    // Ensure character comparison influences the outcome
    // Proper nesting
    @Test
    public void testProperNesting() {
        assertTrue("Expected true for '{}'", ValidParentheses.isValid("{}"));
    }

    // Incorrect nesting (incorrect type of bracket used to close)
    @Test
    public void testIncorrectNesting() {
        assertFalse("Expected false for '{)'", ValidParentheses.isValid("{)"));
    }
}
