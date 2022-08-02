package com.javaprogramm;

import java.util.LinkedList;
import java.util.List;

public class List_task {

	public static void main(String[] args) {

		List<Object> l = new LinkedList<Object>();
		l.add("murali");
		l.add("dharani");
		l.add("Raman");
		l.add(5);
		System.out.println(l.size());

		for (int i = 0; i <= l.size() - 1; i++) {

			System.out.println(l.get(i).toString().toUpperCase());

		}

		for (Object object : l) {
			System.out.println(object.toString().toUpperCase());
		}

	}

}
