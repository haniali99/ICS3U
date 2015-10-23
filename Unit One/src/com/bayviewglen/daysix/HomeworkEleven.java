package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkEleven {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the mass of an object: ");
		double mass = keyboard.nextDouble();
		
		System.out.println("Please enter the speed of an object: ");
		double speed = keyboard.nextDouble();
		
		double kineticEnergy = (1/2.0)*mass*speed*speed;
		
		System.out.println("The kintetic energy of the object is " + kineticEnergy + "J.");
		
		keyboard.close();

	}

}
