package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {
		
		Utility ut=new Utility();
		
		double p,y,r;
		
		System.out.println("Enter the Princial amount");
		p=ut.getDouble();
		System.out.println("Enter the Rate of interest");
		r=ut.getDouble();
		System.out.println("Enter the period in years ");
		y=ut.getDouble();
		ut.monthlyPayments(p,y,r);
			
	}

}
