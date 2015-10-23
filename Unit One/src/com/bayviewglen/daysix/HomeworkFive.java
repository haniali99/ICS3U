package com.bayviewglen.daysix;

public class HomeworkFive {

	public static void main(String[] args) {
		int wins = 110;
		int losses = 44;
		
		double winningPercentage = (double)wins/(wins + losses);
		double winningPercentageRounded = (int)(winningPercentage*1000)/1000.0;
		
		System.out.println("The winning percentage of 1927 New York Yankees was " + winningPercentageRounded + "%.");
	}

}
