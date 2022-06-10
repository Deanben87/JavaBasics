package com.syntax.class09;

public class hw4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double[] price=new double[4];
		
		price[0]=1.99;
		price[1]=2.89;
		price[2]=3.23;
		price[3]=4.89;
		
		for(int x=0; x<price.length ; x++ ) {
			
			System.out.println(price[x]);
			
		}
		System.out.println("-----------------");
		
		double [] numbers= {1.99,2.99,3.99,4.99};
		
		for(double num:numbers) {
			
			System.out.println(num);
			
		}
		
		
		
	}

}
