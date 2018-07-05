package com.bridgeit.unorderedlist;

public class Node <E> {
	int d;
	public String data;
	public Node next;

	public Node() {
		next = null;
		data=null;
		d=0;
	}

	public void setData(int d1) {
		d = d1;
		next=null;
	}

	public void setData(String data) {
		this.data = data;
		next=null;
	}
}

