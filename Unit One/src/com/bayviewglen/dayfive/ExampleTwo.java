package com.bayviewglen.dayfive;

import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the radius of a circle/sphere: ");
		
		double r = 5;
		r = scanner.nextDouble();
		
		System.out.println("The area is " + Math.PI * r * r);
		System.out.println("The circumference is " + 2 * Math.PI * r);

		
		

	}

}
