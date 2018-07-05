package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
	
		Utility ut=new Utility();
		System.out.println("Enter the two string to find whether they are anagram");
		/*
		String str1=ut.getstring();
		String str2=ut.getstring();*/
		
		Boolean result=ut.anagramCheck("is that","isthat");
		if(result==true)
			System.out.println("The string are anagram");
		else
			System.out.println("The string are not anagram");
		

	}

}
