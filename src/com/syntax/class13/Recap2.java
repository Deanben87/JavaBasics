package com.syntax.class13;

public class Recap2 {

	public static void main(String[] args) {
		
		
		String str="Where is deean?";
		System.out.println(str.charAt(3));//to get the letter we want 
		//System.out.println(str.charAt(-2));negative index we will get an error out of bound 
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(6));
		
		System.out.println(str.indexOf("i"));//to get the index of the letter 
		System.out.println(str.indexOf("e"));
		
		System.out.println(str.indexOf("e",4));// 6 is(index) the starting point of the search 
		
		System.out.println("-------------------------- ");
		
		int counter=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='e') {
				counter++;
				if(counter==4) {
				System.out.print( i+" ");
			}
		}
		}

		
		
		
		
		
	}

}
