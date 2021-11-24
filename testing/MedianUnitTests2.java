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
public class MedianUnitTests2 {

	@Test
	public void FindMedianTest2() {
		//Arrange 
		double num1 = 188.0;
		double num2 = 8888888.0;
		double num3 = 557753396.0;
		double expectedMedian = 8888888.0;
		double actualMedian; 
		Median m = new Median(num1, num2, num3);
		
		//Act
		actualMedian = m.CalculateMedian(num1, num2, num3);
		
		//Assert
		assertTrue("Median calculated incorrectly", expectedMedian == actualMedian);
	}

}
