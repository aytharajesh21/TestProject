/**
 * 
 */
package FindingLargestNumbers;

/**
 * @author Aytha150427
 *
 */
public class LargestNumber {

	public static void main(String[] args) {

		int arr[] = { 12, 13, 1, 10, 34, 1 };
		int first = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				first = arr[i];
			}
		}
		System.out.println("First largest Number is : " + first);
	}

}
