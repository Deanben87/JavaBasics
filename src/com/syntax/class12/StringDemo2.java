package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName="Dean";
		String lastName=" ben";
		String fullName=firstName+lastName;//always always prefer this 
		String fullName2 = firstName.concat(lastName);// never use this because it can lead you to null pointer exception
		System.out.println(fullName2);
		System.out.println(fullName);
		
		
		String name="";
		System.out.println(name.isEmpty());
		
	
		
	String captainamerica=" ne ver ";
	System.out.println(captainamerica.trim());
	
		
		
		
		
	}

}