package com.syntax.class02;

public class homeWork {

	public static void main(String[] args) {
	 
		// whole numbers
		/*
		 * box1 - is variable
		 * to create a variable we need 2 things: datatype & name
		 */
		byte box1=127; 
		   short box2=32767;
		   int box3=76666;//mostly will be used 
		   long box4=4562255554445555L;
		   
		   //decimal numbers 
		   float container=1.99F;
		   double container2=89.99;// for double we dont need D
		   
		   //to represent 1 character
		   
		   char gender='m';
		   char dollar='$';
		   
		   // to represent true or false (yes or no)
		   
		   
		  boolean hungry=true;
		  boolean sleepy=false;
		  
		  //how to acces values from variables?
		  
		  System.out.println(container2);//do not use ""to access variables
		  
		  //acces and print values from all variables 
		  
		  System.out.println(sleepy);//false
		  System.out.println("sleepy");//java will take it as word(sleppy) not box (false)
		 
		  System.out.println(hungry);
		  System.out.println(gender);
		  System.out.println(dollar);
		  System.out.println(container);
		  System.out.println(box1);//calling a variable box1
		  System.out.println(box2);
		  System.out.println(box3);
		  System.out.println(box4);
		  
		  //System.out.println(box5);this line will give error because of the order 
		  int box5=900;
		  System.out.println(box5);
		  
		  int year=2022;//i create a variable and store value 
		  System.out.println(year);//2022
		  
		  year=2023;//im reassigning the value of same box 
		  
		  System.out.println(year);//2023
		  
		  
	}

}
