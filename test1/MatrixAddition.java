package com.techment.training.test1;

import java.util.Scanner;

public class MatrixAddition {
	
	public static void matrixAddition(int arr[][][],int m, int n){
		for(int i=0;i<m;i++)  {
			for(int j=0;j<n;j++)
				arr[i][j][2]=arr[i][j][0]+arr[i][j][1];   //matrix addition
		}
	}

	public static void main(String[] args) {
		
		int m,n;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first matrix size [m][n]");
		m=scanner.nextInt();
		n=scanner.nextInt();
		
		int array[][][] = new int[m][n][3];
		
		System.out.println("Enter first matrix["+m+"]["+n+"]" +"in row major order");
		for(int i=0;i<m;i++) {  //store first matrix in array
			for(int j=0;j<n;j++)
				array[i][j][0]=scanner.nextInt();
		}
		
		System.out.println("Enter second matrix["+m+"]["+n+"]" +"in row major order");
		for(int i=0;i<m;i++) {   //store first matrix in array
			for(int j=0;j<n;j++)
				array[i][j][1]=scanner.nextInt();
		}
		
		matrixAddition(array,m,n);
		
		System.out.println("Addition of matrix["+m+"]["+n+"]" +"is :");
		for(int i=0;i<m;i++)  {    //print addition of matrix
			for(int j=0;j<n;j++)
				System.out.print(array[i][j][2] +" ");
			System.out.println();
		}
	}
}
