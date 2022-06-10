package com.syntax.class08;

import java.util.Scanner;

public class Task3InstroctorVersion {

	public static void main(String[] args) {
		
	
		
		int ScrectNum=20;
		int guessedNum;
		
		Scanner scan = new Scanner (System.in);
		
		do {
		System.out.println("Guess my secret number");
		guessedNum=scan.nextInt();
		}while(guessedNum !=25);
		
		System.out.println("You got it");
		
	}

}
