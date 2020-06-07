package com.techment.training.day5;

import java.util.*;
class Child extends Thread{
	int stars;

	Child(int stars){
		super();
		this.stars=stars;
	}

	public void run(){
		for(int i=0;i<stars;i++){
			System.out.println("*");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}

public class MultiThreadingEx25 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of '$' is printed");
		int dollars=sc.nextInt();

		System.out.println("Enter no. of '*' is printed:");
		int stars=sc.nextInt();

		Child t=new Child(stars); //thread object
		t.start();
		for(int i=0;i<dollars;i++){
			System.out.println("$");
			try{
				Thread.sleep(500); //sleep
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}
