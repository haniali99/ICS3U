package com.bayviewglen.dayfive;

public class ExampleTwo {

	public static void main(String[] args) {
		double number = 3.45677;
		int number2 = 3;
		
		// f is for decimal #
		// d is for integer
		// %width.decimalplacesTYPE
		// %10.2f means width of 10 and 2 decimal places(eg. 0.01 instead of 0.0143) for a decimal number
		
		System.out.printf("This is a string %10.2f %4d", number, number2);

	}

}
