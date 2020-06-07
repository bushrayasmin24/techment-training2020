package com.techment.training.day5;

import java.util.Scanner;

class Product{
	int pid;
	String name;
	float price;
	
	//public Product(){}
	
	public Product(int pid, String name, float price){
		this.pid=pid;
		this.name=name;
		this.price=price;
	}

	public int getPid() {
		return pid;
	}
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}

public class SortingObjectInArrayEx47 {
	public static void main(String[] args) {
		
		int pid;  //variables
		String name;
		float price;
		
		Product p[] =new Product[5];  //array object
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Enter the product details, pid, name and price");
		for(int i=0;i<p.length;i++) {
			
			pid=scanner.nextInt();
			name=scanner.next();
			price=scanner.nextFloat();
			
			 p[i]=new Product(pid,name,price);
		}
		
		for(int i=0;i<p.length;i++){  //bubble sort
			for(int j=i+1;j<p.length;j++){
				if(p[i].getName().compareTo(p[j].getName())<0){
					Product temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
		}
		
		System.out.println("After sorting, the product details is: \n pid name price");
		for(int i=0;i<5;i++) {
			
			pid=p[i].getPid();
			name=p[i].getName();
			price=p[i].getPrice();
			System.out.println(pid +name +price);
		}
	}
}
