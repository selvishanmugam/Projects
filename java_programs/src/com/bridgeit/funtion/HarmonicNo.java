package com.bridgeit.funtion;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class HarmonicNo {

	public static void main(String[] args) {

		Utility ut=new Utility();
		
		System.out.println("enter the n harmonic term");
		int n=ut.getVal();
		
		ut.harmonic(n);
		
	}
}
