package Math;
import static org.junit.Assert.*;
import org.junit.Test;

public class VolumeCubeTest {

    @Test
    public void testVolumeCubePositiveLarge() {
    	// Test Case 1: Large positive value
        double radius2 = 15.0;
        double expectedVolume2 = (4 * Math.PI * radius2 * radius2 * radius2) / 3;
        assertEquals(expectedVolume2, Volume.volumeSphere(radius2), 0.0001);
    }
    
    @Test
    public void testVolumeCubePositiveSmall() {
        // Test Case 2: Small positive value
        double radius3 = 0.5;
        double expectedVolume3 = (4 * Math.PI * radius3 * radius3 * radius3) / 3;
        assertEquals(expectedVolume3, Volume.volumeSphere(radius3), 0.0001);
    }
    
    @Test
    public void testVolumeCubeZero() {
    	// Test Case 3: Zero  value
    	double sideLength2 = 0.0;
        double expectedVolume2 = 0.0;
        assertEquals(expectedVolume2, Volume.volumeCube(sideLength2), 0.0001);
    }
    
    @Test(expected = AssertionError.class)
    public void testVolumeCubeNegative() {
    	double sideLength5 = -3.0;
        IllegalArgumentException exception5 = assertThrows(IllegalArgumentException.class, () -> {
            Volume.volumeCube(sideLength5);
        });
        assertEquals("Side length cannot be negative", exception5.getMessage());
    }
    
}


