package com.techment.training.day5;

public class Pattern35 {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) { //first upper pattern
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		for(int i=1;i<=n-1;i++) {  //half lower pattern
			for(int j=1;j<=n-i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
