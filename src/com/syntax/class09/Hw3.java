package com.syntax.class09;

public class Hw3 {

	public static void main(String[] args) {
		
		String [] animals= {"fox","parot","bird","bear","dog"};
		
		for(int x=0; x<animals.length; x++) {
			
			System.out.println(animals[x]);
			
		}
		System.out.println("----------------------------");
		
		String [] animals1= {"fox","parot","bird","bear","dog"};
		
		for(String animal:animals1) {
			System.out.println(animal);
		}
		
		
	}

}
