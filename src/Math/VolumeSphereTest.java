package Math;
import static org.junit.Assert.*;
import org.junit.Test;

public class VolumeSphereTest {
	
	@Test
    public void testVolumeSpherePositiveSmall() {
		 // Test Case 1: Small positive radius
        double radius1 = 2.0;
        double expectedVolume1 = (4 * Math.PI * radius1 * radius1 * radius1) / 3;
        assertEquals(expectedVolume1, Volume.volumeSphere(radius1), 0.0001);
    }
	
	@Test
    public void testVolumeSpherePositiveLarge() {
		 // Test Case 2: Large positive radius
        double radius1 = 140.0;
        double expectedVolume1 = (4 * Math.PI * radius1 * radius1 * radius1) / 3;
        assertEquals(expectedVolume1, Volume.volumeSphere(radius1), 0.0001);
    }
	
    @Test
    public void testVolumeSphereZeroRadius() {
    	// Test Case 3: Zero radius
        double radius4 = 0.0;
        double expectedVolume4 = 0.0;
        assertEquals(expectedVolume4, Volume.volumeSphere(radius4), 0.0001);
    }

    @Test (expected = AssertionError.class)
    public void testVolumeSphereNegativeRadiusSmall() {
        // Test Case 4: Small negative radius
        double radius5 = -1.0;
        IllegalArgumentException exception5 = assertThrows(IllegalArgumentException.class, () -> {
            Volume.volumeSphere(radius5);
        });
        assertEquals("Radius cannot be negative", exception5.getMessage());
    }
    
    @Test (expected = AssertionError.class)
    public void testVolumeSphereNegativeRadiusLarge() {
    	 // Test Case 5: Large negative radius
        double radius5 = -100.0;
        IllegalArgumentException exception5 = assertThrows(IllegalArgumentException.class, () -> {
            Volume.volumeSphere(radius5);
        });
        assertEquals("Radius cannot be negative", exception5.getMessage());
    }

}

