package com.bridgeit.orderedlist;

import com.bridgeit.orderedlist.Node;
import com.bridgeit.utility.Utility;

public class orderedList {
	
	
	 Node start;
	    UtilityOrderedList nu=new UtilityOrderedList();
	    Utility u1=new Utility();

	    boolean flag=true;
	    
	    void getDataFromFile()
	    {
	        int[] retArry =nu.integerFileReader();
	        int[] sortArray =nu.sort(retArry);
	        int size =retArry.length;
	        System.out.println("Array Size is "+size);
	        for(int i=0;i<size;i++)
	        {

	            addItem(retArry[i]);
	        }
	    }

	    
	    public void List()
	    {
	        if(start ==null)
	        {
	            System.out.println("List is Empty ");
	        }
	    }

	    
	    public void addItem(int data)
	    {
	        Node head =start;
	        Node temp =new Node();
	        temp.data =data;
	        temp.nextNode =null;
	        if(start == null)
	        {
	            start = temp;
	        }
	        else
	        {
	            while(head.nextNode != null)
	            {
	                head=head.nextNode;
	            }
	            head.nextNode=temp;
	        }
	    }

	   
	   public  void display()
	   {
	        Node temp =start;
	        while( temp != null)
	        {
	            System.out.print(temp.data+"---->");
	            temp=temp.nextNode;
	        }
	        System.out.println(" ");
	    }

	   
	   public  int size()
	   {
	        int count=0;
	        Node temp =start;
	        while( temp.nextNode != null)
	        {
	            temp=temp.nextNode;
	            count++;
	        }
	        System.out.println("size of Linked List is"+" "+count);
	        return count;
	   }


	   public void searchData()
	   {
	        Node temp = start;
	        int count=0;
	        System.out.println("Enter a number to Search");
	        int s =u1.getVal();
	        int flag=0;
	        while(temp.nextNode != null)
	        {
	            count++;
	            if( temp.data==s)
	            {
	                System.out.println(" number is found At "+count);
	                flag++;
	                break;
	            }
	            temp=temp.nextNode;
	        }

	        if(flag == 1)
	        {
	            removeData(count);
	        }
	        else
	        {
	            addSortedItem(s);
	            System.out.println("After Adding a LIst ");
	            display();
	        }
	    }

	private void addSortedItem(int s) {

		Node new_node = new Node(s);
		Node temp;

		if (start == null || start.data >= new_node.data) {
			new_node.nextNode = start;
			start = new_node;
		} else {

			temp = start;

			while (temp.nextNode != null && temp.nextNode.data < new_node.data)
				temp= temp.nextNode;

			new_node.nextNode =temp.nextNode;
			temp.nextNode = new_node;
		}

	}

		void removeData(int count)
	    {
	        Node temp = start;
	        if(count==1)
	        {
	            start =start.nextNode;
	            System.out.println("After Deleting LIst is ");
	            display();
	        }
	        else
	        {
				for(int i=0;i<count-1;i++)
				{
				 	temp=temp.nextNode;
				}
	        temp.nextNode =temp.nextNode.nextNode;
	        System.out.println("After Deleting LIst is ");
	        display();
	        }
	    }

	    public static void main(String[] args)
	    {
	        orderedList obj = new orderedList();
	        obj.getDataFromFile();
	        obj.display();
	        obj.size();
	       	obj.searchData();
	    }
}
