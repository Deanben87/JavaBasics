package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {
		/*
		 * we are going to ask you if you got a job
		 * we will continuously asking if you get a job until you say yes !
		 * 
		 * once you say yes--->Congratulations!
		 */

		Scanner scan=new Scanner(System.in);
		String job;
		do {
		System.out.println("Did you get a job?");
		job=scan.next();
		
		}while(!job.equalsIgnoreCase("yes"));
		System.out.println("Congratulations");
		
		
		System.out.println("-----------------------");
		
		
		
		
		
		
		
		
		
	}

}