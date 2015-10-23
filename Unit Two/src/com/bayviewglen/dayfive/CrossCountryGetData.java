package com.bayviewglen.dayfive;

import java.util.Scanner;

public class CrossCountryGetData {

	public static void main(String[] args) {
		int minutes;
		double seconds;
		
		Scanner scanner = new Scanner(System.in);
		
		String mileOne = scanner.nextLine();
		
		minutes = Integer.parseInt(mileOne.split(":")[0]);
		seconds = Double.parseDouble(mileOne.split(":")[1]);
		
		System.out.println(minutes + ":" + seconds);
		
		scanner.close();		

	}

}
