package com.syntax.class05;

public class HW {

	public static void main(String[] args) {
		//Blood Donor
		
		int age=23;
		int weight= 100;
		if(age>=18) {
			System.out.println("You are "+age+" years old and");
			System.out.println("You are eligible to be a donor");
		}else {
			System.out.println("You are"+age+" years old and");
		}
		//watch again the video recording 
		
		
		int num1=15;
		int num2=44;
		int num3=23;
		
		if(num1>=num2) {
			if(num1>=num3) {
				System.out.println(num1+" is the largest number");
			}else {
				System.out.println(num3+" is the largest number");
			}
			
		}else {//otherwise num2>num1
			if(num2>=num3) {
				System.out.println(num2+" is the largest");
			}else {//num3>num2
				System.out.println(num3+" is the largest");
				
				
			}
		}
		
		
	}
	

}
