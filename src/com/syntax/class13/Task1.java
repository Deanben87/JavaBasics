package com.syntax.class13;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String.
		 */
			
		String str=new String("Hello");
		String str2="Hello";//this is preferred
		
		if(!str2.isEmpty()) {
			//str2.length()%2!=0 String has an odd number of character
			//str2.length()>=3 has 3 or more character 
			if(str2.length()%2!=0 && str2.length()>=3){
				int middle=str2.length()/2;
				System.out.println(str2.charAt(middle));//we get the letter L 
				
				
				
			}
		}
		
		
		
	}

}
