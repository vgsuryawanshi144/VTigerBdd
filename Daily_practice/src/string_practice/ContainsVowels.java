package string_practice;

import java.util.Scanner;

public class ContainsVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainsVowels.checkVowels();
	}

	public static void checkVowels() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character to check is vowels or not: ");
		char ch = sc.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'U' || ch == 'O') {
			System.out.println("Given character " + ch + " is vowels ");
		} else {
			System.out.println("Given character " + ch + " is not vowels ");
		}
	}
}
