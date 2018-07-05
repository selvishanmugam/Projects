package com.bridgeit.unorderedlist;

import com.bridgeit.utility.Utility;
import java.io.*;

import com.bridgeit.unorderedlist.Node;
import com.bridgeit.unorderedlist.UtilityUnorderedLIst;

public class Unordered <E>{


	static Node first;
	
	static UtilityUnorderedLIst uu=new UtilityUnorderedLIst();
	
	public static void main(String[] args) {
		Utility ut=new Utility();
		String word="";
		
		//Unordered ud=new Unordered();
		first=uu.list(first);
		System.out.println("Enter the word you want to search");
		String search=ut.getstring();
		first=uu.search(search,first);
		String index=" ";
		while(first!=null) {
			index=index+first.data;
			index=index+" ";
			first=first.next;
		}
		uu.writeFile(word);
	}	
}
