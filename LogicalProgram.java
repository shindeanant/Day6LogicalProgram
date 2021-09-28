package com.logicalProgram;

import java.util.Scanner;

public class LogicalProgram {

	public long startWatch = 0;
	public long stopWatch = 0;
	public long totalTime = 0;

	public long startTime() {

		System.out.println("Stop watch  started... Press 2 to stop watch");

		long startWatch = System.currentTimeMillis();

		return startWatch;
	}

	public long endTime() {

		System.out.println(" Watch Stopped..");

		long stopWatch = System.currentTimeMillis();

		return stopWatch;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to the Logical Programs");

		StopWatch sw = new StopWatch();

		boolean valid = false;

		while (valid == false) {

			System.out.print("Enter 1 to start Time : ");

			Scanner sc = new Scanner(System.in);

			valid = true;

			if (sc.hasNextInt()) {

				int number = sc.nextInt();

				if (number == 1) {

					long startTime = sw.startTime();

					// System.out.print("Enter 2 to End Time : "+s_time);
					int stop = sc.nextInt();

					if (stop == 2) {

						long endTime = sw.endTime();

						long time = (endTime - startTime) / 1000;

						System.out.println("total seconds Watch is on: " + time);

					} else {

						System.out.print("Enter 2 to stop the Watch: ");
					}
				}

			} else {

				System.out.println("Enter Digits Only");
			}
		}

	}

}
