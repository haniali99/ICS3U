package com.bayviewglen.dayfive;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CrossCountryAssignment {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // scanner used to allow user to enter data into the console
		
		final int SECS_IN_MIN = 60; // final int because there will always be 60 seconds in a minute
		
		System.out.println("Please enter your first and last name: "); 
	// prompts user to enter their first and last name (assuming there is one space in between)
		
			String runnerOneName = input.nextLine(); // variable as string because the name is not a value
				
			String runnerOneFirstName = runnerOneName.split(" ")[0]; // splits the name into two parts on either side of the space
				
			String runnerOneLastName = runnerOneName.split(" ")[1]; // [0] takes the name before the split and [1] takes the name after the split
		
		System.out.println("\n" + runnerOneFirstName + ", please enter your Mile One time (mm:ss.sss): "); 
	// minutes and seconds separated by : where user doesn't have to enter 3 decimal places
		
			String runnerOneMileOne = input.nextLine(); // 
		
				int runnerOneMileOneMinutes = Integer.parseInt(runnerOneMileOne.split(":")[0]); 
			// convert string to int and split time into minutes and seconds at the ":"
				
				int runnerOneMileOneMinutesToSeconds = runnerOneMileOneMinutes * SECS_IN_MIN; 
			// multiply minutes by the number of seconds per minute (60) to convert minutes to seconds
				
				double runnerOneMileOneSeconds = Double.parseDouble(runnerOneMileOne.split(":")[1]);
			// convert to double here because the seconds have milliseconds - Eg. 42.874 (seconds)
				
				double runnerOneMileOneTotalSeconds = runnerOneMileOneMinutesToSeconds + runnerOneMileOneSeconds;
			// add minutes (converted to seconds) and seconds (with milliseconds) to get total seconds for mile 1
			
		System.out.println("\n" + runnerOneFirstName + ", please enter your time to the end of the second mile (mm:ss.sss): ");
		
			String runnerOneEndOfSecondMile = input.nextLine();
		
				int runnerOneEndOfSecondMileMinutes = Integer.parseInt(runnerOneEndOfSecondMile.split(":")[0]);
				int runnerOneEndOfSecondMileMinutesToSeconds = runnerOneEndOfSecondMileMinutes * SECS_IN_MIN;
				double runnerOneEndOfSecondMileSeconds = Double.parseDouble(runnerOneEndOfSecondMile.split(":")[1]);
		
				double runnerOneEndOfSecondMileTotalSeconds = runnerOneEndOfSecondMileMinutesToSeconds + runnerOneEndOfSecondMileSeconds;
			
				double runnerOneMileTwoTotalSeconds = runnerOneEndOfSecondMileTotalSeconds - runnerOneMileOneTotalSeconds;
			// subtract time of first mile in seconds from time to end of second mile in seconds to get total seconds for mile 2
		
		System.out.println("\n" + runnerOneFirstName + ", please enter your time to the end of the 5km (mm:ss.sss): ");
			
			String runnerOne5Km = input.nextLine();
		
				int runnerOne5KmMinutes = Integer.parseInt(runnerOne5Km.split(":")[0]);
				int runnerOne5KmMinutesToSeconds = runnerOne5KmMinutes * SECS_IN_MIN;
				double runnerOne5KmSeconds = Double.parseDouble(runnerOne5Km.split(":")[1]);
		
				double runnerOne5KmTotalSeconds = runnerOne5KmMinutesToSeconds + runnerOne5KmSeconds;
			// runner one's total seconds for 5km run
				
				double runnerOneSplitOneSecondstoMinutes = (runnerOneMileOneTotalSeconds/SECS_IN_MIN);
			// convert the total number of seconds to minutes (decimal is remaining seconds) by diving by number of seconds per minute (60)	
				
				int takeDecimal = 1; // value required to take decimal (the seconds in this case)
				
				double runnerOneSplitOneDecimal = runnerOneSplitOneSecondstoMinutes % takeDecimal;
			// the seconds are separated from the minutes by using % takeDecimal (1)
				
				double runnerOneSplitOneSeconds = runnerOneSplitOneDecimal * SECS_IN_MIN;
				int runnerOneSplitOneMinutes = (int) (runnerOneSplitOneSecondstoMinutes - runnerOneSplitOneDecimal);
			// get minutes (as integer) by subtracting the decimal part of the minutes from the total minutes value
			// runner one's minutes and seconds values for split one
				
				double runnerOneSplitTwoSecondsToMinutes = (runnerOneMileTwoTotalSeconds/SECS_IN_MIN);
				
				double runnerOneSplitTwoDecimal = runnerOneSplitTwoSecondsToMinutes % takeDecimal;
				
				double runnerOneSplitTwoSeconds = runnerOneSplitTwoDecimal * SECS_IN_MIN;
				int runnerOneSplitTwoMinutes = (int) (runnerOneSplitTwoSecondsToMinutes - runnerOneSplitTwoDecimal);
			// runner one's minutes and seconds values for split two 
				
				double runnerOneSplitThreeTotalSeconds = runnerOne5KmTotalSeconds - runnerOneEndOfSecondMileTotalSeconds;
			// total seconds for split three
				
				double runnerOneSplitThreeSecondsToMinutes = (double)(runnerOneSplitThreeTotalSeconds/SECS_IN_MIN);
				
				double runnerOneSplitThreeDecimal = runnerOneSplitThreeSecondsToMinutes % takeDecimal;
				
				double runnerOneSplitThreeSeconds = runnerOneSplitThreeDecimal * SECS_IN_MIN;
				int runnerOneSplitThreeMinutes = (int) (runnerOneSplitThreeSecondsToMinutes - runnerOneSplitThreeDecimal);
			// runner one's minutes and seconds values for split three
				
		DecimalFormat formatter = new DecimalFormat("00.000");
	// use DecimalFormat to round the milliseconds to 3 decimal places
		
			String runnerOneSplitOneSecondsRounded = (formatter.format(runnerOneSplitOneSeconds));
			String runnerOneSplitTwoSecondsRounded = (formatter.format(runnerOneSplitTwoSeconds));
			String runnerOneSplitThreeSecondsRounded = (formatter.format(runnerOneSplitThreeSeconds));
			String runnerOne5KmSecondsRounded = (formatter.format(runnerOne5KmSeconds));
		// store formatted seconds for each split as strings
			
			String runnerOneSplitOne = runnerOneSplitOneMinutes + ":" + runnerOneSplitOneSecondsRounded;
			String runnerOneSplitTwo = runnerOneSplitTwoMinutes + ":" + runnerOneSplitTwoSecondsRounded;
			String runnerOneSplitThree = runnerOneSplitThreeMinutes + ":" + runnerOneSplitThreeSecondsRounded;
			String runnerOneTotal = runnerOne5KmMinutes + ":" + runnerOne5KmSecondsRounded;
		// convert int/double values back to strings to add ":" between minutes and seconds
		
		System.out.println("\nRunner One Summary \n------------------ \nRunner: " + runnerOneLastName + ", " + runnerOneFirstName);
		System.out.println("Split One: " + runnerOneSplitOne + "\nSplit Two: " + runnerOneSplitTwo + "\nSplit Three: " + runnerOneSplitThree);
		System.out.println("Total: " + runnerOneTotal);
		
		// above has to be repeated similarly, 4 more times for all other runners
		
		
		System.out.println("\nPlease enter your first and last name: ");
			
			String runnerTwoName = input.nextLine();
					
			String runnerTwoFirstName = runnerTwoName.split(" ")[0];
					
			String runnerTwoLastName = runnerTwoName.split(" ")[1];
		
		System.out.println("\n" + runnerTwoFirstName + ", please enter your Mile One time (mm:ss.sss): ");
		
			String runnerTwoMileOne = input.nextLine();
		
			int runnerTwoMileOneMinutes = Integer.parseInt(runnerTwoMileOne.split(":")[0]);
			int runnerTwoMileOneMinutesToSeconds = runnerTwoMileOneMinutes * SECS_IN_MIN;
			double runnerTwoMileOneSeconds = Double.parseDouble(runnerTwoMileOne.split(":")[1]);
		
			double runnerTwoMileOneTotalSeconds = runnerTwoMileOneMinutesToSeconds + runnerTwoMileOneSeconds;
		
		System.out.println("\n" + runnerTwoFirstName + ", please enter your time to the end of the second mile (mm:ss.sss): ");
		
			String runnerTwoEndOfSecondMile = input.nextLine();
		
				int runnerTwoEndOfSecondMileMinutes = Integer.parseInt(runnerTwoEndOfSecondMile.split(":")[0]);
				int runnerTwoEndOfSecondMileMinutesToSeconds = runnerTwoEndOfSecondMileMinutes * SECS_IN_MIN;
				double runnerTwoEndOfSecondMileSeconds = Double.parseDouble(runnerTwoEndOfSecondMile.split(":")[1]);
				
				double runnerTwoEndOfSecondMileTotalSeconds = runnerTwoEndOfSecondMileMinutesToSeconds + runnerTwoEndOfSecondMileSeconds;
				
				double runnerTwoMileTwoTotalSeconds = runnerTwoEndOfSecondMileTotalSeconds - runnerTwoMileOneTotalSeconds;
		
		System.out.println("\n" + runnerTwoFirstName + ", please enter your time to the end of the 5km (mm:ss.sss): ");
		
			String runnerTwo5Km = input.nextLine();
		
				int runnerTwo5KmMinutes = Integer.parseInt(runnerTwo5Km.split(":")[0]);
				int runnerTwo5KmMinutesToSeconds = runnerTwo5KmMinutes * SECS_IN_MIN;
				double runnerTwo5KmSeconds = Double.parseDouble(runnerTwo5Km.split(":")[1]);
				
				double runnerTwo5KmTotalSeconds = runnerTwo5KmMinutesToSeconds + runnerTwo5KmSeconds;
				double runnerTwoSplitOneSecondstoMinutes = (runnerTwoMileOneTotalSeconds/SECS_IN_MIN);
									
				double runnerTwoSplitOneDecimal = runnerTwoSplitOneSecondstoMinutes % takeDecimal;
					
				double runnerTwoSplitOneSeconds = runnerTwoSplitOneDecimal * SECS_IN_MIN;
				int runnerTwoSplitOneMinutes = (int) (runnerTwoSplitOneSecondstoMinutes - runnerTwoSplitOneDecimal);
			// runner two's minutes and seconds values for split one
					
				double runnerTwoSplitTwoSecondsToMinutes = (runnerTwoMileTwoTotalSeconds/SECS_IN_MIN);
					
				double runnerTwoSplitTwoDecimal = runnerTwoSplitTwoSecondsToMinutes % takeDecimal;
					
				double runnerTwoSplitTwoSeconds = runnerTwoSplitTwoDecimal * SECS_IN_MIN;
				int runnerTwoSplitTwoMinutes = (int) (runnerTwoSplitTwoSecondsToMinutes - runnerTwoSplitTwoDecimal);
			// runner two's minutes and seconds values for split two 
					
				double runnerTwoSplitThreeTotalSeconds = runnerTwo5KmTotalSeconds - runnerTwoEndOfSecondMileTotalSeconds;
					
				double runnerTwoSplitThreeSecondsToMinutes = (double)(runnerTwoSplitThreeTotalSeconds/SECS_IN_MIN);
					
				double runnerTwoSplitThreeDecimal = runnerTwoSplitThreeSecondsToMinutes % takeDecimal;
					
				double runnerTwoSplitThreeSeconds = runnerTwoSplitThreeDecimal * SECS_IN_MIN;
				int runnerTwoSplitThreeMinutes = (int) (runnerTwoSplitThreeSecondsToMinutes - runnerTwoSplitThreeDecimal);
			// runner two's minutes and seconds values for split three
				
			String runnerTwoSplitOneSecondsRounded = (formatter.format(runnerTwoSplitOneSeconds));
			String runnerTwoSplitTwoSecondsRounded = (formatter.format(runnerTwoSplitTwoSeconds));
			String runnerTwoSplitThreeSecondsRounded = (formatter.format(runnerTwoSplitThreeSeconds));
			String runnerTwo5KmSecondsRounded = (formatter.format(runnerTwo5KmSeconds));		
			
			String runnerTwoSplitOne = runnerTwoSplitOneMinutes + ":" + runnerTwoSplitOneSecondsRounded;
			String runnerTwoSplitTwo = runnerTwoSplitTwoMinutes + ":" + runnerTwoSplitTwoSecondsRounded;
			String runnerTwoSplitThree = runnerTwoSplitThreeMinutes + ":" + runnerTwoSplitThreeSecondsRounded;
			String runnerTwoTotal = runnerTwo5KmMinutes + ":" + runnerTwo5KmSecondsRounded;
		
		System.out.println("\nRunner Two Summary \n------------------ \nRunner: " + runnerTwoLastName + ", " + runnerTwoFirstName);
		System.out.println("Split One: " + runnerTwoSplitOne + "\nSplit Two: " + runnerTwoSplitTwo + "\nSplit Three: " + runnerTwoSplitThree);
		System.out.println("Total: " + runnerTwoTotal);
		
		
		System.out.println("\nPlease enter your first and last name: ");
		
			String runnerThreeName = input.nextLine();
				
			String runnerThreeFirstName = runnerThreeName.split(" ")[0];
				
			String runnerThreeLastName = runnerThreeName.split(" ")[1];
		
		System.out.println("\n" + runnerThreeFirstName + ", please enter your Mile One time (mm:ss.sss): ");
		
			String runnerThreeMileOne = input.nextLine();
		
				int runnerThreeMileOneMinutes = Integer.parseInt(runnerThreeMileOne.split(":")[0]);
				int runnerThreeMileOneMinutesToSeconds = runnerThreeMileOneMinutes * SECS_IN_MIN;
				double runnerThreeMileOneSeconds = Double.parseDouble(runnerTwoMileOne.split(":")[1]);
			
				double runnerThreeMileOneTotalSeconds = runnerThreeMileOneMinutesToSeconds + runnerThreeMileOneSeconds;
		
		System.out.println("\n" + runnerThreeFirstName + ", please enter your time to the end of the second mile (mm:ss.sss): ");
		
			String runnerThreeEndOfSecondMile = input.nextLine();
	
				int runnerThreeEndOfSecondMileMinutes = Integer.parseInt(runnerThreeEndOfSecondMile.split(":")[0]);
				int runnerThreeEndOfSecondMileMinutesToSeconds = runnerThreeEndOfSecondMileMinutes * SECS_IN_MIN;
				double runnerThreeEndOfSecondMileSeconds = Double.parseDouble(runnerThreeEndOfSecondMile.split(":")[1]);
				
				double runnerThreeEndOfSecondMileTotalSeconds = runnerThreeEndOfSecondMileMinutesToSeconds + runnerThreeEndOfSecondMileSeconds;
				
				double runnerThreeMileTwoTotalSeconds = runnerThreeEndOfSecondMileTotalSeconds - runnerThreeMileOneTotalSeconds;
	
		System.out.println("\n" + runnerThreeFirstName + ", please enter your time to the end of the 5km (mm:ss.sss): ");
		
			String runnerThree5Km = input.nextLine();
		
				int runnerThree5KmMinutes = Integer.parseInt(runnerThree5Km.split(":")[0]);
				int runnerThree5KmMinutesToSeconds = runnerThree5KmMinutes * SECS_IN_MIN;
				double runnerThree5KmSeconds = Double.parseDouble(runnerThree5Km.split(":")[1]);
				
				double runnerThree5KmTotalSeconds = runnerThree5KmMinutesToSeconds + runnerThree5KmSeconds;
				double runnerThreeSplitOneSecondstoMinutes = (runnerThreeMileOneTotalSeconds/SECS_IN_MIN);
									
				double runnerThreeSplitOneDecimal = runnerThreeSplitOneSecondstoMinutes % takeDecimal;
					
				double runnerThreeSplitOneSeconds = runnerThreeSplitOneDecimal * SECS_IN_MIN;
				int runnerThreeSplitOneMinutes = (int) (runnerThreeSplitOneSecondstoMinutes - runnerThreeSplitOneDecimal);
			// runner three's minutes and seconds values for split one
					
				double runnerThreeSplitTwoSecondsToMinutes = (runnerThreeMileTwoTotalSeconds/SECS_IN_MIN);
					
				double runnerThreeSplitTwoDecimal = runnerThreeSplitTwoSecondsToMinutes % takeDecimal;
					
				double runnerThreeSplitTwoSeconds = runnerThreeSplitTwoDecimal * SECS_IN_MIN;
				int runnerThreeSplitTwoMinutes = (int) (runnerThreeSplitTwoSecondsToMinutes - runnerThreeSplitTwoDecimal);
			// runner three's minutes and seconds values for split two 
					
				double runnerThreeSplitThreeTotalSeconds = runnerThree5KmTotalSeconds - runnerThreeEndOfSecondMileTotalSeconds;
					
				double runnerThreeSplitThreeSecondsToMinutes = (double)(runnerThreeSplitThreeTotalSeconds/SECS_IN_MIN);
					
				double runnerThreeSplitThreeDecimal = runnerThreeSplitThreeSecondsToMinutes % takeDecimal;
					
				double runnerThreeSplitThreeSeconds = runnerThreeSplitThreeDecimal * SECS_IN_MIN;
				int runnerThreeSplitThreeMinutes = (int) (runnerThreeSplitThreeSecondsToMinutes - runnerThreeSplitThreeDecimal);
			// runner three's minutes and seconds values for split three
		
			String runnerThreeSplitOneSecondsRounded = (formatter.format(runnerThreeSplitOneSeconds));
			String runnerThreeSplitTwoSecondsRounded = (formatter.format(runnerThreeSplitTwoSeconds));
			String runnerThreeSplitThreeSecondsRounded = (formatter.format(runnerThreeSplitThreeSeconds));
			String runnerThree5KmSecondsRounded = (formatter.format(runnerThree5KmTotalSeconds));		
			
			String runnerThreeSplitOne = runnerThreeSplitOneMinutes + ":" + runnerThreeSplitOneSecondsRounded;
			String runnerThreeSplitTwo = runnerThreeSplitTwoMinutes + ":" + runnerThreeSplitTwoSecondsRounded;
			String runnerThreeSplitThree = runnerThreeSplitThreeMinutes + ":" + runnerThreeSplitThreeSecondsRounded;
			String runnerThreeTotal = runnerThree5KmMinutes + ":" + runnerThree5KmSecondsRounded;
		
		System.out.println("\nRunner Three Summary \n------------------ \nRunner: " + runnerThreeLastName + ", " + runnerThreeFirstName);
		System.out.println("Split One: " + runnerThreeSplitOne + "\nSplit Two: " + runnerThreeSplitTwo + "\nSplit Three: " + runnerThreeSplitThree);
		System.out.println("Total: " + runnerThreeTotal);
		
		
		System.out.println("\nPlease enter your first and last name: ");
		
			String runnerFourName = input.nextLine();
					
			String runnerFourFirstName = runnerFourName.split(" ")[0];
					
			String runnerFourLastName = runnerFourName.split(" ")[1];
	
		System.out.println("\n" + runnerFourFirstName + ", please enter your Mile One time (mm:ss.sss): ");
		
			String runnerFourMileOne = input.nextLine();
		
				int runnerFourMileOneMinutes = Integer.parseInt(runnerFourMileOne.split(":")[0]);
				int runnerFourMileOneMinutesToSeconds = runnerFourMileOneMinutes * SECS_IN_MIN;
				double runnerFourMileOneSeconds = Double.parseDouble(runnerFourMileOne.split(":")[1]);
			
				double runnerFourMileOneTotalSeconds = runnerFourMileOneMinutesToSeconds + runnerFourMileOneSeconds;
		
		System.out.println("\n" + runnerFourFirstName + ", please enter your time to the end of the second mile (mm:ss.sss): ");
		
			String runnerFourEndOfSecondMile = input.nextLine();
		
				int runnerFourEndOfSecondMileMinutes = Integer.parseInt(runnerFourEndOfSecondMile.split(":")[0]);
				int runnerFourEndOfSecondMileMinutesToSeconds = runnerFourEndOfSecondMileMinutes * SECS_IN_MIN;
				double runnerFourEndOfSecondMileSeconds = Double.parseDouble(runnerFourEndOfSecondMile.split(":")[1]);
				
				double runnerFouEndOfSecondMileTotalSeconds = runnerFourEndOfSecondMileMinutesToSeconds + runnerFourEndOfSecondMileSeconds;
				
				double runnerFourMileTwoTotalSeconds = runnerFouEndOfSecondMileTotalSeconds - runnerFourMileOneTotalSeconds;
	
		System.out.println("\n" + runnerFourFirstName + ", please enter your time to the end of the 5km (mm:ss.sss): ");
		
			String runnerFour5Km = input.nextLine();
		
				int runnerFour5KmMinutes = Integer.parseInt(runnerFour5Km.split(":")[0]);
				int runnerFour5KmMinutesToSeconds = runnerFour5KmMinutes * SECS_IN_MIN;
				double runnerFour5KmSeconds = Double.parseDouble(runnerFour5Km.split(":")[1]);
				
				double runnerFour5KmTotalSeconds = runnerFour5KmMinutesToSeconds + runnerFour5KmSeconds;
				double runnerFourSplitOneSecondstoMinutes = (runnerFourMileOneTotalSeconds/SECS_IN_MIN);
									
				double runnerFourSplitOneDecimal = runnerFourSplitOneSecondstoMinutes % takeDecimal;
					
				double runnerFourSplitOneSeconds = runnerFourSplitOneDecimal * SECS_IN_MIN;
				int runnerFourSplitOneMinutes = (int) (runnerFourSplitOneSecondstoMinutes - runnerFourSplitOneDecimal);
			// runner four's minutes and seconds values for split one
					
				double runnerFourSplitTwoSecondsToMinutes = (runnerFourMileTwoTotalSeconds/SECS_IN_MIN);
					
				double runnerFourSplitTwoDecimal = runnerFourSplitTwoSecondsToMinutes % takeDecimal;
					
				double runnerFourSplitTwoSeconds = runnerFourSplitTwoDecimal * SECS_IN_MIN;
				int runnerFourSplitTwoMinutes = (int) (runnerFourSplitTwoSecondsToMinutes - runnerFourSplitTwoDecimal);
			// runner four's minutes and seconds values for split two 
					
				double runnerFourSplitThreeTotalSeconds = runnerFour5KmTotalSeconds - runnerFouEndOfSecondMileTotalSeconds;
					
				double runnerFourSplitThreeSecondsToMinutes = (double)(runnerFourSplitThreeTotalSeconds/SECS_IN_MIN);
					
				double runnerFourSplitThreeDecimal = runnerFourSplitThreeSecondsToMinutes % takeDecimal;
					
				double runnerFourSplitThreeSeconds = runnerFourSplitThreeDecimal * SECS_IN_MIN;
				int runnerFourSplitThreeMinutes = (int) (runnerFourSplitThreeSecondsToMinutes - runnerFourSplitThreeDecimal);
			// runner four's minutes and seconds values for split three				
		
			String runnerFourSplitOneSecondsRounded = (formatter.format(runnerFourSplitOneSeconds));
			String runnerFourSplitTwoSecondsRounded = (formatter.format(runnerFourSplitTwoSeconds));
			String runnerFourSplitThreeSecondsRounded = (formatter.format(runnerFourSplitThreeSeconds));
			String runnerFour5KmSecondsRounded = (formatter.format(runnerFour5KmSeconds));		
			
			String runnerFourSplitOne = runnerFourSplitOneMinutes + ":" + runnerFourSplitOneSecondsRounded;
			String runnerFourSplitTwo = runnerFourSplitTwoMinutes + ":" + runnerFourSplitTwoSecondsRounded;
			String runnerFourSplitThree = runnerFourSplitThreeMinutes + ":" + runnerFourSplitThreeSecondsRounded;
			String runnerFourTotal = runnerFour5KmMinutes + ":" + runnerFour5KmSecondsRounded;
		
		System.out.println("\nRunner Four Summary \n------------------ \nRunner: " + runnerFourLastName + ", " + runnerFourFirstName);
		System.out.println("Split One: " + runnerFourSplitOne + "\nSplit Two: " + runnerFourSplitTwo + "\nSplit Three: " + runnerFourSplitThree);
		System.out.println("Total: " + runnerFourTotal);
			
		
		System.out.println("\nPlease enter your first and last name: ");
		
			String runnerFiveName = input.nextLine();
					
			String runnerFiveFirstName = runnerFiveName.split(" ")[0];
					
			String runnerFiveLastName = runnerFiveName.split(" ")[1];
	
		System.out.println("\n" + runnerFiveFirstName + ", please enter your Mile One time (mm:ss.sss): ");
		
			String runnerFiveMileOne = input.nextLine();
		
				int runnerFiveMileOneMinutes = Integer.parseInt(runnerFiveMileOne.split(":")[0]);
				int runnerFiveMileOneMinutesToSeconds = runnerFiveMileOneMinutes * SECS_IN_MIN;
				double runnerFiveMileOneSeconds = Double.parseDouble(runnerFiveMileOne.split(":")[1]);
		
				double runnerFiveMileOneTotalSeconds = runnerFiveMileOneMinutesToSeconds + runnerFiveMileOneSeconds;
	
		System.out.println("\n" + runnerFiveFirstName + ", please enter your time to the end of the second mile (mm:ss.sss): ");
	
			String runnerFiveEndOfSecondMile = input.nextLine();
	
				int runnerFiveEndOfSecondMileMinutes = Integer.parseInt(runnerFiveEndOfSecondMile.split(":")[0]);
				int runnerFiveEndOfSecondMileMinutesToSeconds = runnerFiveEndOfSecondMileMinutes * SECS_IN_MIN;
				double runnerFiveEndOfSecondMileSeconds = Double.parseDouble(runnerFiveEndOfSecondMile.split(":")[1]);
				
				double runnerFiveEndOfSecondMileTotalSeconds = runnerFiveEndOfSecondMileMinutesToSeconds + runnerFiveEndOfSecondMileSeconds;
				
				double runnerFiveMileTwoTotalSeconds = runnerFiveEndOfSecondMileTotalSeconds - runnerFiveMileOneTotalSeconds;
	
		System.out.println("\n" + runnerFiveFirstName + ", please enter your time to the end of the 5km (mm:ss.sss): ");
		
			String runnerFive5Km = input.nextLine();
		
				int runnerFive5KmMinutes = Integer.parseInt(runnerFive5Km.split(":")[0]);
				int runnerFive5KmMinutesToSeconds = runnerFive5KmMinutes * SECS_IN_MIN;
				double runnerFive5KmSeconds = Double.parseDouble(runnerFive5Km.split(":")[1]);
				
				double runnerFive5KmTotalSeconds = runnerFive5KmMinutesToSeconds + runnerFive5KmSeconds;
				double runnerFiveSplitOneSecondstoMinutes = (runnerFiveMileOneTotalSeconds/SECS_IN_MIN);
									
				double runnerFiveSplitOneDecimal = runnerFiveSplitOneSecondstoMinutes % takeDecimal;
					
				double runnerFiveSplitOneSeconds = runnerFiveSplitOneDecimal * SECS_IN_MIN;
				int runnerFiveSplitOneMinutes = (int) (runnerFiveSplitOneSecondstoMinutes - runnerFiveSplitOneDecimal);
			// runner five's minutes and seconds values for split one
					
				double runnerFiveSplitTwoSecondsToMinutes = (runnerFiveMileTwoTotalSeconds/SECS_IN_MIN);
					
				double runnerFiveSplitTwoDecimal = runnerFiveSplitTwoSecondsToMinutes % takeDecimal;
					
				double runnerFiveSplitTwoSeconds = runnerFiveSplitTwoDecimal * SECS_IN_MIN;
				int runnerFiveSplitTwoMinutes = (int) (runnerFiveSplitTwoSecondsToMinutes - runnerFiveSplitTwoDecimal);
			// runner five's minutes and seconds values for split two 
					
				double runnerFiveSplitThreeTotalSeconds = runnerFive5KmTotalSeconds - runnerFiveEndOfSecondMileTotalSeconds;
					
				double runnerFiveSplitThreeSecondsToMinutes = (double)(runnerFiveSplitThreeTotalSeconds/SECS_IN_MIN);
					
				double runnerFiveSplitThreeDecimal = runnerFiveSplitThreeSecondsToMinutes % takeDecimal;
					
				double runnerFiveSplitThreeSeconds = runnerFiveSplitThreeDecimal * SECS_IN_MIN;
				int runnerFiveSplitThreeMinutes = (int) (runnerFiveSplitThreeSecondsToMinutes - runnerFiveSplitThreeDecimal);
			// runner five's minutes and seconds values for split three				
		
			String runnerFiveSplitOneSecondsRounded = (formatter.format(runnerFiveSplitOneSeconds));
			String runnerFiveSplitTwoSecondsRounded = (formatter.format(runnerFiveSplitTwoSeconds));
			String runnerFiveSplitThreeSecondsRounded = (formatter.format(runnerFiveSplitThreeSeconds));
			String runnerFive5KmSecondsRounded = (formatter.format(runnerFive5KmSeconds));		
			
			String runnerFiveSplitOne = runnerFiveSplitOneMinutes + ":" + runnerFiveSplitOneSecondsRounded;
			String runnerFiveSplitTwo = runnerFiveSplitTwoMinutes + ":" + runnerFiveSplitTwoSecondsRounded;
			String runnerFiveSplitThree = runnerFiveSplitThreeMinutes + ":" + runnerFiveSplitThreeSecondsRounded;
			String runnerFiveTotal = runnerFive5KmMinutes + ":" + runnerFive5KmSecondsRounded;
		
		System.out.println("\nRunner Five Summary \n------------------ \nRunner: " + runnerFiveLastName + ", " + runnerFiveFirstName);
		System.out.println("Split One: " + runnerFiveSplitOne + "\nSplit Two: " + runnerFiveSplitTwo + "\nSplit Three: " + runnerFiveSplitThree);
		System.out.println("Total: " + runnerFiveTotal);
		
		System.out.println("Bayviewglen Cross Country Results");
		
		System.out.printf("\n\n%18s%18s%18s%18s", "Runner", "Split One", "Split Two", "Split Three", "Total Time");
		
		System.out.printf("\n%18s%18s%18s%18s", "------", "---------", "---------", "-----------", "----------");
	// printf is used to add space between strings that are printed, %s is used for strings and the number in between is the number of spaces
		
		System.out.printf("\n\n%18s%18s%18s%18s",runnerOneName,runnerOneSplitOne,runnerOneSplitTwo,runnerOneSplitThree,runnerOneTotal);
		
		System.out.printf("\n\n%18s%18s%18s%18s",runnerTwoName,runnerTwoSplitOne,runnerTwoSplitTwo,runnerTwoSplitThree,runnerThreeTotal);
		
		System.out.printf("\n\n%18s%18s%18s%18s",runnerThreeName,runnerThreeSplitOne,runnerThreeSplitTwo,runnerThreeSplitThree,runnerThreeTotal);
		
		System.out.printf("\n\n%18s%18s%18s%18s",runnerFourName,runnerFourSplitOne,runnerFourSplitTwo,runnerFourSplitThree,runnerFourTotal);
		
		System.out.printf("\n\n%18s%18s%18s%18s",runnerFiveName,runnerFiveSplitOne,runnerFiveSplitTwo,runnerFiveSplitThree,runnerFiveTotal);
	// printf can also be used to add space between strings as variables
		
		input.close();
		
	}

}
