package com.syntax.class06;

import java.util.Scanner;

public class Hw5 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		String country, language  ;
		
		System.out.println("Please entre your country");
		country=scan.next();
			
		switch(country) {
		case"Algeria":
			language="arab";
			break;
		case "Spain":
			language="spanish";
			break;
		case"Switzerland":
			language="French";
			break;
			default:
				language="Invalid";
		}
	
		System.out.println("I am form "+country+" and i speak "+ language);
		
	}
		
		
}
			

