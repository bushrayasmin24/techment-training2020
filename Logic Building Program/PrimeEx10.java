package com.techment.training.day5;
import java.util.Scanner;

public class PrimeEx10 {
	
	int num,flag,count,c,i=3;
	
	public static boolean isPrime(int n){
		
		 for(c = 2; c < i;  ++i,c++)
	        {
	            if(i%c == 0)
	                break;
	        }

	        if(c == i)  // c is prime
	        {
	            System.out.print(", " +i);
	            count++;    // increment the count of prime numbers
	        }
	        if(c == 0)
				return true;
			else
				return false;
	}

	public static void main(String[] args) {
		
		boolean flag;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the n");
		num = scanner.nextInt();    //taking the input from user

		if(num >= 1) {
	        System.out.println("2 ,");
	    }

	    // iteration for n prime numbers
	    // i is the number to be checked in each iteration starting from 3
	    for(int i = 2; i <= num;i++)  
	    {
	        // iteration to check c is prime or not
	    	flag = isPrime(num);
	    }

		
//		for(int i=1; i<)
//		System.out.println("No. of Prime Number " +count);

}

}
