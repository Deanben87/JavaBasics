package com.syntax.class06;

import java.util.Scanner;

public class HW11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please entre the numbers" );
		double x=scan.nextDouble();
		double y=scan.nextDouble();
		System.out.println("Please entre the operators + , - , * , / " );
		char opp=scan.next().charAt(0);
		
		if(opp=='+') {
			System.out.println(x+y);			
		}
		else if(opp=='-') {
			System.out.println(x-y);	
		}
		else if(opp=='*') {
			System.out.println(x*y);			
		}
		else if(opp=='/') {
			if(y!=0) {
			System.out.println(x/y);			
		}else {
			System.out.println("Divide by 0 is imposible");
		}
		}


		
		
		
		
		
		
		
		
		
	
			
		
		
		
		
		
	}

}
