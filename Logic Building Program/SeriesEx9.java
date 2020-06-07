package com.techment.training.day5;

import java.util.Scanner;

public class SeriesEx9 {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the n");
		n = scanner.nextInt();    //taking the input from user
		
		for(int i=1;i<=n;i++)
		{
			System.out.print((int)(Math.pow(i, 3.0)) +", ");
		}
	}

}
