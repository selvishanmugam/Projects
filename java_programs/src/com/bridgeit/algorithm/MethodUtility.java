package com.bridgeit.algorithm;

import java.util.Arrays;

import com.bridgeit.utility.Utility;

public class MethodUtility {

	public static void main(String[] args) {

		Utility ut = new Utility();
		System.out.println("Choose any option from the below list ");
		System.out.println("1. BinarySearch for integer");
		System.out.println("2. BinarySearch  for String");
		System.out.println("3. InsertionSort for integer");
		System.out.println("4. InsertionSort for String");
		System.out.println("5. BubbleSort for integer");
		System.out.println("6. BubbleSort for String");
		System.out.println("Enter your choice");
		int ch = ut.getVal();
		switch (ch) {
		
		case 1:	
			System.out.println("How many numbers u want to enter??");
			int n1 = ut.getVal();
			int[] b1 = ut.arrayVal(n1);
			int last=b1.length;
			System.out.println("Enter the value you want to search");
			int search=ut.getVal();
			int result=ut.binarySearchInt(b1,0,last,search);
			if(result==-1) {
				System.out.println("number not found");
			}
			else {
				System.out.println(search+" found at position "+result);
			}
			break;
			
		case 2:		
			String list1[] = { "Apple", "CHERRY", "artichoke", "banana","cat"  };
			System.out.println(Arrays.toString(list1));
			int last1=list1.length-1;
			System.out.println(last1);
			String search1=ut.getstring();
			System.out.println(search1);
			int reslt=ut.binarySearchString(list1,0,last1,search1);
			if(reslt==-1) {
				System.out.println("String not found");
			}
			else {
				System.out.println(search1+" found at position "+reslt);
			}
			break;

		case 3:
			System.out.println("How many numbers u want to enter??");
			int n3 = ut.getVal();
			int[] b3 = ut.arrayVal(n3);
			ut.insertionSort(b3, n3);
			break;

		case 4:
			String list[] = { "artichoke", "Apple", "CHERRY", "banana" };
			System.out.println(Arrays.toString(list));
			ut.insertionSortString(list);
			break;

		case 5:
			System.out.println("Enter the number of integer you want insert");
			int n5 = ut.getVal();
			System.out.println("Enter " + n5 + " values for sorting");
			int[] arr = ut.arrayVal(n5);
			int[] arr1 = ut.bubbleSort(arr, n5);
			for (int i = 0; i < n5; i++) {
				System.out.println(arr1[i]);
			}
			break;

		case 6:
			String list6[] = { "Artichoke", "Apple", "Cherry", "Banana" };
			System.out.println(Arrays.toString(list6));
			ut.bubbleSortString(list6);
			break;

		default:
			System.out.println("Invalid Entry");
			break;

		}

	}
	
}