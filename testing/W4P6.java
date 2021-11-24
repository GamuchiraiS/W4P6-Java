/**
 * 
 */
package testing;
import java.util.Scanner;

/**
 * @author gamuc
 *
 */
public class W4P6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate Scanner class 
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter number 1: ");
		double num1 = scan.nextDouble();
		System.out.print("Please enter number 2: ");
		double num2 = scan.nextDouble();
		System.out.print("Please enter number 3: ");
		double num3 = scan.nextDouble();
		Median med = new Median(num1, num2, num3); //instantiate
		med.CalculateMedian(num1, num2, num3);
		System.out.println("Median = " + med.median);
		scan.close();
		
	}

}
