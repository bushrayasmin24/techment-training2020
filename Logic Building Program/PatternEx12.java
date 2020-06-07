package com.techment.training.day5;

public class PatternEx12 {

	public static void main(String[] args) {
		int num=5;
		
		for(int i=1;i<=num;i++)   //iteration for row
	{
			for(int j=1;j<=num-i;j++)  //iteration for space
				System.out.print(" ");
			
			for(int j=num-i+1;j<=num;j++)
				System.out.print(j);
			
			for(int j=num-1;j>=num-i+1;j--)
				System.out.print(j);
			
		System.out.println(); //for new line
		}
	}
}


