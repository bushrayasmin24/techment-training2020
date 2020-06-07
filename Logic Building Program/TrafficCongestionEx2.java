package com.techment.training.day1;
import java.util.Scanner;

class Ex2{
	
	int carNumber,todayDay;
	Scanner scannerObject = new Scanner(System.in); //creating Scanner class object
	
	public void input()
	{
		System.out.println("Enter the day value");
		todayDay = scannerObject.nextInt();  //taking day from user
		if(todayDay<=31 && todayDay>=1)
			check();
		else
			System.out.println("Invalid Input");
	}
	
	public void check()
	{   
	     if(todayDay%2==0)
	    	 System.out.println("Cars with Even registration numbers are permitted today");
	     else
	    	 System.out.println("Cars with Odd registration numbers are permitted today");

	}
}

public class TrafficCongestionEx2 {
	public static void main(String[] args) {
		Ex2 object2 = new Ex2();  //creating object
		object2.input();             //calling input() method
	}

}
