package com.techment.training.day5;

import java.util.Scanner;

public class BattleEx7 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int first=scanner.nextInt();
		System.out.println("Enter last number:");
		int last=scanner.nextInt();

		for(int i=first;i<=last;i++)
		{
		System.out.println(i);
		}

	}

}
