public class PseducodeProgramm {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.println("PING");
			} else if (i % 5 == 0) {
				System.out.println("PONG");
			} else if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("PING PONG");
			}
		}
	}
}
