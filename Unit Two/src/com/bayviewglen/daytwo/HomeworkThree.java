package com.bayviewglen.daytwo;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a phrase:");
		String wordStrings = input.nextLine();
		
		System.out.println("Now enter a tag:");
		String tag = input.nextLine();
		
		System.out.println("<" + tag + ">" + wordStrings + "</" + tag + ">");
		
		input.close();		

	}

}
