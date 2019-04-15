/**
 * 
 */
package FindingLargestNumbers;

/**
 * @author Aytha150427
 *
 */
public class ThirdLargestNumber {

	public static void main(String[] args) {

		int arr[] = { 12, 13, 1, 10, 34, 1 };
		int first = 0, second = 0, third = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			} else if (arr[i] > second) {
				third = second;
				second = arr[i];
			} else if (arr[i] > third) {
				third = arr[i];
			}
		}
		System.out.println("Third largest Number is : " + third);
	}

}
