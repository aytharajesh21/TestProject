public class Divisibleby8 {

	public static void main(String[] args) {

		int count = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 8 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
