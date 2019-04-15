package FindingLargestNumbers;

public class LargestThreeNumbers {

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
		System.out.println("Three largest elements are " + first + " " + second + " " + third);
	}
}
