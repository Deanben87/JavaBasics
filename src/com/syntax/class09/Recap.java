package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {

			System.out.println("Hello");// 5

			for (int y = 1; y <= 3; y++) {
				System.out.println("Bye");// 0

			}
		}

		System.out.println("------------------");

		for (int i = 1; i <= 5; i++) {
			System.out.println("hello");
			for (int y = 1; y <= 3; y--) {
				System.out.println("bye");
			}

		}
		System.out.println("-------------------------------");

		for (int i = 1; i <= 5; i++) {

			System.out.println("hello");
			
			
			for (int y = 1; y <= 3; y--) {

				System.out.println("bye");
				
				continue;
				
				//System.out.print("Bye");
			}
		}
	}

}
