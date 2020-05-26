package com.techment.training.day1;

import java.util.Scanner;

class Ex1{
	
	int input1,input2;
	Scanner myObj = new Scanner(System.in); //creating Scanner class object
	
	
	public void input()
	{
		System.out.println("Enter the two number");
		
			input1 = myObj.nextInt();  //taking first number from user
			input2 = myObj.nextInt();  //taking second number from user
				
	}
	
	public void check()
	{
		int sum = input1+input2;
		
		do {
			
		int LastDigit= (sum%10);
		int FirstDigit = (sum/10);
		int houseNumber=FirstDigit+LastDigit;
		
		
		if(houseNumber<=18 && houseNumber>=1) {
			System.out.println("the glass house number"+houseNumber);
			break;
		}
	}while(true);
	}
}
public class GlassHouseEx1 {

	public static void main(String[] args) {
		Ex1 object1 = new Ex1();  //creating object
		object1.input();             //calling input() method
		object1.check();      //calling check() method
	}

}
