package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkTen {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter the length and width respectively on different lines: ");
		double length = keyboard.nextDouble();
		double width = keyboard.nextDouble();

		double area = length * width;
		double perimeter = length * 2 + width * 2;

		System.out.println("The area is " + area + ".");
		System.out.println("The perimeter is " + perimeter + ".");
		
		keyboard.close();

	}

}
