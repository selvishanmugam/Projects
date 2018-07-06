package com.bridgeit.orderedlist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgeit.orderedlist.Node;

public class UtilityOrderedList {

	public Node list(Node first) {
		try {
			FileInputStream fs = new FileInputStream("/home/bridgeit/selvi/java_programs/odereddoc.txt");
			char ch;
			String word = "";
			while (fs.available() > 0) {
				ch = (char) fs.read();
				word = word + ch;
			}
			String[] wordArr = word.split(" ");
			int[] arr = new int[wordArr.length - 1];
			for (int i = 0; i < wordArr.length - 1; i++) {
				arr[i] = Integer.parseInt(wordArr[i]);
			}
			arr = sort(arr);
			for (int i = 0; i < wordArr.length - 1; i++) {

				first = add(first, arr[i]);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return first;
	}

	private Node add(Node start, int num) {

		Node node1 = start;
		Node newNode = new Node();
		newNode.data = num;
		newNode.next = null;
		if (start == null) {
			return newNode;
		} else {
			while (start.next != null) {
				start = start.next;
			}
			start.next = newNode;
		}
		return node1;
	}

	private int[] sort(int[] arr) {
		int size=arr.length-1;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
				}
			}
			size--;
		}
		return arr;
	}
	public Node search(int search, Node first) {
		Node node1 = first;
		if(search==first.data) {
			System.out.println("hii");
			node1 = node1.next;
			System.out.println(" THE SEARCH ITEM IS FOUND ");
			System.out.println(" THE SEARCH ITEM REMOVED SUCCESSFULLY ");
			System.out.println(" FILE SAVED ");
			return node1 ;
		}
		
		
		while (node1 .next != null) {
			if (search==((node1 .next).data) ) {
				node1.next=node1.next.next;
				//node1 .next = remove(node1);
				System.out.println(" THE SEARCH ITEM IS FOUND ");
				System.out.println(" THE SEARCH ITEM REMOVED SUCCESSFULLY ");
				System.out.println(" FILE SAVED ");
				return first;
			}
			node1 = node1 .next;
		}
	
			System.out.println("THE SEARCH ITEM IS NOT FOUND");
			System.out.println("THE SEARCH ITEM IS ADDED SUCCESSFULLY");
			System.out.println("FILE SAVED");
			node1 = add(node1, search);
		

		return first;
	}

	public void writeFile(int t) {
		try {
			File f = new File("/home/bridgeit/selvi/java_programs/odereddoc.txt");
			f.createNewFile();
			FileWriter fw = new FileWriter(f);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
