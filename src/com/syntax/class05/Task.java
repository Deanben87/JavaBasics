package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		//Task1
		
		Scanner scan=new Scanner (System.in);
		 System.out.println("please entre age");
			int age=scan.nextInt();
					if(age>=18) {
						System.out.println("We will issue a DL for you");
		}else {
			System.out.println("We Will offre you learning permit");
		}
		
	}

}
