package com.techment.training.day5;

import java.util.Scanner;

public class SumOfSeriesEx46 {
	
   public static int fact(int x){ //calculating factorial
	   
	   if(x==0 || x==1)
		   return 1;
	   else
		   return (x*fact(x-1));
    }

	public static void main(String[] args) {
		double sum = 0;
        int n;

        System.out.println("1/1! + 2/2! + 3/3! + ..N/N!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no. of terms in series:");
        n = scanner.nextInt();   //taking i/p from user

	    for(int i = 1; i <= n; i++){ //nth term
	    	sum = sum + (double)i / fact(i);
	        }

	       	System.out.println("Sum of series:"+sum);//printing sum
	    }
}
