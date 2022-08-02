package com.mytaskss;

public class Amstrong_Number {

	public static int a;

	public static void main(String[] args) {
		int b = 153, a, rem, last = 0;

		a = b;

		while (a != 0) {

			rem = a % 10;
			System.out.println(rem);
			rem = rem * rem * rem;
			a = a / 10;
			last = last + rem;

		}

		if (b == last) {

			System.out.println("The number is the Amstrong Number");
		} else {
			System.out.println("the number is not the Amstrong Number");
		}

	}

}
