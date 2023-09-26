package methods;

import java.util.Scanner;

public class PalindromicNumber {

	public static void main(String[] args) {
		// A palindromic number is a number that is equal when read from the left and right.
		// Example: 5, 121, 4884 ...
		Scanner scan = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter a number: ");
			number = scan.nextInt();
			if (isPalindrom(number)) {
				System.out.println(number + " is a palindromic number.");
			} else {
				System.out.println(number + " is not a palindromic number.");
			}
		} while (number >= 0);
		scan.close();
	}

	private static boolean isPalindrom(int number) {
		int temp = number;
		int reverseNumber = 0;
		int remainder;
		while (temp > 0) {
			remainder = temp % 10;
			reverseNumber = (reverseNumber * 10) + remainder;
			temp /= 10;
		}
		if (number == reverseNumber)
			return true;
		else
			return false;
	}

}
