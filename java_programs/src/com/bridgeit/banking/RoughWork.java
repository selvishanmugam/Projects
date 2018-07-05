/*public static void BankingCounter(Queue ob, int bankBalance, int people) {

int count=0;
while(count<=people){
boolean flag;
System.out.println("..........Banking Counter Transaction Running");
do
{
System.out.println();

System.out.println("1.Deposit");
System.out.println("2.Withdraw");
System.out.println("3.check Current Balance is ");
System.out.println("4.Number of person in queue");
System.out.println("5.Dequeue");
System.out.println("6.Enqueue");
System.out.println("Enter your choice");
int choice=Utility.inputInterger();
switch (choice)
{
case 1:
System.out.println("Enter the amount you want to deposit");
int money =Utility.inputInterger();
bankBalance=bankBalance+money;
System.out.println("BankBalance is"+bankBalance);
break;

case 2:
System.out.println("Enter the amount you want to winthdraw");
int withdraw=Utility.inputInterger();
if(withdraw>bankBalance)
{
System.out.println("Insufficient balance");
}
else
{
bankBalance=bankBalance-withdraw;
System.out.println("Balance is"+bankBalance);
}

break;

case 3:
System.out.println("current balance is"+bankBalance);
break;

case 4:
int NumOFPeople=ob.NumofPeople();
System.out.println("Number of People in queue"+NumOFPeople);
break;

case 5:
ob.Dequeue();
NumOFPeople=ob.NumofPeople();
System.out.println("number of person in queue"+NumOFPeople);
break;

case 6:
ob.Enqueue();
NumOFPeople=ob.NumofPeople();
System.out.println("number of person in queue"+NumOFPeople);

break;

default:
System.out.println("you choice is invalid");
System.exit(0);
}	
System.out.println("If you want to do another transaction please enter true or false");
flag=Utility.inputBoolean();
}while(flag);
    ob.Dequeue();
}
}



package com.bridgeit.datastructure;

public class Queue <T>{
public int front,rear,size,person;
public int arr[];
Queue(int size,int person)
{
this.size=size;
this.rear=person;
this.front=0;

arr=new int[size];
System.out.println("Queue is ready");
}
public void Enqueue()
{
if(isFull())
{
System.out.println("Queue is full");
}else
{
rear=rear+1;
}
}
public void Dequeue()
{
if(isEmpty())
{
System.out.println("Queue is empty");
}
else
{
front++;
}
}
public boolean isFull()
{
return(rear==size);
}
public boolean isEmpty()
{
return(front==rear);
}
public int NumofPeople()
{
return(rear-front);
}
}










package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class BankingCashCounter {

private static int bankBalance=100000;

public static void main(String[] args) {



System.out.println("Enter size of queue");
int size=Utility.inputInterger();

System.out.println("Enter number of people in queue");
int people=Utility.inputInterger();

Queue ob=new Queue(size,people);
Utility.BankingCounter(ob,bankBalance,people);

}
}





*/