package com.techment.training.day5;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramEx50 {
	
	public static void anagram(String s1, String s2) {

		String s1Upper,s2Upper;
		
		s1Upper=s1.toUpperCase();    //convert string to upper case
		s2Upper=s2.toUpperCase();
		
		char[] charArray1 = s1Upper.toCharArray();  //converting character array
		char[] charArray2 = s2Upper.toCharArray();		
		
		Arrays.sort(charArray1);            //sorting character array
		Arrays.sort(charArray2);

		if(Arrays.equals(charArray1,charArray2))  //comparing arrays
			System.out.println("Anagram");
		else
			System.out.println("Not anagram");
	}

	public static void main(String[] args) {
		
		String s1,s2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Sting"); //taking i/p
		s1=scanner.next();
		System.out.println("Enter Second Sting");
		s2=scanner.next();
		
		anagram(s1,s2);   //calling method
	}

}
