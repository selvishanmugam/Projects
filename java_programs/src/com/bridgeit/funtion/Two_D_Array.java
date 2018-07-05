package com.bridgeit.funtion;

import com.bridgeit.utility.Utility;

public class Two_D_Array {

	public static void main(String[] args) {
		
		Utility ut= new Utility();
		
		System.out.println("Enter the no if rows and columns");
		int r=ut.getVal();
		int c=ut.getVal();
		int m=r*c;
		System.out.println("Number of input for 2D array :"+m);
		ut.array(r,c,m);
	}

}
