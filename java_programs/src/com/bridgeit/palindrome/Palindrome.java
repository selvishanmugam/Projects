package com.bridgeit.palindrome;

import com.bridgeit.utility.Utility;
import com.bridgeit.palindrome.*;

public class Palindrome {

	public static void main(String[] args) {

		Utility ut = new Utility();
		DequeueUtility<Character> du = new DequeueUtility<Character>();
		//UtilityPalindrome up = new UtilityPalindrome();

		System.out.println("Enter a string to check for Palindrome");
		String str = ut.getstring();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			du.addFront(ch);
		}
		
		int flag;
		int flag1 = 0;
		if (du.removeFront() != du.removeRear()) {
			flag1 = 1;
		}
		if (flag1 == 0)
			System.out.println("The entered string is palindrome");
		else
			System.out.println("The entered string is not a palindrome");

	}

}
