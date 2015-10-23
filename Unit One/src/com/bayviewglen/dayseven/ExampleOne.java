package com.bayviewglen.dayseven;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the number of days: ");
		int hoursPerDay = 24;
		int minutesPerHour = 60;
		int secondsPerMinute = 60;
		int numdays = keyboard.nextInt();
		//int total seconds = numDays * 24 * 60 * 60;			// magic numbers are bad
		
		int totalSeconds = numdays * hoursPerDay * minutesPerHour * secondsPerMinute;
		
		System.out.println("There are " + totalSeconds + "in " + numdays + "days.");
		
		keyboard.close();

	}

}
