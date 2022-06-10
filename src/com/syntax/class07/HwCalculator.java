package com.syntax.class07;

import java.util.Scanner;

public class HwCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please entre the numbers");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		System.out.println("Please entre the operators + , - , * , / ");
		char opp = scan.next().charAt(0);
		double result = 0;
String Operator=null;
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
			result = x * y;
			break;
		default:
			System.out.println("Invalid Operator");
			Operator="Invalid";

		}
		if(result !=0 || Operator==null) {
		System.out.println(result);
		}
      scan.close();
	}

}
