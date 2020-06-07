package com.techment.training.day5;

public class PatternEx37 {

	public static void main(String[] args) {
		int num=5;
		for(int i=1;i<=num;i++) {  //first triangle
			for(int j=num-i;j>=1;j--)  //space
				System.out.print(" ");
				
			int j;
			for(j=i;j>=1;j--)
				System.out.print(j);
			
			for(int k=2;k<=i;k++)
				System.out.print(k);
			
			System.out.println();
		}
		for(int i=1;i<=num;i++) {  //second triangle
			for(int j=1;j<=i;j++)  //space
				System.out.print(" ");
				
			int j;
			for(j=num-i;j>=1;j--)
				System.out.print(j);
			
			for(int k=2;k<=num-i;k++)
				System.out.print(k);
			
			System.out.println();
		}
		
	}

}
