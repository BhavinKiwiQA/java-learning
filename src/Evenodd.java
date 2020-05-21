import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int i = sc.nextInt();
		
		if (i % 2 == 0) {
			System.out.println(i + ", Number is even");
		} else {
			System.out.println(i + ", Number is Odd");
		}

	}

}
