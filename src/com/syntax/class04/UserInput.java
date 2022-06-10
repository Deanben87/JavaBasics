package com.syntax.class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		//creating a scanner
		Scanner input= new Scanner(System.in);
		
		//send instruction to the console
		System.out.println("Please entre your name");
		
		//we need to grab the value from console 
		String name=input.next();//after you type the value ->hit ent
		System.out.println(name);
		
		//lets send instruction
		System.out.println(name+" please entre your age");
		
		//need to capture and store age
		int age =input.nextInt();
		
		System.out.println(name+" is "+age+ "years old");
		
		
		
		
		
	}

}
