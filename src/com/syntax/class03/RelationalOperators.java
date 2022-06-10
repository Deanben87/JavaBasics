package com.syntax.class03;

public class RelationalOperators {
public static void main(String[] args) {
	
	//<,>,<=,>=,==,!=
	
	int num1=20;
	int num2=22;
	
	System.out.println(num1>num2);//false
	System.out.println(num1<num2);//true
	System.out.println(num1!=num2);//true (!= mean not equal)
	
	System.out.println(num1==num2);//no=false
	System.out.println(num1=num2);//22 replacing num2 in num1
	
	System.out.println(num1==num2);//true (because we reassign num2 to num 1) 
	
	boolean result=100>200;
	System.out.println(result);
	
	int result1=100+200;
	
	String  result2="Emre"+10;
	
	int num3=10;
	int num4=11;
	
	result=num3==num4;
	System.out.println(result);//false 
	
	//type mismatch: cannot convert from boolean to int 
	result=num3!=num4;//check if num3 not equal to num4 (!)=not 
	System.out.println(result);
	
	
}
}
