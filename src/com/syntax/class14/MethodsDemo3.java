package com.syntax.class14;

public class MethodsDemo3 {
	
	
	
	boolean isEven(int number) {
		if(number%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean checkString(String str) {
		if(str.length()%2==0) {
			return true;
		}else {
			return false;
		}
	}
		
	
		

	public static void main(String[] args) {
		 
		 MethodsDemo3 md=new  MethodsDemo3();
		 System.out.println(md.isEven(2));
		 System.out.println(md.checkString("azeedine"));
		 
		 
		
		
		
		
	}

}
