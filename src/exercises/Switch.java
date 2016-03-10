package exercises;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a, b, c;
		System.out.println("enter the first number");
		a = obj.nextInt();
		System.out.println("enter the second number");
		b = obj.nextInt();
		System.out.println("Enter the command: ");
		Scanner newScanner = new Scanner(System.in);
		String command = newScanner.nextLine();
		
		switch (command) {
		case "add":
			c = a+ b;
			System.out.println("addition is: " + c);
			break;
		case "multiply":
			c = a*b;
			System.out.println("multiplication is: " + c);
			break;
		default:
			System.out.println("Command incorrect");
			break;
		}

	}

}
