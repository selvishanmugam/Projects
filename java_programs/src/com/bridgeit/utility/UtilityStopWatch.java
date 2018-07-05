package com.bridgeit.utility;

public class UtilityStopWatch {
	
	long startTimer=0;
	long stopTimer=0;
	long elasped=0;
	public void start() {
		startTimer=System.currentTimeMillis();
		System.out.println("Start-Time:"+" "+startTimer);
	}
	public void stop() {
		stopTimer=System.currentTimeMillis();
		System.out.println("Stop-Time:"+" "+stopTimer);
	}
	public long elaspedTime() {
		elasped=stopTimer-startTimer;		
		return elasped;
	}
	
	

}
