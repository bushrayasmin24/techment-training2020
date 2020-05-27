package com.techment.training.day2;

import java.util.Scanner;

class insertionSort {   
	
    public static void sortInsertion(int [] arr){

      for(int i=0;i<arr.length;++i){

        int j = i;
        
        while(j > 0 && arr[j-1]>arr[j]){

          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
          j = j-1; 

        }
      }
    }

    public static void main( String args[] ) {
       
    	int size;
     	Scanner scannerObject = new Scanner(System.in); //creating scanner object
     	
     	System.out.println("enter size of array");
 		size=scannerObject.nextInt();

      	int array[] = new int[size];
      	
      	System.out.println("Enter unsorted array");
      	for(int i=0;i<size;i++)
      		array[i]=scannerObject.nextInt();   //unsorted array
    	
        sortInsertion(array);

        for(int i=0;i<size;++i){
          System.out.print(array[i] + " ");
        }
    }
}