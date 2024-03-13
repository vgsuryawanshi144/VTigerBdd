package daily_100_code;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPrime cp = new CheckPrime();
		cp.checkPrimeNumber();
	}

	public void checkPrimeNumber() {
		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check is prime or not");
		int number = sc.nextInt();

		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				count = count + i;
			}
		}
		if (count < 2) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}

	}
}
