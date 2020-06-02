package com.techment.training.test1;

public class Pattern {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i==5 ||j==1 || j==5) //printing *
					System.out.print("*");
				else if((i>1 && i<5) || (j>1 && j<5))  //condition for space
						System.out.print(" ");
			}
			System.out.println();
		}

	}

}
