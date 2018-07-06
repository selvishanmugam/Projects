package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class BalancedParantheses {

	public static void main(String[] args) {
	 Utility ut=new Utility();
	 
	 System.out.println("Enter the max size");
	 int size=ut.getVal();
	 System.out.println("Enter the expression");
	 String exp=ut.getstring();
	 System.out.println("The balanced parentheses to check for the expression");
	 ut.balancedParentheses(exp,size);
	}

}
