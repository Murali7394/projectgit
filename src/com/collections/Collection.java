package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		
	  List<String> l = new LinkedList<String>();
	  Set<String>  l_s=new HashSet<String>();
	  
		l.add("raja nagam");
		l.add("venom");
		l.add("kattu viriyan");
		l.add("kanadi viriyan");
		
		for (String string : l) {
			
			l_s.add(string);
			
		}
		System.out.println("printing set    "+l_s);
		l_s.add("venom");
		
		
		
		
		

	}

}
