package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkNine {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter the number of items sold: ");
		int numberSold = keyboard.nextInt();

		double commissionPerUnit = 0.27;
		double totalCommission = commissionPerUnit * numberSold;
		
		double totalCommissionRounded = (int)(totalCommission*100)/100.0;

		System.out.println("The amount of pay due for " + numberSold + " items sold is $" + totalCommissionRounded + ".");
		
		keyboard.close();

	}

}
