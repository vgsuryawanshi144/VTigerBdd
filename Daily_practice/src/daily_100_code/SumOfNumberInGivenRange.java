package daily_100_code;

import java.util.Scanner;

public class SumOfNumberInGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNumberInGivenRange sn = new SumOfNumberInGivenRange();
		sn.checkSum();

	}

	public void checkSum() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number to check sum in given range");
		int a = sc.nextInt();
		System.out.println("Enter second number to check sum in given range");
		int b = sc.nextInt();

		for (int i = a; i <= b; i++) {
			sum = sum + i;
		}
		System.out.println("Sum is : " + sum);
	}

}
