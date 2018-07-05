package com.bridgeit.funtion;

import com.bridgeit.utility.Utility;

public class Triplets {

	public static void main(String[] args) {
		
		Utility ut=new Utility();
			
		System.out.println("Enter how many numbers you want input");
			int n=ut.getVal();
			int[] arr=ut.arrayVal(n);
			ut.tripletsNumb(arr,n);
			
	}

}
