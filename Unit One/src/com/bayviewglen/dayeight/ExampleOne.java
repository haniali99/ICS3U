package com.bayviewglen.dayeight;

public class ExampleOne {

	public static void main(String[] args) {
		int maxValue = Integer.MAX_VALUE;

		System.out.println(maxValue); // 2147483647
		System.out.println(maxValue + 1); // -2147483648

		byte maxValueByte = Byte.MAX_VALUE;
		byte byte2 = (byte) (maxValueByte + 1);
		System.out.println(maxValueByte); // 127
		System.out.println(byte2); // -128

		byte2 = (byte) (114 + 109);
		System.out.println(byte2); // -33
		System.out.println(5 / 0); // throws an exception ArithmeticException

		System.out.println(-5.0 / 0); // does not crash but displays -Infinity

	}

}
