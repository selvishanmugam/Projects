package com.bridgeit.funtion;

import com.bridgeit.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		 
		Utility ut = new Utility();

		System.out.println("Enter a year to be checked");
		int yr = ut.getVal();
		boolean result = ut.leap(yr);
		if (result == true)
			System.out.println("the given year is leap year");
		else
			System.out.println("the given year is not a leap year");
	}
}
