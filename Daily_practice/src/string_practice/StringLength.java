package string_practice;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringLength length = new StringLength();
		length.chechStringLength();
	}

	public void chechStringLength() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to check length ");
		String st = sc.nextLine();
		System.out.println("The length of string is " + st.length());
	}

}
