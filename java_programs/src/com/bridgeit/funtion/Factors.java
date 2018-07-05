package com.bridgeit.funtion;

import com.bridgeit.utility.Utility;

public class Factors {

	public static void main(String[] args) {
		
		Utility ut = new Utility();
		System.out.println("Enter a number to find its prime factor");
		int n=ut.getVal();
		ut.factor(n);
	}

}
