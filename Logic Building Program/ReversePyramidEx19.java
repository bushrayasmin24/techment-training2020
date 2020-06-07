package com.techment.training.day5;

public class ReversePyramidEx19 {

	public static void main(String[] args) {
		int num=6;
		for(int i=1; i<=num;i++){
			for(int j=1; j<=i-1;j++) {  //space loop
				System.out.print(" ");
			}
			for(int j=1; j<=num-i+1;j++) { //first half pyramid 
					System.out.print(j);
			}
			for(int j=num-i; j>=1;j--) {  //second half pyramid
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
