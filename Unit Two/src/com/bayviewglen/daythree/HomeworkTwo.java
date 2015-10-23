package com.bayviewglen.daythree;

public class HomeworkTwo {

	public static void main(String[] args) {
		final int LOWER_BOUND = -50;
		final int UPPER_BOUND = 50;		
		
		int number = (int)((Math.random()*(UPPER_BOUND-LOWER_BOUND +1))+LOWER_BOUND);
		
		System.out.println(number);

	}

}
