package com.syntax.class03;

public class IfNoBraces {

	public static void main(String[] args) {
		/*
		 * without braces java can identify only 
		 * 1 statement per block 
		 */
		
		String time="morning";
		
		if(time.equals("Morning"))
			System.out.println("Say Good Morning");
		else 
			System.out.println("Say Good Day");
		System.out.println("Or say good evening");
		
System.out.println("End of the code ");
				
	}

}
