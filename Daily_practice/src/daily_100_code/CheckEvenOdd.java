package daily_100_code;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckEvenOdd ch = new CheckEvenOdd();
		ch.checkEvenOddNumber();
	}

	public void checkEvenOddNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check Even or odd");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Given " + num + " number is Even ");
		} else {
			System.out.println("Given " + num + " number is odd ");
		}
	}

}
