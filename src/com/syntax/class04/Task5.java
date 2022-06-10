package com.syntax.class04;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double mortgageRate=3.2;
		int    mortgagePrice=37260;
		
		if(mortgageRate>4.5) {
			System.out.println("User will not buy");
		}else if (mortgageRate<4.5) {
			System.out.println("User will buy");
		}
		if (mortgagePrice>50000) {
			System.out.println("User will take loan");
		}else if (mortgagePrice<50000) {
			System.out.println("User will pay cash");
		}
	}

}
