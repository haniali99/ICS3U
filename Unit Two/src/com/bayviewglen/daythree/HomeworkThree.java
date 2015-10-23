package com.bayviewglen.daythree;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter two numbers, the larger one first:");
		
		int firstNumber = keyboard.nextInt();
		int secondNumber = keyboard.nextInt();
		
		int randomNumber = (int)((Math.random()*(firstNumber-secondNumber)+1)+secondNumber);
		
		System.out.println(randomNumber);

	}

}
