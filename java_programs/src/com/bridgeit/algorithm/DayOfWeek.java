package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		
		Utility ut=new Utility();
		System.out.println("Enter the Day");
		int day=ut.getVal();
		System.out.println("Enter the Month");
		int month=ut.getVal();
		System.out.println("Enter the Year");
		int year=ut.getVal();
		int result=ut.dayOfWeek(day,month,year);
		System.out.println(result);
		switch(result) {
		case 0: System.out.println("Sunday");
				break;
		case 1: System.out.println("Monday");
				break;
		case 2: System.out.println("Tuesday");
				break;
		case 3: System.out.println("Wednesday");
				break;
		case 4: System.out.println("Thursday");
				break;
		case 5:System.out.println("Friday");
				break;
		case 6:System.out.println("Saturday");
				break;
		}
	}

}
