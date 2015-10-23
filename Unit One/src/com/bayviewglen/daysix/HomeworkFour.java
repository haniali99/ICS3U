package com.bayviewglen.daysix;

public class HomeworkFour {

	public static void main(String[] args) {
		double lightPerSecond = 3E8;
		int secondsPerMinute = 60;
		int minutesPerHour = 60;
		int hoursPerDay = 24;
		int daysPerYear = 365;
		
		double lightYear = lightPerSecond * secondsPerMinute * minutesPerHour * hoursPerDay * daysPerYear;

		System.out.println("The distance a light beam would travel in a year is " + lightYear + " meters.");
		
		// This prints as scientific notation because no (long)
		
		System.out.println("The distance a light beam would travel in a year is " + (long)lightYear + "meters.");
		
		// This required (long) to print out the whole number because it's too big for int
	}

}
