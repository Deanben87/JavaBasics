package com.syntax.class13;

public class Recap3 {

	public static void main(String[] args) {
		
		//from a String get the part which start from the symbol # and end at the symbol #
		String str="I am Confused";
		System.out.println(str.substring(5));//will execute the whole thong from the index we input
		System.out.println(str.substring(2));		
		System.out.println(str.substring(2,4));//index 4 is ignore 
		System.out.println(str.substring(0,1));//index 1 is exclude , everything is in 1 is excluded 
		
		str="Asghar is Great";
		System.out.println(str.substring(0,6));
		
		
		

	}

}
