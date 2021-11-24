/**
 * 
 */
package testing;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author gamuc
 *
 */
public class MedianUnitTests1 {

	@Test
	public void FindMedianTest1() {
		//Arrange 
		double num1 = 67.0;
		double num2 = 8.0;
		double num3 = 56.0;
		double expectedMedian = 56.0;
		double actualMedian; 
		Median m = new Median(num1, num2, num3);
		
		//Act
		actualMedian = m.CalculateMedian(num1, num2, num3);
		
		//Assert
		assertTrue("Median calculated incorrectly", expectedMedian == actualMedian);
	}

}
