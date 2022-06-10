package com.syntax.class10;

public class AllElementsFrom2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] usa = { { "New York", "Albany", "Buffalo" },

				{ "Los Angeles", "San Fransisco", "San Jose", "San Diego", "Redding" },

				{ "Miami", "Orlando", "Niceville", "Tampa" },

				{ "McLean", "Richmond", "Lessburg" }

		};
		
		System.out.println("Retrieve all values using for each loop");
		
		for(String[] state:usa) {
			
			for(String city:state) {
				System.out.println(city+" ");
			}
		}
		
		
		//outer loop iterates over rows
		//inner loops iterates over columns
		
		for(int row=0; row<usa.length; row++) {
			
			for(int col=0; col<usa[row].length; col++) {
				System.out.print(usa[row][col]+" ");
			}
			System.out.println();
		}
		

	}

}
