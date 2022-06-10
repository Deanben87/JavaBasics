package com.syntax.class04;

import java.util.Scanner;

public class HwScanner {

	public static void main(String[] args) {
		//Task1 complete
		/*
		 * Scanner entre=new Scanner(System.in);
		 * 
		 * System.out.println("Please entre your first name"); String
		 * firstName=entre.next(); System.out.println("Please entre your Last name");
		 * String LastName=entre.next(); System.out.println("Please entre your state ");
		 * String State=entre.next(); System.out.println("My first name is "+firstName+
		 * " my last name is "+LastName+" i live in "+State);
		 * 
		 * System.out.println("----------------------------");
		 */
		
		//Task2
		
		Scanner key=new Scanner(System.in);
		System.out.println("Entre the first value");
		
		int a=key.nextInt();
		System.out.println("Entre the second value");
		int b=key.nextInt();
		
		if(a>b) {
			System.out.println(a+" Is larger than "+b);
		}else if (b>a) {
			System.out.println(b+ " Is larger than "+a);
		}else {
			System.out.println("a is equal to b ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
