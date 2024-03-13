package daily_100_code;

import java.util.Scanner;

public class CheckGreatestOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckGreatestOfTwo.checkGreatestNumber();
	}

	public static void checkGreatestNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number ");
		int a = sc.nextInt();
		System.out.println("Enter second number ");
		int b = sc.nextInt();

		if (a < b) {
			System.out.println("B is greatest number");
		} else {
			System.out.println("A is greatest number");
		}
	}
}
