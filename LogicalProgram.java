package com.logicalProgram;

import java.util.Scanner;

public class LogicalProgram {

	public static void main(String[] args) {

		System.out.println("Welcome to the Logical Programs");

		int number;

		int first = 0;

		int next = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how may fibonnaci numbers to print");

		number = sc.nextInt();

		System.out.print("The first " + number + " Fibonacci numbers are: ");

		System.out.print(first + " " + next);

		for (int i = 1; i <= number - 2; ++i) {

			int sum = first + next;

			first = next;

			next = sum;

			System.out.print(" " + sum);

		}

	}

}
