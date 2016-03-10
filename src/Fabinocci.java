public class Fabinocci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1, c;
		// c = a + b;
		c = 0;
		System.out.println(a);
		System.out.println(b);
		while (c < 10) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;			// System.out.println();
		}

	}
}
