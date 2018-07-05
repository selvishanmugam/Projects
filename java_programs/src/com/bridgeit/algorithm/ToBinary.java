package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class ToBinary {

	public static void main(String[] args) {
		Utility ut=new Utility();
		
		System.out.println("Enter the decimal number");
		int dec=ut.getVal();
		
		ut.toBinary(dec);

	}

}
