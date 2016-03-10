package exercises;

import java.util.Scanner;

public class Exer8 {

	public static void main(String[] args) {
		
		int userInputNumber;
		float result;
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter a number");
		userInputNumber = scannerObject.nextInt();	
		result = ((userInputNumber*100)/275);
		System.out.println("Percentage is : " + result);
	}
}
