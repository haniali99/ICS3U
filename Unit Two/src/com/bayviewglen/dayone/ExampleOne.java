package com.bayviewglen.dayone;

public class ExampleOne {

	public static void main(String[] args) {
		
		int x = 2;
		int y = -2;
		double z = -2.0; // returns NaN
	
		
		
		System.out.println(x);
		System.out.println(Math.sqrt(x));
		
		System.out.println(y);
		System.out.println(Math.abs(y));
		
		System.out.println(z); // comment
		System.out.println(Math.abs(z));
		
		System.out.println(Math.sqrt(-2)); //Type casts as double so still NaN.  If it was an int it would return an error.
		System.out.println(Math.sqrt(y));
		// System.out.println(Math.sqrt("Shon"));	// There is not a sqrt method/function that accepts Strings as arguments/parameters
		
		System.out.println(Math.sqrt(Math.abs(z)));
		
		System.out.println(Math.pow(z,2));
		System.out.println(Math.pow(z,-2));
		System.out.println(Math.pow(z, 1.2));	// because 1.2 is a radical
		System.out.println(Math.pow(Math.abs(z), 1.2));	// because 1.2 is a radical
		
		System.out.println(Math.PI);
		System.out.println(Math.ceil(Math.PI));
		System.out.println(Math.floor(Math.PI));
		System.out.println(Math.round(Math.PI));

	}

}
