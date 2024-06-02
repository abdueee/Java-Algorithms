package Anagram;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckAnagramsLogicCoverage {

    @Test
    public void testReachabilityWithNonEmptyStrings() {
        assertTrue("Reachability test with non-empty anagram strings",
            CheckAnagrams.isAnagrams("angel", "glean"));
    }

    @Test
    public void testPredicateWithAnagrams() {
        assertTrue("Predicate test with strings that are anagrams",
            CheckAnagrams.isAnagrams("listen", "silent"));
    }

    @Test
    public void testPredicateWithNonAnagrams() {
        assertFalse("Predicate test with strings that are not anagrams",
            CheckAnagrams.isAnagrams("apple", "paper"));
    }

    @Test
    public void testClauseCoverageWithPresentCharacter() {
        assertTrue("Clause coverage test with present character",
            CheckAnagrams.isAnagrams("a", "a"));
    }

    @Test
    public void testClauseCoverageWithNonPresentCharacter() {
        assertFalse("Clause coverage test with non-present character",
            CheckAnagrams.isAnagrams("a", "b"));
    }

    @Test
    public void testActiveClauseCoverageByChangingOutcomeWithSingleAddition() {
        assertFalse("Active clause coverage by changing outcome with single addition",
            CheckAnagrams.isAnagrams("dormitoryx", "dirtyroom"));
    }

    @Test
    public void testActiveClauseCoverageWithCaseInsensitivity() {
        assertTrue("Active clause coverage with case insensitivity",
            CheckAnagrams.isAnagrams("Listen", "Silent"));
    }
}
