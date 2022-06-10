package com.syntax.class03;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * when your code has no errors always try format it
		 * 
		 * mac cmd+shift+g windows crt+shit+f
		 */

		double x = 5.99;
		double y = 2.99;
		if (x > y) {
			System.out.println("Double value " + x + " is larger than" + y + "");
		}

		int temp = 67;
		if (temp < 32) {

			System.out.println("water will freeze with temperature " + temp);
			System.out.println("It is cold outside");
			System.out.println("Make sure to use jaket and scarf");

		} else {
			System.out.println("water will not freeze with temperatue " + temp);
			System.out.println("It is not that cold outside then");
		}
		System.out.println("I am code outside of if block ");
		

	}

}
