package com.syntax.class14;

public class Methodsdemo4 {

	
	int sumNumbers(int num1, int num2) {
		return num1+num2;
	
	}
	
	void printManyTimes(String str,int times) {
		for(int i=0; i<times; i++) {
			System.out.println(str);
		}
	}
	
	
	public static void main(String[] args) {
		
		Methodsdemo4 md=new Methodsdemo4();
		System.out.println(md.sumNumbers(10, 10));
		md.printManyTimes("java", 3);
		

		
		
}	
	}


