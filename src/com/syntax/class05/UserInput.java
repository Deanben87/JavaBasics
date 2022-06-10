package com.syntax.class05;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please entre name");
		String name=scan.next();//capture String// or we can use .nextLine(); to capture more than one name 
		System.out.println("name");
		
		System.out.println("Please entre age");
		int age=scan.nextInt();//capture int
		System.out.println("age");
		
		System.out.println("Please entre price");
		double  price=scan.nextDouble();//capture double
		System.out.println("price");
		
		System.out.println("Please entre boolean");
		boolean boo=scan.nextBoolean();//capture boolean
		System.out.println("boo");
		
		System.out.println("Please entre any character");
		char character=scan.next().charAt(0);//capture 1 character
		System.out.println("charater");
		

	}

}
