package com.javaprogramm;

public class StringReverse {

	public static void main(String[] args) {

		String s = "M A D A M";
		String r = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			r = r + s.charAt(i);
		}

		System.out.println("Reversed string    " + r);
		if (s.equals(r)) {
			System.out.println(s + " IS A PALINDROME ");
		} else {
			System.out.println(s + "  IS NOT A PALINDROME");
		}

	}

}
