package com.mytaskss;


// with out using third variable;
public class SwappingNumbers {
	public static void main(String[] args) {

		int a = 600;
		int b = 3500;
		System.out.println("the value of a before swaping   ;" + a);
		System.out.println("the value of b before swaping   ;" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("the value of a after swaping    ;" + a);
		System.out.println("the value of b after swaping    ;" + b);

	}

}