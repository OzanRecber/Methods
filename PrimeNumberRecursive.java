package methods;

import java.util.Scanner;

public class PrimeNumberRecursive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scan.nextInt();

		if (number <= 0) {
			System.out.println("Please enter a positive integer.");
		} else {
			int result = checkPrime(number, number - 1);
			if (result == 0) {
				System.out.println(number + " is a prime number.");
			} else {
				System.out.println(number + " is not a prime number.");
			}
		}
		scan.close();
	}

	private static int checkPrime(int n1, int n2) {
		if (n2 == 1) {
			return 0;
		} else if (n1 % n2 == 0) {
			return 1;
		} else {
			return checkPrime(n1, n2 - 1);
		}
	}
}
