package com.techment.training.day5;

import java.util.Scanner;

public class MultiplicationTableEx31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n:");
		int n=scanner.nextInt(); //user i/p
		
		for(int i=1;i<=10;i++) {
			System.out.println(n +" * " +i +" = " +(i*n)); //printing table
		}

	}

}
