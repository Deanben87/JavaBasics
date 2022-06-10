package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
	
		/*let`s ask user where is he from
		 * based on the country we will define favorite food
		 */

		Scanner scan=new Scanner(System.in);
		String country, favoriteFood;
		
		System.out.println("Please tell me where are you from");
		country=scan.nextLine();
		
		switch(country) {
		case "Mexico":
			favoriteFood="Tacos";
			break;
		case "Canada":
			favoriteFood="poutine";
			break;
		case "Turkey":
			favoriteFood="lahmacun";
			break;
		case "Pakistan":
			favoriteFood="pati chai";
			break;
		case "egypt":
			favoriteFood="koshary";
			break;
		case"USA":
			favoriteFood="burgers";
			break;
			default:
				favoriteFood="unknown";
						
		}
		
		System.out.println("You are from "+country+" and your favorites food is "+favoriteFood);
	}

}
