package com.techment.training.day2;

public class Pattern1 {

	public static void main(String[] args) {

		int i,j;
		
		
		for(i=1; i<=3; i++) // outer loop for rows
        { 
            
            for(j=1; j<=i; j++) // inner loop for column
            { 
                // printing pattern 
                System.out.print(j); 
               
            } 
            System.out.println(); 
        } 
	}

}
