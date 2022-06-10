package com.syntax.class06;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
	
		 Scanner scan = new Scanner(System.in);
		    System.out.println("Please entre a number");
		    int x = scan.nextInt();
		    int a=x%2;
		    int b=x%3;
		    if(a==x%2){
		      System.out.println(x+" Value is even");
		      if(x>1000){
		        System.out.println(x+" Even value is large");}{
		        if(b==x%3){
		          System.out.println(x+"is number is odd");
		          if(x>1000){
		            System.out.println(x+" odd value is large");
		          }else{
		            System.out.println(x+"odd value is just right");
		          }
		        }
		      }
		    }
		    

	
	
	

	      }

  
		  
}