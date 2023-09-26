package methods;

import java.util.Scanner;

public class FibonacciRecursive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a limit number for the Fibonacci series: ");
		int n = scan.nextInt();

		if (n < 0) {
			System.out.println("Please enter a non-negative limit number.");
		} else {
			for (int i = 0; i < n; i++) {
				System.out.print(fibonacci(i) + " ");
			}
		}

		scan.close();
	}

	private static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}