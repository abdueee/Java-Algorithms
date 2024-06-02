package Math;
import static org.junit.Assert.*;
import org.junit.Test;

public class AverageTest {
	
	@Test
    public void testAveragePositiveNumbersLarge() {
        // Test Case 1: Large positive numbers
        int[] numbers2 = {1000, 2000, 3000, 4000};
        int expectedAverage2 = 2500; // (1000 + 2000 + 3000 + 4000) / 4 = 2500
        assertEquals(expectedAverage2, Average.average(numbers2));
    }
	
	@Test
    public void testAveragePositiveNumbersSmall() {
        // Test Case 2: Small positive numbers
        int[] numbers3 = {1, 2, 3, 4};
        int expectedAverage3 = 2; // (1 + 2 + 3 + 4) / 4 = 2
        assertEquals(expectedAverage3, Average.average(numbers3));
    }

    @Test
    public void testAverageAllNegativeNumbers() {
        // Test Case 3: All negative numbers
        int[] numbers4 = {-5, -10, -15, -20};
        int expectedAverage4 = -12; // (-5 + -10 + -15 + -20) / 4 = -12
        assertEquals(expectedAverage4, Average.average(numbers4));
    }
    
    @Test
    public void testAverageMixNegativeNumbers() {
        // Test Case 4: Mixed positive and negative numbers
        int[] numbers5 = {-5, 10, -15, 20};
        int expectedAverage5 = 2; // (-5 + 10 + -15 + 20) / 4 = 2
        assertEquals(expectedAverage5, Average.average(numbers5));
    }
    
    @Test
    public void testAverageSingleNumber() {
        // Test Case 4: single number
        int[] numbers5 = {20};
        int expectedAverage5 = 20; 
        assertEquals(expectedAverage5, Average.average(numbers5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAverageEmptyArray() {
        // Test Case 5: Empty array (expecting exception)
        int[] numbers6 = {};
        Average.average(numbers6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAverageNullArray() {
        // Test Case 6: Null array (expecting exception)
        int[] numbers7 = null;
        Average.average(numbers7);
    }
}

