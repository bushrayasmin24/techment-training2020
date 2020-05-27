package com.techment.training.day2;
import java.util.*;

public class Sample {

	public static void main(String[] args) {
		int size,minMarks, maxMarks, flagFail=0,totalMarks=0,countPass=0,countFail=0;
		
		 Scanner myObj = new Scanner(System.in);
		System.out.println("Enter size of array");
		size=myObj.nextInt();
		int subjects[] = new int[size];
		
		for(int i=0;i<size;i++) {
			subjects[i]=myObj.nextInt();
			totalMarks+=subjects[i];
		}
		
		System.out.println("Total Marks "+totalMarks);

		minMarks =  maxMarks = subjects[0];
		for(int i=1;i<size;i++) {
			if(subjects[i]< minMarks)
				minMarks=subjects[i];
			if(subjects[i]>maxMarks)
				maxMarks=subjects[i];
		}
		System.out.println("Minimum Marks "+minMarks);
		System.out.println("Maximum Marks "+maxMarks);
		for(int i=0;i<size;i++)
		{
			if(subjects[i] < 50) {
				flagFail=1;
				System.out.println("Fail Marks "+subjects[i]);
			}
			else
				System.out.println("Pass Marks "+subjects[i]);
		}
		if(flagFail==1)
			System.out.println("You are Fail");
		else
			System.out.println("You are Pass");
		
		System.out.println("No. of pass "+countPass);
		System.out.println("No. of fail "+countFail);

		

	}

}
