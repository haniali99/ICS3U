package com.bayviewglen.dayfive;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		
		int num1, num2, sum;
		
		// We declared a Scanner called keyboard. 
		// We had to import Scanner class to use it.
		// A file is another type of input.
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter two integers: ");
		num1 = keyboard.nextInt();
		num2 = keyboard.nextInt();
		
		sum = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
		
	}

}
