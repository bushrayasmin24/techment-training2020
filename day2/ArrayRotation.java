package com.techment.training.day2;

import java.util.Scanner;

public class ArrayRotation {

	 public static void arrayRotation(int arr[], int rotate){  
		 
		 for(int i = 0; i < rotate; i++){  
	            int j, first;  
	            first = arr[0];   //Stores the first element of the array  
	          
	            for(j = 0; j < arr.length-1; j++){   
	                arr[j] = arr[j+1];     //Shift element of array by one 
	            }  
	             
	            arr[j] = first;   //First element at the end 
		 }
	 }
		 	 
		 	 
		 public static void main(String args[]){  
			 
			int size,rotation;
		 	Scanner scannerObject = new Scanner(System.in);    //creating scanner object
		 	
		 	System.out.println("enter size of array");    
	 		size=scannerObject.nextInt();
		 	int list[] = new int[size];              //creating dynamic array
		 	
		 	System.out.println("Enter array");
		 	for(int i=0;i<size;i++)
		 		list[i]=scannerObject.nextInt();     //store array element
		 	
		 	System.out.println("Rotation Value");
		       	rotation=scannerObject.nextInt();
		           
		        arrayRotation(list,rotation); 
		        
		   System.out.println("After rotation");    //display array after rotation
		 	for(int i=0;i<size;i++)
		 		System.out.print(list[i] +" ");
		 }  

}
