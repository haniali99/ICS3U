package com.bayviewglen.dayone;

public class ExampleTwo {

	public static void main(String[] args) {
		//primitive variables int x; x = 7
		
				String s = "Hello";
				
				System.out.println(s);
				//not primitive
				//object variables store references/addresses 
				// s is a reference to the string hello 
				//each character is assigned a number
				//the first character is assigned the number 0
				//we can use these numbers to find certain characters
				//if we want to only display index 1 (also known as the second character) we can use charAt
				
				System.out.println(s + "'s second character is " + s.charAt(1));
				System.out.println(s + " has " + s.length() + " characters.");
				
			//	Scanner input = new Scanner(System.in);
			//	String sentence = input.nextLine();
				
			//	System.out.println(sentence + " has " + sentence.length() + " characters.");
			//	System.out.println("The second last character is " + sentence.charAt(sentence.length() - 2));
			//	System.out.println("This crashes " + sentence.charAt(sentence.length())); //cannot equal length
				System.out.println(s.substring(1,3));
				System.out.println(s.substring(1));
				
				System.out.println(5%4);

	}

}
