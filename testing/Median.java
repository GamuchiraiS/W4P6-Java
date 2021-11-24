/**
 * 
 */
package testing;

/**
 * @author gamuc
 *
 */
public class Median {
	public double num1, num2, num3, median;
	
	public Median(double n1, double n2, double n3) {
		num1 = n1;
		num2 = n2;
		num3 = n3;
	}
	
	//method to calculate the median
	public double CalculateMedian(double num1, double num2, double num3) {
		/*Sorts the numbers in ascending order by using max and min
		 * And returns the median
		 */
		median = Math.max(Math.min(num1, num2), Math.min(Math.max(num1, num2), num3));
		return median;
	}
}
