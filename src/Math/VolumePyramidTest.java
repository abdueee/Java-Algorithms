package Math;
import org.junit.Test;
import static org.junit.Assert.*;

public class VolumePyramidTest {

	@Test
    public void testVolPyramidPositiveSmall() {
        // Test Case 1: Typical positive base area and height
        double baseArea1 = 10.0;
        double height1 = 5.0;
        double expectedVolume1 = (baseArea1 * height1) / 3;
        assertEquals(expectedVolume1, Volume.volumePyramid(baseArea1, height1), 0.0001);
    }

	@Test
    public void testVolPyramidPositiveLarge() {
        // Test Case 2: Typical positive base area and height
        double baseArea1 = 100.0;
        double height1 = 55.0;
        double expectedVolume1 = (baseArea1 * height1) / 3;
        assertEquals(expectedVolume1, Volume.volumePyramid(baseArea1, height1), 0.0001);
    }
	
    @Test
    public void testVolumePyramidZeroBase() {
        // Test Case 3: Zero base area
        double baseArea4 = 0.0;
        double height4 = 10.0;
        double expectedVolume4 = 0.0;
        assertEquals(expectedVolume4, Volume.volumePyramid(baseArea4, height4), 0.0001);
    }
    
    @Test
    public void testVolumePyramidZeroHeight() {
       
        // Test Case 4: Zero height
        double baseArea5 = 25.0;
        double height5 = 0.0;
        double expectedVolume5 = 0.0;
        assertEquals(expectedVolume5, Volume.volumePyramid(baseArea5, height5), 0.0001);
    }
    
    @Test
    public void testVolumePyramidZeroBaseAndHeight() {
        // Test Case 5: Zero base area and Zero Height
        double baseArea4 = 0.0;
        double height4 = 0.0;
        double expectedVolume4 = 0.0;
        assertEquals(expectedVolume4, Volume.volumePyramid(baseArea4, height4), 0.0001);
    }

}

