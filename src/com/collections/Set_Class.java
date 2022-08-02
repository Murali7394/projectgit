package com.collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Set_Class {
	public static void main(String[] args) {
		Set<Object>  s = new HashSet<Object>();
		List<Object>  l = new LinkedList<Object>();
		s.add("webelement");
		s.add("comptrolller");
		s.add(726);
		s.add('d');
		 
		for (Object object : s) {
			l.add(s);
		}
		
		System.out.println("list has converted to list");
		System.out.println(l);
		
		
	}

}
