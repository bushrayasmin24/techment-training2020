package com.techment.training.day2;

import java.util.Scanner;

class BinarySearch{  
	
 public static void binarySearch(int arr[], int first, int last, int key){  
	 
   int mid = (first + last)/2;      //middle element of array
   
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
        System.out.println("Element is found at index: " + mid);  
        break;  //if element is found exit from loop
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }  
 }  
 
 public static void main(String args[]){  
	 int key,size;
 	Scanner scannerObject = new Scanner(System.in);
 	
 	System.out.println("enter size of array");
	size=scannerObject.nextInt();
 	int list[] = new int[size];
 	
 	System.out.println("Enter unsorted array");
 	for(int i=0;i<size;i++)
 		list[i]=scannerObject.nextInt();
 	
 	System.out.println("Searching key");
       	key=scannerObject.nextInt();
       	
        binarySearch(list,0,size-1,key);     
 }  
}