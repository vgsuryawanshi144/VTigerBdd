package daily_100_code;

import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check number is positive or negative");
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println("Given" + a + "number is positive ");
		} else {
			System.out.println("Given" + a + "number is Negative ");
		}
	}

}
