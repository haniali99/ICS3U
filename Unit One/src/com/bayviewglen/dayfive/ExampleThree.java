package com.bayviewglen.dayfive;

import java.util.Scanner;

public class ExampleThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Please enter a three (3) digit integer: ");
		
		int number = scanner.nextInt();
		int digitOne = number / 100;
		int digitTwo = number / 10 % 10;
		int digitThree = number % 10;
		int sum = digitOne + digitTwo + digitThree;
		
		System.out.println(digitOne + " + " + digitTwo + " + " + digitThree + " = " + sum);
		
		scanner.close(); // stops scanner from scanning anymore after this line (used for more complex code)

	}

}
