package com.logicalProgram;

import java.util.Scanner;

public class LogicalProgram {

	static boolean checkPerfectSquare(double number) {

		for (int i = 1; i * i <= number; i++) {

			// if (i * i = number)
			// comparing conditions using logical AND

			if ((number % i == 0) && (number / i == i)) {

				// returns true if both conditions are true

				return true;
			}
		}
		// returns false if any one condition is false
		return false;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to the Logical Programs");

		Scanner sc = new Scanner(System.in);

		System.out.print(" Enter a number : ");

		double number = sc.nextDouble();

		if (checkPerfectSquare(number))

			System.out.println("Yes, the given number is perfect square.");

		else

			System.out.print("No, the given number is not perfect square.");

	}

}
