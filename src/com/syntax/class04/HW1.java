package com.syntax.class04;

public class HW1 {

	public static void main(String[] args) {
		
		int x=9;
		
		if(x%2==0) {
			System.out.println(x+" is an even  number ");
		}else {
			System.out.println(x+" is an odd number");
		}
	
	System.out.println("---------------------------");
	//Task 2
	
	int ageDonor=18;
	int weight=90;
	
	if(ageDonor>=18){
		System.out.println("your are eligible but we need to check your weight");
	}else {
		System.out.println("we cannot accept such patient");
	}if (weight>=100) {
		System.out.println("your are eligible ");
	}else {
		System.out.println("we cannot accept such patient ");
	}
	System.out.println("-------------------");
	
	int w=12;
	int y=36;
	int z=78;
	
	if(w>y & w>z) {
		System.out.println(w+" Is the largest number");
	if(y>w & y>z) {
		System.out.println(y+" Is the largest number");
	}
	}else if (z>y & z>w) {
		System.out.println(z+" Is the largest number");
	}
	
	
	
	
	
	
	}
	}

