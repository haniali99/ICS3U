package com.bayviewglen.dayfour;

public class ExampleOne {

	public static void main(String[] args) {
		System.out.println(3 * 6); // 18
		System.out.println(3 + 6); // 9
		System.out.println(3 / 6); // 0 - both operands are integers

		System.out.println(3.0 * 6); // 18.0
		System.out.println(3 + 6.0); // 9.0
		System.out.println(3.0 / 6); // 0.5 - one operand is a double so I get
										// double division

		System.out.println(3 % 6); // 33 - the remainder is 3
		System.out.println(23 % 2); // 1 - this is how we can find out if it is
									// an even or an odd
		System.out.println(458548 % 10); // 8 mod it by 10 to get the last digit

		int number = 523416;
		int firstDigit = number / 100000;
		int sixthDigit = number % 10;
		int secondDigit = number / 10000 % 10;
		int thirdDigit = number / 1000 % 10;
		int fourthDigit = number / 100 % 10;
		int fifthDigit = number / 10 % 10;
		System.out.println(firstDigit);
		System.out.println(secondDigit);
		System.out.println(thirdDigit);
		System.out.println(fourthDigit);
		System.out.println(fifthDigit);
		System.out.println(sixthDigit);

	}

}
