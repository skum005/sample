package gow;

public class Even {
	public static void main(String[] args) {
		int myInt = 1;
		while (myInt <= 100) {
			if (myInt % 2 == 0)
				System.out.println("even numbers" + " " + myInt);

			myInt++;
		}
	}
}
