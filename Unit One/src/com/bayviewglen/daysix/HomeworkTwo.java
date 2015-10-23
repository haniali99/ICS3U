package com.bayviewglen.daysix;

public class HomeworkTwo {

	public static void main(String[] args) {
		double length = 4.5;
		double width =  2.3;
		
		double perimeter = length*2+width*2;
		double area = length*width;
		
		double areaRounded = (int)(area*10)/10.0;
		double perimeterRounded = (int)(perimeter*10)/10.0;
		
		System.out.println("The area of the rectangle is " + areaRounded + ".");
		System.out.println("The perimeter of the rectangle is " + perimeterRounded + ".");
				

	}

}
