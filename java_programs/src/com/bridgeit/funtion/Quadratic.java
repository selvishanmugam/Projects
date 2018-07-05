package com.bridgeit.funtion;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		Utility ut=new Utility();
		
		System.out.println("enter the value of a,b and c");
		
		int a,b,c;
		
		a=ut.getVal();
		b=ut.getVal();
		c=ut.getVal();
		
		ut.quadratic(a,b,c);
		
	}

}

