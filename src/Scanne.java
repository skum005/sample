import java.util.Scanner;

public class Scanne {

	public Scanne() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a,b;
		Scanner myscan = new Scanner(System.in);
		System.out.println("enter a num:");
		 a = myscan.nextInt();
		b = myscan.nextInt();
		if(a>b){
			System.out.println(a+"is highest");
		}
		else{
			System.out.println(b+"is highest");
		}
		
		// TODO Auto-generated method stub

	}

}
