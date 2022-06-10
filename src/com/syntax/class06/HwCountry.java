package com.syntax.class06;

import java.util.Scanner;

public class HwCountry {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please entre your grade");
		char grade = scan.next().charAt(0);
		String explanation = "";

		switch (grade) {
		case 'A':
			explanation = "Excellent";
			break;
		case 'B':
			explanation = "Good";
			break;
		case 'C':
			explanation="Average";
			break;
		case 'D':
			explanation="BAD";
			break;
			default:
				System.out.println("Not acceptebale");

		}
		
		System.out.println("You entred grade "+grade+" an its "+explanation);
	
		scan.close();
		
	
	}
}
