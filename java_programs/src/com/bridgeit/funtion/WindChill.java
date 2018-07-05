package com.bridgeit.funtion;

import com.bridgeit.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		
		Utility ut=new Utility();
		System.out.println("Enter the value of temperature and velocity of the wind to calculate the windChill : ");
		
		double t=ut.getDouble();
		double v=ut.getDouble();
		
		ut.windChill(t,v);
		
	}

}
