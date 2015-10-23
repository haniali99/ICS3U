package com.bayviewglen.daytwo;

import java.util.Scanner;

public class HomeworkFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word 2 (two) characters long: ");
		
		String s = input.nextLine();
		int last = s.length()-2;
		
		String lastTwoLetters = s.substring(last) + s.substring(last) + s.substring(last);
		
		System.out.println(lastTwoLetters);
		
		input.close();

	}

}
