package com.mytaskss;

import java.util.Scanner;

public class Amstrong_NumbersRange {

	public static void main(String[] args) {

		int a, b, c, d, e, f = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Starting range of Amstrong numbers");
		a = s.nextInt();
		System.out.println("Enter the Ending range of the Amstrong number");
		b = s.nextInt();
		s.close();

		for (int i = a; i <= b; i++) {

			c = i;

			while (i != 0) {
				d = i % 10;
				e = d * d * d;
				c = i / 10;
				f = f + e;

			}

			if (f == c) {

				System.out.println("the number is Amstrong Number   " + c);
			}

		}

	}

}
