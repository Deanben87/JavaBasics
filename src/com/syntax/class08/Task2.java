package com.syntax.class08;

public class Task2 {

	public static void main(String[] args) {

		/*
		 * write a program to find sum of all even and all odd numbers from 1 to 70
		 */
		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 1; i <= 70; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			}

		}
		System.out.print(sumEven);

		System.out.println();

		for (int i = 1; i <= 70; i++) {
			if (i % 2 != 0) {
				sumOdd += i;

			}
		}
		System.out.print(sumOdd);

		System.out.println();
		
		
		int sumEven1 = 0;
		int sumOdd1 = 0;
		
		for (int i = 1; i <= 70; i++) {

			if (i % 2 == 0) {
			sumEven1+=i;
			}else {
			sumOdd1+=i;
			}
			}

			System.out.println("Sum even numbers is "+sumEven1);
			System.out.println("Sum odd numbers is "+sumOdd1);
		
		
		
	
		
	}
}
