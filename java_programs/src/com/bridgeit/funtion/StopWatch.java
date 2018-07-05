package com.bridgeit.funtion;

import com.bridgeit.utility.Utility;
import com.bridgeit.utility.UtilityStopWatch;

public class StopWatch {
	
	public static void main(String args[]) {
		Utility ut=new Utility();
		UtilityStopWatch usw=new UtilityStopWatch();
		System.out.println("Press 1 to start the timer");
		ut.getVal();
		usw.start();
		System.out.println("Press 2 to stop the timer");
		ut.getVal();
		usw.stop();
		long elasped=usw.elaspedTime();
		System.out.println("Elasped time :"+elasped);
	}
	
}
