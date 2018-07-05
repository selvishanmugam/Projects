package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class TempConversion {

	public static void main(String[] args) {
		
		Utility ut=new Utility();
		
		System.out.println("The temperature for conversion");
		System.out.println("Temperature entered is in celsius or Farenheit and convert it accordingly");
		System.out.println("1.Celsuis");
		System.out.println("2.Farenheit");
		int choice=ut.getVal();
		ut.tempConversion(choice);
			
	}

}
