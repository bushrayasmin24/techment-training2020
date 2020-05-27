package com.techment.training.day2;

import java.util.Scanner;

public class QuickSort
{
 
    public static void quickSort( int arr[], int low, int high) 
    {
        //check for empty array
        if (arr == null || arr.length == 0){
            return;
        }
         
        if (low >= high){
            return;
        }
 
        //Get the pivot element as a middle of the list
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
 
        int i = low, j = high;
        while (i <= j) 
        {
            
            while (arr[i] < pivot) 
            {
                i++;
            }
            
            while (arr[j] > pivot) 
            {
                j--;
            }
            //Now compare values 
            if (i <= j) 
            {
                swap (arr, i, j);
                i++;
                j--;
            }
        }
       
        if (low < j){
            quickSort(arr, low, j);
        }
        if (high > i){
            quickSort(arr, i, high);
        }
    }
     
    public static void swap (int array[], int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
    
    public static void main(String[] args) 
    {
       int size;
    	Scanner scannerObject = new Scanner(System.in); //creating scanner object
    	
    	System.out.println("enter size of array");
		size=scannerObject.nextInt();

     	int array[] = new int[size];
     	
     	System.out.println("Enter unsorted array");
     	for(int i=0;i<size;i++)
     		array[i]=scannerObject.nextInt();   //unsorted array
    	
 
        // calling quick sort
        quickSort( array, 0, size - 1 );
 
        for(int i=0;i<size;i++)
        	System.out.print(" "+array[i]);
    }
}