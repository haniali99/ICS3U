package com.bayviewglen.daytwo;

import java.util.Scanner;

public class HomeworkSeven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a word with an even number of total characters: ");
		String word = input.nextLine();
		
		int middle = word.length()/2;
		
		String firstHalf = word.substring(0,middle);
		
		System.out.println(firstHalf);
		
		input.close();
		

	}

}
