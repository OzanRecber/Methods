package methods;

import java.util.Scanner;

public class FactorielRecursive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		if (n < 0) {
			System.out.println("Please enter a non-negative number.");
		} else {
			int result = factorial(n);
			System.out.println(n + "! " + "= " + result);
		}
		scan.close();
	}

	private static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}

	}

}
