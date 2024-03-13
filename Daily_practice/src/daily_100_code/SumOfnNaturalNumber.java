package daily_100_code;

import java.util.Scanner;

public class SumOfnNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfnNaturalNumber sn = new SumOfnNaturalNumber();
		sn.SumOfNatural();
	}

	public void SumOfNatural() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find sum of number");
		int num = sc.nextInt();

		for (int i = 0; i <= num; i++) {

			sum = sum + i;

		}
		System.out.println("The sum of number is: " + sum);
	}

}
