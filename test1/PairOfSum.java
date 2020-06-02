package com.techment.training.test1;

public class PairOfSum {

	public static void main(String[] args) {
		int[] arr = {2,5,1,6,3,4};
		int sum=8;
		
		System.out.println("Pair :");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				if((arr[i]+arr[j]) == sum)   //comparing the each pair of array with sum
					//printing pairs
					System.out.println("(" +arr[i] +"," +arr[j] +")");
			}
		}
	}
}
