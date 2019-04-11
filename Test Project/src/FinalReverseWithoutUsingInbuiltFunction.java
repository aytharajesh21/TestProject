public class FinalReverseWithoutUsingInbuiltFunction {
	public static void main(String[] args) {
		String str = "Saket Saurav";
		char chars[] = str.toCharArray();  // converted to character array and printing in reverse order
		System.out.println(chars.length);
		for(int i= chars.length-1; i>=0; i--) {
			System.out.print(i);
			System.out.print(chars[i]);
		}
	}
}