package Searches;

import static org.junit.Assert.*;

import org.junit.Test;

public class KMPSearchTest {

	//---------------ISP TESTING-------------------------------------

	// Boundary Value Analysis (BVA) testing for empty strings
    @Test
    void testEmptyStrings() {
        KMPSearch kmpSearch = new KMPSearch();
        assertEquals(-1, kmpSearch.KMPSearch("", ""));
        assertEquals(-1, kmpSearch.KMPSearch("", "abc"));
        assertEquals(-1, kmpSearch.KMPSearch("abc", ""));
    }


    // Boundary Value Analysis (BVA) testing for equal-length strings
    @Test
    void testEqualLengthStrings() {
        KMPSearch kmpSearch = new KMPSearch();
        assertEquals(0, kmpSearch.KMPSearch("abc", "abc"));
        assertEquals(-1, kmpSearch.KMPSearch("abc", "def"));
    }

    // Equivalence Partitioning testing for pattern not found in the text
    @Test
    void testPatternNotFound_ISP() {
        KMPSearch kmpSearch = new KMPSearch();
        assertEquals(-1, kmpSearch.KMPSearch("abc", "defgh"));
    }

    // Equivalence Partitioning testing for pattern found in the text
    @Test
    void testPatternFound_ISP() {
        KMPSearch kmpSearch = new KMPSearch();
        assertEquals(2, kmpSearch.KMPSearch("abc", "xxabcxx"));
        assertEquals(0, kmpSearch.KMPSearch("abc", "abcabc"));
    }
    
    
   //---------------Logic based testing--------------------------
    @Test
    // Reachability Test case to check if the pattern and text are non-empty strings
    void testReachabilityNonEmptyStrings() {
        KMPSearch kmpSearch = new KMPSearch();
        assertEquals(2, kmpSearch.KMPSearch("ab", "xabcy"));
    }

    @Test
    // Reachability Test case to check if either the pattern or text is an empty string
    void testReachabilityEmptyStrings() {
        KMPSearch kmpSearch = new KMPSearch();
        assertEquals(-1, kmpSearch.KMPSearch("", "xabcy"));
        assertEquals(-1, kmpSearch.KMPSearch("ab", ""));
    }

    @Test
    // Test case for predicate and clause coverage where pattern length = 1
    void testPatternLengthOne() {
        KMPSearch kmpSearch = new KMPSearch();
        assertEquals(1, kmpSearch.KMPSearch("a", "aab"));
        
        //test to check Text Length Greater Than One
        assertEquals(3, kmpSearch.KMPSearch("abc", "xabcy"));
    }

    @Test
    // Test case for predicate and clause coverage where pattern length > 1
    void testPatternLengthGreaterThanOne() {
        KMPSearch kmpSearch = new KMPSearch();
        assertEquals(0, kmpSearch.KMPSearch("ab", "abc"));
    }

    @Test
    // Test case for predicate and clause coverage where text length = 1
    void testTextLengthOne() {
        KMPSearch kmpSearch = new KMPSearch();
        assertEquals(0, kmpSearch.KMPSearch("ab", "a"));
    }

    


}
