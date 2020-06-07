package com.techment.training.day5;

import java.util.Scanner;

public class ValidatePINEx28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pin = 12345;

		System.out.print("Enter Your PIN: ");
		int entry = scanner.nextInt();
		        
		while ( entry != pin ) //checking for correct PIN
		{
			System.out.println("Incorrect PIN, Try again.");
			System.out.print("Enter Your PIN: ");
			entry = scanner.nextInt();
		}
		        
		System.out.println("PIN Accepted.");
	}

}
