package com.syntax.class05;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please entre your heights in inches ");
		int a=scan.nextInt();
		
		if (a<60) {
			System.out.println("Your height is short");
		}else if (a>=60 && a<=72) {
			System.out.println("Your height is medium ");
		}else if (a>72) {
			System.out.println("Your height is over 72 inch ");
		}
		
		
		
		
		
		
		
	}

}
