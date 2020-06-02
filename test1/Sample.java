package com.techment.training.test1;

public class Sample {

	public static void main(String[] args) {
		int a=7;
		int b=a++ - ++a - a++ + ++a -a--; //first value of b

		System.out.println("First value of b "+b);
		b=--a + a-- + ++a + a-- -++a ;
		System.out.println("Second value of b "+b); //second value of b
	}

}
