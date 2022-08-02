package com.mytaskss;

public class ReverseANumber {
	public static int a = 789, b = 0 , c= 0;
	public static void main(String[] args) {
		while (a != 0) {
			b = a % 10;
			a = a / 10;
			c = (c*10) + b;

		}
		System.out.println(c);
	}

}
