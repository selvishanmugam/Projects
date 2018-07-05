package com.bridgeit.unorderedlist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgeit.unorderedlist.Node;

public class UtilityUnorderedLIst {
	public Node list(Node first) {
		try {
			FileInputStream fs = new FileInputStream("/home/bridgeit/selvi/java_programs/documents.txt");
			char ch;
			String word = "";
			while (fs.available() > 0) {
				ch = (char) fs.read();
				word = word + ch;
			}
			String[] wordArr = word.split(" ");
			for (int i = 0; i < wordArr.length; i++) {
				first = add(first, wordArr[i]);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return first;
	}

	private Node add(Node start, String str) {

		Node node1 = start;
		Node newNode = new Node();
		newNode.data = str;
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

	public void writeFile(String word) {
		try {
			File f = new File("/home/bridgeit/selvi/java_programs/documents.txt");
			f.createNewFile();
			FileWriter fw = new FileWriter(f);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Node search(String search, Node first) {
		Node node1 = first;
		if(search.compareTo(first.data)==0) {
			System.out.println("hii");
			node1 = node1.next;
			System.out.println(" THE SEARCH ITEM IS FOUND ");
			System.out.println(" THE SEARCH ITEM REMOVED SUCCESSFULLY ");
			System.out.println(" FILE SAVED ");
			return node1 ;
		}
		
		
		while (node1 .next != null) {
			if (search.compareTo((node1 .next).data) == 0) {
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

	/*private Node remove(Node node2) {
		Node temp = node2;
		node2.next= node2.next.next;
		return node2.next;
	}*/
}
