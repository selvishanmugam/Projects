package com.bridgeit.funtion;

import com.bridgeit.utility.Utility;

public class Gambler {

	public static void main(String[] args) {
		
		Utility ut=new Utility();
		
		System.out.println("Enter how many stakes, Goals and trials you want to play for???");
		
		int stk=ut.getVal();
		int goal=ut.getVal();
		int no=ut.getVal();
		ut.gamblerGame(stk,goal,no);

	}

}
