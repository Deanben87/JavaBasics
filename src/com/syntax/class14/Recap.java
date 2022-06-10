package com.syntax.class14;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I never forget about recording";								
		System.out.println(str.replace("never", "alaways").replace("I", "Dean"));//replace never with always and I to dean
		//this is method chaining 
		
		str="kanjkadf12222232ASADK!@#$";
		System.out.println(str.replaceAll("[0-9]", ""));//number will be removed 
		
		
		String str2="Batch 13 is Great. Bacth 13 is best. Batch 13 is execellent";
		String[] arr=str2.split(" ");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	
		str="WE #love# Java";
		String[] arr2=str.split("[#]");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
	}

}
