package com.techment.training.day1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Ex2{
	
	int carNumber;
	
	Scanner myObj = new Scanner(System.in); //creating Scanner class object
	
	public void input()
	{
		System.out.println("Enter the car number");
		
			carNumber = myObj.nextInt();  //taking car number from user
		
	}
	
	public void check()
	{
		Date dNow = new Date( ); 
		 SimpleDateFormat ft = new SimpleDateFormat ("dd");
	     int todayDay = Integer.parseInt(ft.format(dNow)); 
	     
	     int carLastDigit = (carNumber%10);
	     
	     
	     if(carLastDigit%2==0)
	    	 System.out.println("Cars with Even registration numbers are permitted today");
	     else
	    	 System.out.println("Cars with Odd registration numbers are permitted today");

	}
}



public class TrafficCongestionEx2 {

	public static void main(String[] args) {
		Ex2 object2 = new Ex2();  //creating object
		object2.input();             //calling input() method
		object2.check();      //calling check() method

	}

}
