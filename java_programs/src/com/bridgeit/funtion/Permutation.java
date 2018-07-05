package com.bridgeit.funtion;

import com.bridgeit.utility.Utility;

public class Permutation {

	public static void main(String[] args) {
		
		Utility ut=new Utility();
		
		String str = ut.getstring();
	        int n = str.length();
	        ut.permute(str, 0, n-1);
	}
}
