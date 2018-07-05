package com.bridgeit.datastructure;

public class QuePrimeAna {
	QNode front,rear;
	
	

	public QuePrimeAna() {
		
		this.front = null;
		this.rear = null;
	}


	public void enQue(int data) {
		
		QNode temp=new QNode(data);
		if(rear==null) {
			rear=temp;
			front=rear;
		}
		else {
			rear.next=temp;
			rear=temp;
		}
		
	}
	
	public QNode deQue() {
		
		if(front==null) {
			
			return null;
		}
			
			QNode temp=front;
			front=front.next;
	
		return temp;
	}


}
