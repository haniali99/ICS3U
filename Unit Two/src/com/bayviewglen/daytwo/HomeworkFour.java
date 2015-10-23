package com.bayviewglen.daytwo;

import java.util.Scanner;

public class HomeworkFour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out
				.println("Please enter an \"out\" string that is four (4) characters long: ");
		String str = input.nextLine();

		System.out.println("Now enter a word: ");
		String s = input.nextLine();

		System.out.println(str.substring(0, 2) + s + str.substring(2));
		
		input.close();

	}

}
