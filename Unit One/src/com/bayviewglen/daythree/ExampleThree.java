package com.bayviewglen.daythree;

public class ExampleThree {

	public static void main(String[] args) {
		int x = 5, y = 6;
		
		System.out.println(x + y + " are my values");		// starts with integer math
		System.out.println("" + x + y + " are my values");	// concatenate "" with x to start
		System.out.println(x + " " + y + " are my values");	// concatenate x with " " to start
		System.out.println(x + (y + " are my values"));		// BEDMAS applies
		System.out.println(x + y + " are my values " + y + x);
		
		// string + string = string, int + int = int, 

	}

}
