package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {
		
		Utility ut=new Utility();
		System.out.println("Enter the amount");
		int amt=ut.getVal();
		int[] arr= {1000,500,100,50,20,10,5,2,1};
		int n=arr.length;
		ut.vendingMachine(amt,arr,n);
		
		
	}

}
