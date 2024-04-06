package Searches;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerfectBinarySearchTest {

	
	// Code for testing Mutation testing 
	@Test
    public void testIntegerBinarySearch() {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        PerfectBinarySearch<Integer> binarySearch = new PerfectBinarySearch<>();

        // Test cases for elements present in the array
        assertEquals(0, binarySearch.find(array, 1)); // First element
        assertEquals(4, binarySearch.find(array, 5)); // Middle element

    }


}
