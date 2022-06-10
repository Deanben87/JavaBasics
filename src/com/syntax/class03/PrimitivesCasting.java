package com.syntax.class03;

public class PrimitivesCasting {

	//Ctrl+space ----->auto complete 
		
   public static void main(String[] args) {
	
	int i=100; 
	double d=100;//widening (small type to bigger type no problem for java)
	
	System.out.println(i);//100
	System.out.println(d);//100.0
	
	long l=10000;
	//byte b=130; error :cannot covert from int to byte
	
	//int x=99.99 error: type mismatch: cannot convert from double to int
	
	int x=(int)99.99;//narrowing 
	System.out.println(x);
	
	//type mismatch: cannot convert from int to byte 
	byte b=(byte)130876;
	System.out.println(b);

	//type mismatch: cannot convert from double to float 
	float f=10.99f;
	
	double dd=9.99;
	
	double price=100;
	
	}

}
