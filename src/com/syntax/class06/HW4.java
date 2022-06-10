package com.syntax.class06;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("There is any Sales today?");
		String a = scan.next();
		
		

	   if (a.equals("yes")) {

			System.out.println("Wich item you want to buy?");
			double price = scan.nextDouble();
			double discount = 0  ;
			double priceWithDiscount = 0  ;
			double total;
			
		if (price<=20) {
			discount=10;
			
		}
		else if (price>=20 && price<100) {
			discount=20;
			
		}else if (price>=100 && price<=500) {
			discount=30;
		
		}else if(price>500) {
			discount=50;
			
		}
		
		priceWithDiscount =price-((discount/100)*price);
	
		System.out.println("after the discount "+discount+"the price of the product reduce from"+price+" to "+priceWithDiscount);
	}
	   else {
			System.out.println("You are not going for shopping");
		}
	}
}