package com.techment.training.day2;

public class Pattern {

	public static void main(String[] args) {
		
		int num=3;
		for(int i=num;i>0;i--)    //number of rows outer loop
		{
			for(int j=1;j<=i;++j)   //inner loop for column
			{
				System.out.print(j+"");   //print pattern
			}
			System.out.println(); 
		}
		

	}

}
