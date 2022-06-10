package com.syntax.class08;

public class Task {

	public static void main(String[] args) {

		for (int x = 1; x <= 100; x++) {
			System.out.print(x + " ");
		}
		System.out.println();

		for (int x = 100; x >= 1; x--) {
			System.out.print(x + " ");
		}
		System.out.println();

		for (int x = 20; x >= 1; x -= 2) {

			System.out.print(x + " ");
		}
		System.out.println();
		for(int a=20; a>=1; a--) {
			if(a%2==0) {
				System.out.print(a+" ");
			}
				
		}
		System.out.println();
		
		for( int i=21; i<=50; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=20; i<50; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}

}
