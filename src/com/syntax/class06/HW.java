package com.syntax.class06;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("what month were you born in");
	    String month=scan.nextLine();
		
		if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May"))
			System.out.println("You were born in Spring");
		else if (month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August"))
			System.out.println("You were born in Summer");
		else if (month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November"))
			System.out.println("You were born in Autumn");
		else if (month.equalsIgnoreCase("December")||month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February"))
			System.out.println("You were born in Winter");

	}

}
