public class Sum {
	public static void main(String[] args) {
		int a = 1, c = 0;
		while (a < 11) {
			c = a + c;
			a++;
		}

		System.out.println(c);
	}

}
