package com.bridgeit.oop;

import java.util.Date;
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class RegexString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Utility ut= new Utility();
		UserDetails ud=new UserDetails();
		
		System.out.println("Enter the first Name");
		ud.setName(ut.getstring());

		System.out.println("Enter the last name");
		ud.setlName(ut.getstring());
		
		System.out.println("Enter the phone number");
		
		ud.setPhoneNo(sc.nextLong());
			
		ud.setDate(ut.getDateVal(new Date()));
		System.out.println(ut.stringChange(ud,ut.textFile("/home/bridgeit/selvi/java_programs/Regex.txt")));
	
	}

}
