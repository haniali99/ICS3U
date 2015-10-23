package com.bayviewglen.daythree;

public class ExampleTwo {

	public static void main(String[] args) {
		// variables are used to store data
		// you need to declare your variables
		int x, y;
		int z;

		x = 7; // x is assigned 7 NOT x equals 7
		y = 23; // = is called assignment operator

		z = x + y; // x + y and then assign to z

		int numberOne = 34; // camelCaseMeansThatWeUseLowerCaseExceptFor
							// theFirstLetterOfEveryWordAfterTheFirstWord

		// 7 = numberOne (wrong);   whatever is being assigned must be on the left side (left-hand side of an assignment must be a variable)
		
		double numberTwo = 3.45;
		
		double sum = numberOne + numberTwo;
		
		System.out.println(sum); // displays the value stored in the variable sum
		
		System.out.println(numberOne + " + " + numberTwo + " = " + sum); //using string concatenation
		

	}

}
