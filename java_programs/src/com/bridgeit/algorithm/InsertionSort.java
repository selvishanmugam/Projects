package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		
		Utility ut=new Utility();
		System.out.println("How many numbers u want to enter??");
		int n=ut.getVal();
		int[] b=ut.arrayVal(n);
		ut.insertionSort(b,n);
		
	}
}
