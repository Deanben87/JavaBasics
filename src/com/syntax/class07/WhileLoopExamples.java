package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		
		//print number from 1 to 10;
		int num=1;
		
		while(num<=10) {
			
			System.out.print(num+" ");
			num++;
			}
			
		//print number from 1 to 10;
		System.out.println();
			int num1=1;
			
			while(num1<=10) {
			num1++;
			System.out.print(num1+" ");
			
		}
			
			//print number from 100 to 50;
			System.out.println();
			int c=100;
			while(c>=50) {
				System.out.print(c+" ");
				c--;
			}
			//print number from -1 to -10
			System.out.println();
			int x=-1;
			while(x>=-10) {
				System.out.print(x+" ");
				x--;
				
			}
			//print number from 1 to 20 but only even numbers
			System.out.println();
			//1way
			int e=2;
			
			while(e<=20) {
			System.out.print(e+" ");
			e+=2;
			}
			//2way
			System.out.println();
			
			int f=1;
			
			while(f<=20) {
				
				if(f%2==0) {
				System.out.print(f+" ");
			
				}
				f++;
			
			}
			}
}
