package com.bayviewglen.daythree;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		// Prompt for 2 numbers (a & b), assume a < b , Produce/Display a random # from a -> b inclusive
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter two numbers:");
		
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		
		int randomNum = (int)(Math.random()*(b-a) + 1);
		
		System.out.println("A random number between " + a + " and " + b + " is " + randomNum);
		
		keyboard.close();

	}

}
