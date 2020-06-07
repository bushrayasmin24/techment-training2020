package com.techment.training.day5;
import java.util.Scanner;

public class DivideBy3And8Ex16 {

	public static void main(String[] args) {
		int price;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter price");
		price=scanner.nextInt();   // i/p from user
		
		if(price%3==0 && price%8==0)   //checking divisible or not
			System.out.println("Price is divisible by both 3 and 8");
		else
			System.out.println("Price is not divisible by both 3 and 8");		
	}

}
