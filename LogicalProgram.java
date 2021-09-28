package com.logicalProgram;

public class LogicalProgram {

	static boolean check(int number) {

		// Returning false when the number is either 0 or 1 because 0 and 1 cannot be
		// prime numbers

		if (number == 0 || number == 1) {

			return false;

		} else {

			// When the number is not 0 and 1

			for (int i = 2; i <= number / 2; i++) {

				if (number % i == 0) {

					return false;

				}
			}

			return true;

		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to the Logical Programs");

		for (int i = 0; i <= 50; i++) {

			if (check(i)) {

				System.out.println(i + " " + "is a Prime number");
			}
		}

	}

}
