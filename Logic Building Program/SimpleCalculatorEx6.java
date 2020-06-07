package com.techment.training.day5;

import java.util.Scanner;

public class SimpleCalculatorEx6 {

	public static void main(String[] args) {
		int num1,num2;
		char op;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Operand");
		num1 = scanner.nextInt();
		System.out.println("Enter Second Operand");
		num2 = scanner.nextInt();
		System.out.println("Enter Operator");
		op = scanner.next().charAt(0);
		switch(op)
		{
		case '+': 
			System.out.println("Addition is : "+(num1+num2));
			break;
		case '-': 
			System.out.println("Substraction is : " +(num1-num2));
			break;
		case '*': 
			System.out.println("Multiplication is : "+(num1*num2));
			break;
		case '/': 
			System.out.println("Division is : "+(num1/num2));
			break;
		case '%': 
			System.out.println("Remainder is : "+(num1%num2));
			break;
		default:
			System.out.println("Invalid operator");
		}
	
	}

}
