package com.vitor.math.util;

public class MathUtil {
	// Greatest Common Divisor
	public static int gcd(int number1, int number2) {
		if (number1 == 0 || number2 == 0) {
			return number1 + number2;
		} else {
			int absNumber1 = Math.abs(number1);
			int absNumber2 = Math.abs(number2);
			int biggerValue = Math.max(absNumber1, absNumber2);
			int smallerValue = Math.min(absNumber1, absNumber2);
			return gcd(biggerValue % smallerValue, smallerValue);
		}
	}

	// Least Common Multiple
	public static int lcm(int number1, int number2) {
		if (number1 == 0 || number2 == 0)
			return 0;
		else {
			int gcd = gcd(number1, number2);
			return Math.abs(number1 * number2) / gcd;
		}
	}
}
