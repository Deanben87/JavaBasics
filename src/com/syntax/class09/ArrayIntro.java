package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		
		//create an array
		
		int[] b=new int[4];
		
		//store value
		b[0]=90;
		b[1]=85;
		b[2]=70;
		b[3]=100;
		
		//access value from my array 
		
		System.out.println(b[2]);//70	
		System.out.println(b[1]+b[3]);//185
		
		
		//We need to create an array of my classmates names 
		//when we create an array we MUST specify the size(how many elements)	
		String[] classMates=new String[5];
		//how value are stored --->stored based on index
		
		classMates[0]="Dean";
		classMates[1]="Jack";
		classMates[2]="Amine";
		classMates[3]="Ben";
		classMates[4]="Zola";
		
		System.out.println("My classmate name is "+classMates[3]);
		
	}

}
