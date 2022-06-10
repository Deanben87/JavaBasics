package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		/*
		 * declare a secret number; 
		 * you want to ask user to guess your secret number
		 * your code should keep asking to guess until user gets your secret number
		 * once user gets the secret number-->you got it!
		 */

	Scanner scan=new Scanner(System.in);
	
	int x=20;	
	 
	 System.out.println("please enter the secret number");
	 x=scan.nextInt();	 
	 
	 while(x!=20) {
		 System.out.println("please enter the secret number");
		 x=scan.nextInt();
	 }System.out.println("You got it");
	
	 

	
		
		
	}

}
