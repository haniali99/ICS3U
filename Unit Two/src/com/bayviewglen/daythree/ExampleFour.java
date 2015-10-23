package com.bayviewglen.daythree;

import java.util.Scanner;

public class ExampleFour {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a sentence: ");
		String sentence = keyboard.nextLine();
		
		int randomIndex = (int)(Math.random()*sentence.length());
		
		System.out.println("A random character in the sentence " + sentence + " is: " + sentence.charAt(randomIndex));
		
		keyboard.close();

	}

}
