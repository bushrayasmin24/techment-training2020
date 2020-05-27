package com.techment.training.day2;

import java.util.Scanner;

public class LinearSearch{    
	
public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    //comparing each element with key
                return i;    
            }    
        }    
        return -1;       //if element is not found then return -1   
    }    

    public static void main(String a[]){   
    	int key;
    	Scanner scanner = new Scanner(System.in);
    	int list[] = new int[10];
     	System.out.println("Enter unsorted array");

    	for(int i=0;i<=9;i++)
    		list[i]=scanner.nextInt();     //storing array element
    	System.out.println("Searching key");
          	key=scanner.nextInt();         //storing key value
        System.out.println(key+" is found at index: "+linearSearch(list, key));    
    }    
}    