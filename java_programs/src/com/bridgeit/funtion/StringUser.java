package com.bridgeit.funtion;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class StringUser {

	public static void main(String[] args) {
		
		System.out.println("Enter ur name");
		Utility ut=new Utility();
		String str1=ut.getstring();

		String stat= ut.inputString(str1);
		System.out.println(stat);
	}

}
