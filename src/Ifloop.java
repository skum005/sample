public class Ifloop {
	public static void main(String[] args) {
		int a = 11;
		int b = 11;
		int c = 4;

		if (a > b && a > c) {
			System.out.println("highest no " + a);
		} else if (b > a && b > c) {
			System.out.println("highest number " + b);
		} else if (c > a && c > b) {
			System.out.println("highest " + c);
		} else {
			System.out.println("Two or three number are equal");
		}

	}
}
