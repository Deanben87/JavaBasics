package com.syntax.class06;

import java.util.Scanner;

public class RecapHw {

	public static void main(String[] args) {
		
		
		boolean checkboxSelected=false;
		
		if (!checkboxSelected) {
			System.out.println("Click in checkbox");
		}
		System.out.println("---------------------------");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Entre number of years");
		int years = scan.nextInt();
		
		if(years>=5) {
			System.out.println("You are eligible for the bonus");
			System.out.println("Entre your annual salary");
			int salary = scan.nextInt();
			
			if (salary>5000) {
				System.out.println("You are eligible for 5000 bonus");			
			}else {
				System.out.println("You are eligible for 3000 bonus");
			}}else {
				{
				System.out.println("Sorry you are not eligible for a bonuse ");
			}
			}
		
		System.out.println("--------------------------------");
		
		System.out.println("Current time");
		int time=scan.nextInt();
		
		if(time>=1 && time<=11) {
			System.out.println("Morning");
		}else if(time>=16 && time<=20) {
			System.out.println("Evening");
		}else if (time>=21 && time<=24){
			System.out.println("Night");
		}else {
			System.out.println("Invalid time entrerd ");
		}
		
		System.out.println("--------------------------------------");
		
		System.out.println("what month were you born in");
	    String month=scan.nextLine();
		
		if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			System.out.println("You were born in Spring");}
		else if (month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")) {
			System.out.println("You were born in Summer");}
		else if (month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")) {
			System.out.println("You were born in Autumn");}
		else if (month.equalsIgnoreCase("December")||month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")) {
			System.out.println("You were born in Winter");}
		
		
		
		
		
		
		
		
		
	}

}
