package com.bayviewglen.daythree;

import java.util.Scanner;

public class HomeworkFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a sentence");
		
		String sentence = input.nextLine();
		
		int randomChar = (int)(Math.random()*sentence.length());
		
		System.out.println("A random character in this sentence is " + sentence.charAt(randomChar));

	}

}
