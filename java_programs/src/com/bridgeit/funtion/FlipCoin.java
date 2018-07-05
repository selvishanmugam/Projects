package com.bridgeit.funtion;

import com.bridgeit.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility ut=new Utility();
		System.out.println("Enter no. of times u want to flip coin");
		int n=ut.getVal();
		
		ut.fcoin(n);

	}

}
