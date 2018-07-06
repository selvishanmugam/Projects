package com.bridgeit.orderedlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgeit.orderedlist.Node;

public class UtilityOrderedList {
	String[] stringArray;
    int[] intArray;
	
    public int[] sort(int[] arr )
	{
    	int size=arr.length;
    	for(int i=size;i>0;i--)
		{
      		for(int j=1;j<size;j++)
			{
        		if(arr[j-1]>arr[j])
				{
          			int temp=arr[j-1];
          			arr[j-1]=arr[j];
          			arr[j]=temp;
        		}
      		}
      		size--;
    	}
    	return arr;
  	}
	
    public int[] integerFileReader()
	{
		try
		{
			String str = new String();
			FileReader fr = new FileReader("/home/bridgeit/selvi/java_programs/odereddoc.txt");
			BufferedReader br = new BufferedReader(fr);
		    String s;

		    while((s = br.readLine()) != null) 
			{
		       str=str+s;
		    }
 
		    stringArray = str.split(" "); 
		    intArray = new int[stringArray.length];

		    for(int i=0; i <intArray.length;i++)
		    {
		        try
		        {
		            intArray[i]= Integer.parseInt(stringArray[i]);
		        }
		        catch(Exception e)
		        {
		            System.out.println(e);
		        }
		    }
		}
		catch(Exception obj)
		{
		    System.out.println("e");
		}
        	return intArray;
    }

}
