package com.bayviewglen.dayfour;

public class ExampleTwo {

	public static void main(String[] args) {
		int x = 5, y = 8, z = 12;
		
		double avg = (x+y+z)/3;		// problem is -> integer division
		
		System.out.println(avg);
		
		avg = (x+y+z)/3.0;		// problem is -> integer division
		
		System.out.println(avg);
		
		int numValues = 3;
		
		avg = (x+y+z)/numValues;	// problem is -> integer division
		
		System.out.println(avg);
		
		avg = (x+y+z)/(double)numValues;		// numValues has been casted as a double
		
		// double -> int is a narrowing conversion
		// int -> double int is a widening conversion
		
		avg = (double) ((x+y+z)/numValues);
				
 	}

}
