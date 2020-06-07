package com.techment.training.day5;

import java.util.Scanner;

public class LeapYearEx4 {

	public static void main(String[] args) {
		
		int year,checkYear,count=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year ");
		year = scanner.nextInt();
		checkYear=year;
		do {
			checkYear/=10;      //checking for valid year
			count++;
		}while(checkYear!=0);
		
		if(count == 2 || count == 4)
			if(year%2==0)                 //checking for leap year
				System.out.println("Leap Year.");
			else
				System.out.println("Not Leap Year.");
		else	
		System.out.println("Invalid Year");
		
		
		
	}

}
