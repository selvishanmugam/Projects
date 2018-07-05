package com.bridgeit.funtion;
import java.util.*;

import com.bridgeit.utility.Utility;
public class PowerOf2 {
	public static void main(String args[]) {
		
				// TODO Auto-generated method stub
				Utility ut= new Utility();
				
				System.out.println("Enter a number upto which we need 2 sqaure");
				int n=ut.getVal();
				if(n>0 && n<=31)
				ut.powerOf2(n);
				else
					System.out.println("invalid input");
			}
	}


