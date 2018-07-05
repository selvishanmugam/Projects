package com.bridgeit.datastructure;

public class Stack {

	long[] stackarr;
	int top;
	int max;
		
	public Stack(int s) {
		max =s;
		stackarr = new long[s];
		top = -1;
	}
	
	public void push(int data) {
		stackarr[++top]=data;
	}
	
	public double pop() {
		return stackarr[top--];
	}
	
	public double peek() {
		return top;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	
}
