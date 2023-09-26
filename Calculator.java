package methods;

import java.util.Scanner;

public class Calculator {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int select;
		do {
			System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n0. Exit");
			select = scan.nextInt();
			switch (select) {
			case 1:
				addition();
				break;
			case 2:
				subtraction();
				break;
			case 3:
				multiplication();
				break;
			case 4:
				division();
				break;
			case 0:
				System.out.println("The system has been logged out. Have a nice day!");
				return;
			default:
				System.out.println("Invalid option. Please try again.");
				break;
			}
			System.out.println("-----------------------");
		} while (select != 0);
	}

	private static void division() {
		System.out.println("-----------------------");
		System.out.println("Division");
		double number, result = 0;
		for (int i = 1; i <= 2; i++) {
			System.out.print("Number " + i + ": ");
			number = scan.nextDouble();
			if (i == 1) {
				result = number;
			} else {
				result /= number;
			}
		}
		System.out.println("Result: " + result);
		
	}

	private static void multiplication() {
		System.out.println("-----------------------");
		System.out.println("Multiplication");
		int number, result = 1;
		for (int i = 1; i <= 2; i++) {
			System.out.print("Number " + i + ": ");
			number = scan.nextInt();
			result *= number;
		}
		System.out.println("Result: " + result);
	}

	private static void subtraction() {
		System.out.println("-----------------------");
		System.out.println("Subtraction");
		int number, result = 0;
		for (int i = 1; i <= 2; i++) {
			System.out.print("Number " + i + ": ");
			number = scan.nextInt();
			if (i == 1) {
				result = number;
			} else {
				result -= number;
			}
		}
		System.out.println("Result: " + result);
	}

	private static void addition() {
		System.out.println("-----------------------");
		System.out.println("Addition");
		int number, result = 0;
		for (int i = 1; i <= 2; i++) {
			System.out.print("Number " + i + ": ");
			number = scan.nextInt();
			result += number;
		}
		System.out.println("Result: " + result);
		
	}
}
