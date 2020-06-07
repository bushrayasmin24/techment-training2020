package com.techment.training.day5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class AgeCalculatorEx49 {
	
	public static int getAge(Calendar dob) {
		 Calendar today = Calendar.getInstance(); 
		 
	     int curYear = today.get(Calendar.YEAR); //current year
	     int dobYear = dob.get(Calendar.YEAR);    //dob year
	     int age = curYear - dobYear;  

	     int curMonth = today.get(Calendar.MONTH);  //current month
	     int dobMonth = dob.get(Calendar.MONTH);    //dob month
	     
	     if (dobMonth > curMonth) {   //the extra month not count 
	            age--; 
	            
	        } else if (dobMonth == curMonth) {   //check day for counting 
	        	
	            int curDay = today.get(Calendar.DAY_OF_MONTH); 
	            int dobDay = dob.get(Calendar.DAY_OF_MONTH); 
	            if (dobDay > curDay)  //not count bcoz year not complete
	                age--;  
	        } 
	        return age; 
	}

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the DOB of employee, in this format: YYYY-MM-DD");
		String input=scanner.nextLine();  //taking input
		
		 SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd"); 
	     Calendar dob = Calendar.getInstance();  //calendar instance

	      dob.setTime(sdf.parse(input)); 
	      System.out.println("Age is:" +getAge(dob)); 
		
	}

}
