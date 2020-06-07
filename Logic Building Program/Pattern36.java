package com.techment.training.day5;

public class Pattern36 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {   //first half line print
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j);
				
			}
			int count=0;   //counting the no. of space
			for(int j=n-i+1;j>=1;j--) {
				
				if(j==5) {  //skip printing space if j=5
					System.out.print(j);
					continue;
				}
				else if(count==0 && i!=1) {  //print 1 time space
					System.out.print(" ");
					count++;
				}
				System.out.print(j);  //second half line
			}
			System.out.println();
		}
	}

}
