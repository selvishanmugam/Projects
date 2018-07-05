package com.bridgeit.funtion;

import com.bridgeit.utility.Utility;

public class Coupon {

	public static void main(String[] args) {
		
		Utility ut=new Utility();
		
		System.out.println("Enter the number of trials");
		int n=ut.getVal();
		
		ut.couponColl(n);
		
	}

}
