package com.bayviewglen.daytwo;

import java.util.Scanner;

public class HomeworkSix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word at least 2 characters long: ");
		
		String str = input.nextLine();
		
		System.out.println(str.substring(0,2));
		
		input.close();

	}

}
