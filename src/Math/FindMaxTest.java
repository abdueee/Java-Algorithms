package Math;
import static org.junit.Assert.*;
import org.junit.Test;

public class FindMaxTest {
	
	@Test
    public void testFindMaxPositiveNums() {
        // Test Case 1: Typical case with positive numbers
        int[] arr = {3, 7, 2, 9, 5};
        int expectedMax1 = 9;
        assertEquals(expectedMax1, FindMax.findMax(arr));
    }
	
	@Test
    public void testFindMaxNegativeNums() {
        // Test Case 2: Array with negative numbers
        int[] arr = {-10, -5, -8, -3};
        int expectedMax2 = -3;
        assertEquals(expectedMax2, FindMax.findMax(arr));
    }
	
	@Test
    public void testFindMaxPosAndNegNums() {
        // Test Case 3: Array with both positive and negative numbers
        int[] arr = {-2, 7, -5, 12, 0};
        int expectedMax3 = 12;
        assertEquals(expectedMax3, FindMax.findMax(arr));
    }

	@Test(expected = IllegalArgumentException.class)
    public void testFindMaxEmptyArray() {
        // Test Case 4: Empty array
        int[] arr = {};
        FindMax.findMax(arr);
    }
	
	@Test
    public void testFindMaxEqualElements() {
        // Test Case 5: Array with all elements equal
        int[] arr = {5, 5, 5, 5, 5};
        int expectedMax6 = 5;
        assertEquals(expectedMax6, FindMax.findMax(arr));
    }

    @Test
    public void testFindMaxLargeArrayMix() {
        // Test Case 6: Large array with random elements
        int[] arr = {-100, 200, 350, 0, 75, -45, 65, 89, -200, 450, 12, 101};
        int expectedMax7 = 450;
        assertEquals(expectedMax7, FindMax.findMax(arr));
    }
    
    @Test
    public void testFindMaxLargeArrayPositive() {
        // Test Case 7: Large array with random elements
        int[] arr = {100, 200, 350, 0, 75, 45, 65, 89, 300, 450, 12, 101, 890, 29};
        int expectedMax7 = 890;
        assertEquals(expectedMax7, FindMax.findMax(arr));
    }

    @Test
    public void testFindMaxSingleElementArray() {
        // Test Case 8: Array with a single element
        int[] arr = {8};
        int expectedMax5 = 8;
        assertEquals(expectedMax5, FindMax.findMax(arr));
    }

}


