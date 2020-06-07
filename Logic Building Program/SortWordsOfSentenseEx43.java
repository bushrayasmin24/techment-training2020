package com.techment.training.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortWordsOfSentenseEx43 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   
		System.out.println("Enter a sentense: ");
	    String str=br.readLine();
	    
	    String words[]=str.split(" ");
	    Arrays.sort(words);
	    
	    for(int i=0;i<words.length;i++){
	    	System.out.println(words[i]);
	    }
	    
	}
}
