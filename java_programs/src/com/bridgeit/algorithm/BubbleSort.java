package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		Utility ut=new Utility();
		
		System.out.println("Enter the number of integer you want insert");
		int n=ut.getVal();
		
		System.out.println("Enter "+n+" values for sorting");
		int[] arr=ut.arrayVal(n);
		
		int[] arr1=ut.bubbleSort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.println(arr1[i]);
		}
		
	}

}
