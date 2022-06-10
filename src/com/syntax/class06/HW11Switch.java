package com.syntax.class06;

import java.util.Scanner;

public class HW11Switch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please entre the numbers");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		System.out.println("Please entre the operators + , - , * , / ");
		char opp = scan.next().charAt(0);
		double result = 0;

		switch (opp) {
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		case '/':
			result = x / y;
			break;
		case '*':
			result=x*y;
			break;
		default:
			System.out.println("Invalid Operator");
			
		}
	System.out.println(result);	

	}

}
