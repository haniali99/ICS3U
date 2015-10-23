package com.bayviewglen.dayfive;

import java.text.DecimalFormat;

public class ExampleOne {

	public static void main(String[] args) {
		double x = 56.56;
		// DecimalFormat only needs to be before formatter once
		DecimalFormat formatter = new DecimalFormat("######.#"); // "######.#" is the same as .##
		System.out.println(formatter.format(x));
		
		formatter = new DecimalFormat("######.0");
		System.out.println(formatter.format(x));
		
		formatter = new DecimalFormat("######.0%"); // moves decimal place to the end 
		System.out.println(formatter.format(x));
		
		x = 4544654.33;
		formatter = new DecimalFormat("###,###.000");
		System.out.println(formatter.format(x));

	}

}
