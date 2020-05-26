package com.techment.training.day1;

import java.util.Scanner;

class Ex3 {
	
	Scanner myObj = new Scanner(System.in); //creating Scanner class object
	
	int horseWeight[];
	
	public void input()
	{
		System.out.println("Enter the horse weight");
		for(int i=0;i<3;i++)
		{
			horseWeight[i] = myObj.nextInt();  
		}
	}
	
	public void checkWeight()
	{
		for(int i=0; i<3;i++)
		{
			if(horseWeight[i]==horseWeight[i+1])
			{
				System.out.println("Entered weights are not distinct values");
				break;
			}
		}
		
		if(horseWeight[0]>horseWeight[1]) {
			if(horseWeight[0]>horseWeight[2])
				System.out.println("Best Horse is"+horseWeight[0]);
		
			else
				
				if(horseWeight[1]>horseWeight[2])
					System.out.println("Best Horse is"+horseWeight[1]);

			else
				System.out.println("Best Horse is"+horseWeight[2]);
		}

	}
}



public class BestHorseEx3 {

	public static void main(String[] args) {
		Ex3 object3 = new Ex3();  //creating object
		object3.input();             //calling input() method
		object3.checkWeight();      //calling checkWeight() method

	}

}
