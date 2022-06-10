package com.syntax.class09;

public class AllValuesFromArray {

	public static void main(String[] args) {
		
		
		
		char[] grade= {'A','B','C','D'};
		
		/*
		 * System.out.println([0]);
		 * System.out.println(grade[1]);
		 * System.out.println(grade[2]);
		 */
		for( int i=0; i<grade.length; i++) {
			System.out.print(grade[i]+" ");
			
		}
		System.out.println();

		String[] words= {"Java","Saturday","Day"};
		
		//I want to retrieve all elements
		
		for(int i=0; i<words.length; i++) {
			
			System.out.print(words[i]+" ");
		}
			System.out.println();
			
			//Enhanced for loop/advance for loop/ for each loop 
			/*
			 * can be used only when we work with ARRAY
			 * 			or
			 * 		collections
			 */
			
			String[] colors= {"pink","bleu","white","black"};
			
			for(String color:colors) {
				
				
				System.out.print(color+" ");
				
				
			}
			
		System.out.println();
		
		int[] numbers= {10,20,30,40};
		
		for(int num:numbers) {
			
			System.out.println(num); 
		}
		
		
			
			
	
			
			
			
			
		

	}

}
