package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
	
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("what is today?entre the number");
		
		int day=scan.nextInt();
		
		if(day==1||day==2||day==3||day==4||day==5) {
			System.out.println("It is a weekday");
		}else if(day==6||day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("/invalid day");
		}
		
		
		

	}

}
