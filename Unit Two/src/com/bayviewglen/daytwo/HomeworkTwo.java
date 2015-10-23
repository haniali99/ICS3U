package com.bayviewglen.daytwo;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String a = input.nextLine();
		
		System.out.println("Enter another word:");
		String b = input.nextLine();
		
		System.out.println(a + b + b + a);
		input.close();

	}

}
