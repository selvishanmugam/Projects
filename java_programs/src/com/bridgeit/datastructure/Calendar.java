package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class Calendar { 

	    public static void main(String[] args) {
	    	Utility ut=new Utility();
	    	System.out.println("Enter the month");
	        int month =ut.getVal();   
	        System.out.println("Enter the year");
	        int year = ut.getVal();
	        ut.calendar(month,year); 
	    }
	}