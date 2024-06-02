package Math;
import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialTest {
	
	  @Test
	    public void testFactorialPositiveSmall() {
	        // Test Case 1: Testing factorial of a positive small number
	        int n1 = 5;
	        long expectedFactorial1 = 120; // 5! = 5*4*3*2*1 = 120
	        assertEquals(expectedFactorial1, Factorial.factorial(n1));
	    }
	  
	  @Test
	    public void testFactorialPositiveLarge() {
	        // Test Case 2: Testing factorial of a positive large number
	        int n2 = 10;
	        long expectedFactorial1 = 3628800; 
	        assertEquals(expectedFactorial1, Factorial.factorial(n2));
	    }

	    @Test
	    public void testFactorialZero() {
	        // Test Case 3: Testing factorial of 0 
	        int n3 = 0;
	        long expectedFactorial2 = 1; 
	        assertEquals(expectedFactorial2, Factorial.factorial(n3));
	    }

	    @Test (expected = IllegalArgumentException.class)
	    public void testFactorialNegativeSmall() {
	        // Test Case 4: Testing factorial of a small negative number
	        int n4 = -5;
	        Factorial.factorial(n4);
	    }
	    
	    @Test (expected = IllegalArgumentException.class)
	    public void testFactorialNegativeLarge() {
	        // Test Case 5: Testing factorial of a large negative number 
	        int n5 = -205;
	        Factorial.factorial(n5);
	    }
}

