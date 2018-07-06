package com.bridgeit.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgeit.banking.Queue;
import com.bridgeit.datastructure.QuePrimeAna;
import com.bridgeit.datastructure.Stack;
import com.bridgeit.datastructure.StackPrimeAna;
import com.bridgeit.oop.Stock;
import com.bridgeit.oop.UserDetails;

public class Utility {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	private final String RegexString_Name="<<name>>";
	private final String RegexString_fName="<<full name>>";
	private final String RegexString_date="01/01/2016";
	private final String RegexString_phoneno="91-xxxxxxxxxx";

	public String getstring() {
		return sc.next();
	}

	public int getVal() {
		return sc.nextInt();
	}

	public double getDouble() {
		return sc.nextDouble();
	}

	public double randomVal() {
		return rand.nextDouble();
	}

	public int[] arrayVal(int n) {

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = getVal();
		}
		return a;
	}

	public static String inputString(String str1) {
		String str2 = "hello <<username>>, How are you??";
		System.out.println(str2);
		String rplc = str2.replace("<<username>>", str1);
		return rplc;
	}

	public void powerOf2(int n) {
		for (int i = 0; i <= n; i++) {
			int product = (int) Math.pow(2, i);
			System.out.println("2^" + i + "=" + product);
		}
	}

	public void quadratic(int a, int b, int c) {
		double r1, r2, del;
		System.out.println(a + "^x*x + " + b + "^x" + " + " + c);

		del = b * b - 4 * a * c;
		r1 = (b + Math.sqrt(del)) / (2 * a);
		r2 = (b - Math.sqrt(del)) / (2 * a);

		System.out.println(del);
		System.out.println(r1);
		System.out.println(r2);
	}

	public void factor(int N) {
		int j = N;
		for (int i = 2; i * i <= j; i++) {
			while (N % i == 0) {
				N = N / i;
				System.out.println(i);
			}
		}
	}

	public boolean leap(int yr) {
		if (yr % 4 == 0 && yr % 100 != 0 || yr % 400 == 0) {
			return true;
		}
		return false;
	}

	public void fcoin(int n) {
		// TODO Auto-generated method stub
		int headcount = 0, tailcount = 0;
		double headpercnt, tailpercnt;
		for (int i = 1; i <= n; i++) {
			double flip = randomVal();
			if (flip < 0.5) {
				System.out.println("tail");
				tailcount++;
			} else {
				System.out.println("head");
				headcount++;
			}
		}
		headpercnt = (double) headcount / n * 100;
		tailpercnt = (double) tailcount / n * 100;
		System.out.println(headcount);
		System.out.println(tailcount);
		System.out.println(headpercnt);
		System.out.println(tailpercnt);
	}

	public void distance(int a, int b) {

		double dist;
		dist = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println("The distance between the point and origin: " + dist);

	}

	public void windChill(double t, double v) {

		double w;
		w = 35.74 + 0.6215 * t + (0.4275 - 35.75) * Math.pow(v, 0.16);
		System.out.println("The windchill of the weather : " + w);

	}

	public void harmonic(int n) {

		if (n != 0) {
			System.out.println("harmonic number is ");

			for (int i = 1; i <= n; i++) {

				if (i < n)
					System.out.print("1/" + i + " + ");
				else if (i == n)
					System.out.println("1/" + n);

			}
		}
	}

	public void gamblerGame(int stk, int goal, int no) {

		int win = 0;
		for (int i = 1; i <= no; i++) {

			int money = stk;
			while (money > 0 && money < goal) {
				if (Math.random() < 0.5)
					money++;
				else
					money--;
			}
			if (money == goal)
				win++;
		}
		int loss = no - win;
		System.out.println("wins " + win + " " + "loss" + " " + loss + " out of " + no);
		System.out.println("percent of games won" + " " + 100 * win / no);
		System.out.println("percent of games lost" + " " + 100 * loss / no);
	}

	public void couponColl(int n) {

		boolean[] collected = new boolean[n];
		int count = 0;
		int distinct = 0;

		while (distinct < n) {
			int term = (int) (Math.random() * n);
			count++;
			if (!collected[term]) {
				distinct++;
				collected[term] = true;
			}
		}
		System.out.println(count);
		System.out.println(distinct);
	}

	public void array(int r, int c, int m) {
		int[][] a1 = new int[10][10];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a1[i][j] = getVal();
			}
		}
		for (int p = 0; p < r; p++) {
			for (int q = 0; q < c; q++) {
				System.out.print(a1[p][q] + " ");
			}
			System.out.println();
		}
	}

	public void tripletsNumb(int[] arr, int n) {
		int f = 0, i, j = 0, k = 0;
		for (i = 0; i < n - 2; i++) {
			for (j = i + 1; j < n - 1; j++) {
				for (k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0)
						System.out.println("triplets present are: " + arr[i] + " , " + arr[j] + " and " + arr[k]);
					f++;
				}
			}
		}
		if (f == 0)
			System.out.println("No Triplets found");
		else
			System.out.println("triplets present are: " + arr[i] + " , " + arr[j] + " and " + arr[k]);
	}

	public void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public Boolean anagramCheck(String str1, String str2) {
		String str11 = str1.replaceAll(" ", "");
		String str22 = str2.replaceAll(" ", "");
		System.out.println(str11.length());
		System.out.println(str22.length());
		boolean status = true;

		if (str11.length() != str22.length()) {
			status = false;
		} else {
			char[] s1 = str11.toLowerCase().toCharArray();
			char[] s2 = str22.toLowerCase().toCharArray();

			Arrays.sort(s1);
			Arrays.sort(s2);

			status = Arrays.equals(s1, s2);
		}

		return status;
	}

	public int[] bubbleSort(int[] arr, int n) {
		int i, j, temp;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;

	}

	public void primeNo() {
		int x = 0;
		int[] primeVal = new int[5000];
		for (int i = 1; i <= 1000; i++) {
			int count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count = count + 1;
					break;
				}
			}
			if (count == 0) {
				// System.out.print(i + " ");
				primeVal[x] = i;
				x++;
			}
		}
		System.out.println();
		// System.out.println("Total number of number present are" + " " + x);
		// isPrimePalindrome(primeVal);
		isPrimeAnagram(primeVal, x);
		// primeNumb(primeVal,x);
	}

	public void isPrimeAnagram(int[] a, int n) {
		int count = 0;
		int[] x = new int[100];
		System.out.println("Anagram present are:" + " ");
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int length1 = findLength(a[i]);
				int length2 = findLength(a[j]);
				if (length1 == length2) {
					int num1 = anagramSort(a[i]);
					int num2 = anagramSort(a[j]);
					if (num1 == num2) {
						x[count] = a[i];
						// System.out.println(x[count]+" "+a[j]);
						count++;
						break;
					}
				}
			}
		}
		// System.out.println();
		// System.out.println("no of anagram present are :" + " " + count);
		// primeAnagram(a, n, x, count);
		// quePrimeAna(x,count);
		stackPrimeAna(x);
	}

	private int anagramSort(int number) {
		int sorted = 0;
		int digits = 10;
		int count = 1;
		boolean condition = true;

		while (number > 0) {
			int digit = number % 10;

			if (!condition) {

				int tmp = sorted;
				int toDivide = 1;
				for (int i = 0; i < count; i++) {
					int tmpDigit = tmp % 10;
					if (digit >= tmpDigit) {
						sorted = sorted / toDivide * toDivide * 10 + digit * toDivide + sorted % toDivide;
						break;
					} else if (i == count - 1) {
						sorted = digit * digits + sorted;
					}
					tmp /= 10;
					toDivide *= 10;
				}
				digits *= 10;
				count += 1;
			} else {
				sorted = digit;
			}

			condition = false;
			number = number / 10;
		}
		return sorted;

	}

	private int findLength(int numb) {
		int length = 0;
		long temp = 1;
		while (temp <= numb) {
			length++;
			temp *= 10;
		}
		return length;

	}

	public void isPrimePalindrome(int[] arr) {
		System.out.println("Prime number that are palindrome : ");
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int a = arr[i], x = 0, y;
			while (arr[i] != 0) {
				y = arr[i] % 10;
				x = x * 10 + y;
				arr[i] = arr[i] / 10;
			}
			if (x == a) {
				System.out.println(a);
			}
		}

	}

	public void insertionSortString(String[] b) {
		for (int i = 1; i < b.length; i++) {
			String key = b[i];
			int j = i - 1;
			while (j >= 0) {
				if (key.compareTo(b[j]) < 0) {
					b[j + 1] = b[j];
					j = j - 1;
					break;
				}
				/*
				 * b[j + 1] = b[j]; j--; // Arrays.sort(b);
				 */ }
			b[j + 1] = key;

			for (int a = 0; a < b.length; a++) {
				System.out.print(b[a] + " ");
			}
			System.out.println();
		}

	}

	public void imagationNo(int n) {
		int upper = n;
		int lower = 0;
		int counter = 0;
		int middle = (upper + lower) / 2;

		System.out.println("the range of number is between " + lower + " and " + upper);
		System.out.println("the  imagined number may be " + middle);
		System.out.println("Enter as High or Low or Yes");
		String input = getstring();
		while (lower <= upper) {
			if (input.equals("high")) {
				lower = middle;
				counter++;
			} else if (input.equals("low")) {
				upper = middle;
				counter++;
			} else if (input.equals("yes")) {
				counter = counter + 1;
				System.out.println("the imagined number is " + middle);
				break;
			}
			if (counter < n) {
				middle = (lower + upper + 1) / 2;
				System.out.println("Is your number " + middle + ":");
				input = getstring();
			}

		}
	}

	public void vendingMachine(int amt, int[] arr, int n) {

		int[] cash = new int[n];
		for (int i = 0; i < n; i++) {
			cash[i] = amt / arr[i];
			amt = amt % arr[i];
		}
		System.out.println("number of 1000 rupee notes : " + cash[0]);
		System.out.println("number of 500 rupee notes : " + cash[1]);
		System.out.println("number of 100 rupee notes : " + cash[2]);
		System.out.println("number of 50 rupee notes : " + cash[3]);
		System.out.println("number of 20 rupee notes : " + cash[4]);
		System.out.println("number of 10 rupe notes : " + cash[5]);
		System.out.println("number of 5 rupee notes : " + cash[6]);
		System.out.println("number of 2 rupee notes : " + cash[7]);
		System.out.println("number of 1 rupee notes : " + cash[8]);
	}

	public int dayOfWeek(int d, int m, int y) {

		int y0, x, m0, d0;
		y0 = y - (14 - m) / 12;
		x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		m0 = m + 12 * ((14 - m) / 12) - 2;
		d0 = (d + x + 31 * m0 / 12) % 7;

		return d0;
	}

	public void tempConversion(int key) {
		int cel, fahrt;
		switch (key) {
		case 1:
			System.out.println("Enter the temp in celsuis");
			cel = getVal();
			System.out.println("Converting it into fahrenheit");
			fahrt = (cel * 9 / 5) + 32;
			System.out.println("temperature in fahrenheit : " + fahrt);
			break;
		case 2:
			System.out.println("Enter the temp in fahrenheit");
			fahrt = getVal();
			System.out.println("Converting it into celsuis");
			cel = (fahrt - 32) * 5 / 9;
			System.out.println("temperature in celsuis : " + cel);

		default:
			System.out.println("Invalid Input");
			break;
		}

	}

	public void monthlyPayments(double p, double y, double r) {
		double payment, n, R;

		n = 12 * y;
		R = r / (12 * 100);
		payment = (p * R) / (1 - Math.pow((1 + R), -n));

		System.out.println("The payment is " + payment);

	}

	public void sqRoot(double c) {
		double epsilon = 1e-15;
		double t = c;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		System.out.println(t);
	}

	public void toBinary(int dec) {
		int arr = dec, x = 0, count = 0;

		int[] arr1 = new int[10];

		while (dec > 0) {
			arr1[x++] = dec % 2;
			count++;
			dec = dec / 2;
			System.out.println(count);
		}
		System.out.println("Binary equivalent to" + " " + arr + " " + "is");
		for (int i = count - 1; i >= 0; i--) {
			System.out.print(arr1[i]);
			System.out.println();

			binaryPadding(arr1, count, arr);
		}

	}

	private void binaryPadding(int[] arr1, int count, int arr) {
		int num = 0, sum = 0;
		System.out.print("The result after padding is " + arr + " " + "=" + " ");
		for (int j = count - 1; j >= 0; j--) {
			if (arr1[j] == 1) {
				num = (int) Math.pow(2, j);
				sum = sum + num;
				System.out.print(num);
				System.out.print(" + ");
			}
		}

	}

	public int swapNibbles(int dec) {

		return ((dec & 0x0F) << 4 | (dec & 0xF0) >> 4);
	}

	public void insertionSort(int[] b4, int n4) {
		for (int i = 1; i < n4; i++) {
			int key = b4[i];
			int j = i - 1;
			while (j >= 0 && key < b4[j]) {
				b4[j + 1] = b4[j];
				j = j - 1;
			}
			b4[j + 1] = (char) key;
			// Arrays.sort(b);
		}
		for (int a = 0; a < n4; a++) {
			System.out.println(b4[a]);
		}

	}

	public void bubbleSortString(String[] list1) {
		int i, j;
		String temp;
		for (i = 0; i < list1.length; i++) {
			for (j = i + 1; j < list1.length; j++) {
				if (list1[j].compareTo(list1[i]) < 0) {
					temp = list1[j];
					list1[j] = list1[i];
					list1[i] = temp;
				}
			}
			// System.out.println(Arrays.toString(list1));
		}

		System.out.println(Arrays.toString(list1));
	}

	public int binarySearchInt(int[] b1, int first, int last, int search) {
		int middle = ((last - first) + first) / 2;
		if (b1[middle] > search) {
			return binarySearchInt(b1, first, middle - 1, search);
		} else if (b1[middle] < search) {
			return binarySearchInt(b1, middle + 1, last, search);
		} else if (b1[middle] == search) {
			return middle + 1;
		}
		return -1;
	}

	public int binarySearchString(String[] list, int i, int lst, String search1) {

		int mid = ((lst - i) + i) / 2;
		if (list[mid].compareTo(search1) > 0) {
			System.out.println("hii");
			return binarySearchString(list, i, mid - 1, search1);

		} else if (list[mid].compareTo(search1) < 0) {
			return binarySearchString(list, mid + 1, lst, search1);
		} else if (list[mid] == search1) {
			return mid + 1;
		}

		return -1;
	}

	public void unOderedCollectn() {
		try {
			File f = new File("documents.txt");
			if (!f.exists()) {
				System.out.println("File does not exist");
			}
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			String data = "";
			String str = "";
			while ((str = br.readLine()) != null) {
				data = data + str;
			}

			System.out.println("data = " + data);

			String[] word = data.split(" ");
			LinkedList li = new LinkedList();
			for (int a = 0; a < word.length; a++) {
				li.add(word[a]);
			}
			Iterator<String> it = li.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("Enter the word for search");
			String search = getstring();

			if (li.contains(search)) {
				System.out.println();
				System.out.println("WORD FOUND");
				System.out.println("WORD REMOVED SUCCESSFULLY");
				li.remove(search);
				System.out.println();

			} else {
				System.out.println();
				System.out.println("WORD NOT FOUND");
				li.add(search);
				System.out.println("WORD ADDED SUCCESSFULLY");
				System.out.println();
			}
			System.out.println("File after manipulation ");
			it = li.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}

		} catch (IOException e) {
			// e.printStackTrace();

			System.out.println("Error present" + e);
		}

	}

	public void oderedCollectn() {
		try {
			File f = new File("odereddoc.txt");

			if (!f.exists()) {
				System.out.println("The file " + "'" + "odereddoc.txt" + "'" + " doesnot exist");
			}
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			int num[] = new int[1000];
			int i = 0;
			String str = "";
			while ((str = br.readLine()) != null) {
				num[i] = Integer.parseInt(str);
				// System.out.println(num[i]);
				i++;
			}
			int size = i;
			LinkedList li = new LinkedList();
			for (int j = 0; j <= size; j++) {
				li.add(num[j]);
			}

			Collections.sort(li);

			Iterator it = li.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("Enter the element to search");
			int search = getVal();

			if (li.contains(search)) {
				System.out.println();
				System.out.println("NUMBER FOUND");
				System.out.println("NUMBER REMOVED SUCCESSFULLY");
				li.remove(search);
				System.out.println();
			} else {
				System.out.println();
				System.out.println("NUMBER NOT FOUND");
				li.add(search);
				System.out.println("NUMBER ADDED SUCCESSFULLY");
				System.out.println();
			}
			System.out.println("Data after manipulation");

			it = li.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		} catch (NumberFormatException e) {

			e.printStackTrace();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}

	public void balancedParentheses(String exp, int size) {
		Stack st = new Stack(size);
		int len = exp.length();
		for (int i = 0; i < len; i++) {

			char ch = exp.charAt(i);
			if (ch == '(') {
				st.push(i);
			} else if (ch == ')') {
				try {
					long p = (long) (st.pop() + 1);
					System.out.println("')' at index " + (i + 1) + " matched with '(' at index " + p);
				} catch (Exception e) {
					System.out.println("')' at index " + (i + 1) + " is unmatched");
				}
			}
		}
		while (!st.isEmpty()) {
			System.out.println("'(' at index " + (st.pop() + 1) + " is unmatched");
		}

	}

	public void calendar(int month, int year) {

		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (month == 2 && leap(year))
			days[month] = 29;

		System.out.println("     " + months[month] + " " + year);
		System.out.println(" S  M  Tu  W  Th  F  S");

		int d = dayOfWeek(1, month, year);

		for (int i = 0; i < d; i++)
			System.out.print("   ");
		for (int i = 1; i <= days[month]; i++) {
			System.out.printf("%2d ", i);
			if (((i + d) % 7 == 0) || (i == days[month]))
				System.out.println();
		}

	}

	public void primeNumb(int[] primeVal, int x) {
		int[] arr = { 001, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
		int r = 10, c = 27, k, b;
		System.out.println();
		System.out.println("                            PRIME NUMBERS 1-1000");

		int[][] a1 = new int[100][1000];
		for (int i = 0; i < arr.length - 1; i++) {
			k = -1;
			int m = arr[i], m1 = arr[i + 1];
			for (int j = 0; j < primeVal.length; j++) {
				if (primeVal[j] > m && primeVal[j] < m1) {
					k++;
					a1[i][k] = primeVal[j];
				}
			}
		}

		for (int i1 = 0; i1 < arr.length; i1++) {
			int p = arr[i1], p1 = arr[i1 + 1];
			System.out.print(p + "-" + p1 + " ");
			for (int j1 = 0; j1 < 25; j1++) {
				if (a1[i1][j1] != 0)
					System.out.print(a1[i1][j1] + " ");

			}
			System.out.println();
		}

	}

	private void primeAnagram(int[] primeVal, int n, int[] anaPrime, int count) {
		int j = 0;
		int[][] arr = new int[150][150];
		int r = 0, r1 = 0;
		for (int i = 0; i < n; i++) {
			if (anaPrime[j] != primeVal[i]) {
				arr[r][0] = primeVal[i];
				r++;

			} else {
				arr[r1][1] = primeVal[i];
				j++;
				r1++;
			}
		}
		for (int i = 0; i < 100; i++) {
			for (int j1 = 0; j1 < 2; j1++) {
				if (arr[i][j1] != 0)
					System.out.print(arr[i][j1] + " ");
			}
			System.out.println();
		}
	}

	public void UtilityBanking(Queue q, int balance, int person) {

		int count = 0;
		while (count < person) {
			boolean flag;
			System.out.println("Bank Counter");
			do {
				System.out.println();

				System.out.println("1.Deposit");
				System.out.println("2.Withdraw");
				System.out.println("3.check Current Balance is ");
				System.out.println("4.Number of person in queue");
				System.out.println("5.Dequeue");
				System.out.println("6.Enqueue");
				System.out.println("Enter your choice");
				int choice = getVal();
				switch (choice) {

				case 1:
					System.out.println("Enter the amt to deposit");
					int amt = getVal();
					balance = balance + amt;
					System.out.println("Balance is " + balance);
					break;

				case 2:
					System.out.println("Enter the amt to withdraw");
					int withdrawal = getVal();
					if (withdrawal < balance) {
						balance = balance - withdrawal;
						System.out.println("Balance is " + balance);
					} else {
						System.out.println("Insufficient balance");
					}
					break;

				case 3:
					System.out.println("Current balance is " + balance);
					break;

				case 4:
					int number = q.sizeOfQue();
					System.out.println("Number of person in Queue" + " " + number);
					break;

				case 5:
					q.deQue();
					number = q.sizeOfQue();
					System.out.println("Number of person in Queue" + " " + number);
					break;

				case 6:
					q.enQue();
					number = q.sizeOfQue();
					System.out.println("Number of person in Queue" + " " + number);
					break;

				default:
					System.out.println("Invalid choice");
					break;

				}
				System.out.println("Do you want to continue the transaction");
				System.out.println("Press true or false");
				flag = sc.nextBoolean();
			} while (flag);
			q.deQue();
		}
	}

	private void quePrimeAna(int[] x) {
		QuePrimeAna qp = new QuePrimeAna();
		for (int i = 0; i < x.length; i++) {
			if (x[i] != 0) {
				qp.enQue(x[i]);
			}
		}
		for (int i = 0; i < x.length; i++) {
			// qp.deQue();
			System.out.println(qp.deQue().data);

		}
	}

	private void stackPrimeAna(int[] x) {
		StackPrimeAna st = new StackPrimeAna();
		for (int i = 0; i < x.length; i++) {
			if (x[i] != 0) {
				st.push(x[i]);
			}
		}
		System.out.println("Anagram present in the Stack are : ");
		for (int i = 0; i < x.length; i++) {
			int temp = st.pop();
			if (temp != 0) {
				System.out.println(temp);

			}

		}

	}

	public String getDateVal(Date date) {
		Date date1 = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = formatter.format(date);
		System.out.println(strDate);
		return strDate;
	}

	public String textFile(String string) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
				br=new BufferedReader(new FileReader(string));
			StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			while(line!=null){
				sb.append(line);
				sb.append(System.lineSeparator());
				line=br.readLine();
			}
			return sb.toString();
		 }
		catch(Exception e){
			return null;
		}
		finally{
			try{
				br.close();
			}
			catch(IOException ioe){
			}	
		}
	}

	public String stringChange(UserDetails ud, String str) {
		
		Pattern p=Pattern.compile(RegexString_Name);
		Matcher m=p.matcher(str);
		str=m.replaceAll(ud.getName());
		
		p=Pattern.compile(RegexString_fName);
		m=p.matcher(str);
		str=m.replaceAll(ud.getName()+" "+ud.getlName());
		
		p=Pattern.compile(RegexString_phoneno);
		m=p.matcher(str);
		String st=Long.toString(ud.getPhoneNo());
		str=m.replaceAll(st);
		
		p=Pattern.compile(RegexString_date);
		m=p.matcher(str);
		str=m.replaceAll(ud.getDate());
		
		return str;
	}

	
	/*public ArrayList<Stock> getStockDetails(String fileName){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Stock> stockList=new ArrayList<Stock>();
		try{
			br=new BufferedReader(new FileReader(fileName));
			StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			SortingFunction sortingFunction=new SortingFunction();
			while(line!=null){
				String words[]=sortingFunction.wordsArrayFromStatement(line);
				try{
					stockList.add(new Stock(words[0],Integer.parseInt(words[1]),Integer.parseInt(words[2])));
				}
				catch(NumberFormatException nfe){
				}
				catch(ArrayIndexOutOfBoundsException ae){
				}
				line=br.readLine();
			}
			return stockList;
		 }
		catch(Exception e){
			return null;
		}
		finally{
			try{
				br.close();
			}
			catch(IOException ioe){
			}	
		}
	}
*/
}