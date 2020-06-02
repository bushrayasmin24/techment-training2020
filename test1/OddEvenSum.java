package com.techment.training.test1;

import java.util.Scanner;

public class OddEvenSum {

	public static void main(String[] args) {
		int n,sumOdd=0,sumEven=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("No. of elelment");
		n=scanner.nextInt();    //no. of element in the array
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++)
			arr[i]=scanner.nextInt();  //store the array element value
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
				sumEven+=arr[i];   //sum even element
			else
				sumOdd+=arr[i];    //sum odd element
		}
		System.out.println("even =" +sumEven);
		System.out.println("odd =" +sumOdd);

	}

}
