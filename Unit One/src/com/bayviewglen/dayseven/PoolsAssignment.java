package com.bayviewglen.dayseven;

import java.util.Scanner;

public class PoolsAssignment {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Greetings!");
		System.out.print(
				" This program has been created to determine the quantity of water (in meters squared) required \n to fill a rectangular pool by 90% with both shallow and deep ends.");
		System.out.println(
				" It is also designed to \n calculate the quantity of liner required for the pool as well as the price of the liner. \n");
		System.out.println("Please enter the length and width of the pool: ");

		double length = keyboard.nextDouble();
		double width = keyboard.nextDouble();

		System.out.println("\nPlease enter the depth of the shallow end and deep end: ");

		double depthShallow = keyboard.nextDouble();
		double depthDeep = keyboard.nextDouble();

		System.out.println("\nPlease enter the length of the transition between the shallow and deep end: ");

		double transitionLength = keyboard.nextDouble();

		System.out.println("\nPlease enter the length of the deep end: ");

		double lengthDeep = keyboard.nextDouble();

		double volumeOne = depthDeep * width * lengthDeep;

		double transitionHeight = depthDeep - depthShallow;
		double transitionBase = Math.sqrt(transitionLength * transitionLength - transitionHeight * transitionHeight);
		double volumeTwo = ((transitionBase * transitionHeight) / 2.0) * width;
		double volumeThree = depthShallow * width * transitionBase;
		double volumeFour = volumeThree + volumeTwo;

		double lengthShallow = length - lengthDeep - transitionBase;
		double volumeFive = depthShallow * width * lengthShallow;

		double totalVolume = volumeOne + volumeFour + volumeFive;
		double percent = 0.90;
		double poolVolume = totalVolume * percent;

		System.out.println("\n" + poolVolume + " cubic meters of water is required to keep the pool 90% full.");

		double perimeterOne = width * depthDeep;
		double perimeterTwo = lengthDeep * width;
		double perimeterThreeFour = 2 * (depthDeep * lengthDeep);
		double perimeterFive = transitionLength * width;
		double perimeterSixSeven = transitionBase * transitionHeight;
		double perimeterEightNine = (2 * (depthShallow * transitionBase)) + perimeterSixSeven;
		double perimeterTen = lengthShallow * width;
		double perimeterElevenTwelve = 2 * (lengthShallow * depthShallow);
		double perimeterThirteen = depthShallow * width;

		double totalPerimeter = perimeterOne + perimeterTwo + perimeterThreeFour + perimeterFive + perimeterSixSeven
				+ perimeterEightNine + perimeterTen + perimeterElevenTwelve + perimeterThirteen;

		System.out.println("\nThe amount of liner required for the pool is " + totalPerimeter + " meters squared.");

		System.out.println(
				"\nPlease enter the price (per meter) of three different liners which can be used for the pool: ");

		double linerOne = keyboard.nextDouble();
		double linerTwo = keyboard.nextDouble();
		double linerThree = keyboard.nextDouble();

		double costOne = linerOne * totalPerimeter;
		double costTwo = linerTwo * totalPerimeter;
		double costThree = linerThree * totalPerimeter;

		System.out.println("\nThe total price required for the first liner is " + costOne + ", the price for the second is " + costTwo + ", and the price for the third is " + costThree + ".");

		keyboard.close();

	}

}
