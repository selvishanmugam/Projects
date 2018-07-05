package com.bridgeit.funtion;

import com.bridgeit.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		
		Utility ut=new Utility();
		
		System.out.println("Enter the value of x and y to find the distance from origin");
		int x=ut.getVal();
		int y=ut.getVal();
		ut.distance(x,y);
		
		
	}

}
