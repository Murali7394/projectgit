package com.mytaskss;

public class Reversing_An_Array {

	public static void main(String[] args) {
		
		int a []= {1,2,3,4,5,6,7,8,9,0};
		int [] b= {};
		
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = a.length-1; j>=0; j--) {
				b[j]=a[i];
				
				
			}
			
		}

	}

}
