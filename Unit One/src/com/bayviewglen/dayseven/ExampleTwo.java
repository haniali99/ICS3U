package com.bayviewglen.dayseven;

import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the number of days: ");
		final long HOURS_PER_DAY = 24;		// the reserved word final ensures that the value is not changed after it is initially set
		final long MINUTES_PER_HOUR = 60;
		final long SECONDS_PER_MINUTE = 60;
		
		
		int numdays = keyboard.nextInt();
		//int total seconds = numDays * 24 * 60 * 60;			// magic numbers are bad
		
		long totalSeconds = numdays * HOURS_PER_DAY * MINUTES_PER_HOUR * SECONDS_PER_MINUTE;
		
		System.out.println("There are " + totalSeconds + "in " + numdays + "days.");
		
		keyboard.close();


	}

}
