package com.syntax.class06;

public class SwitchLimitations {

	public static void main(String[] args) {

		/*
		 * switch can work with byte, short, int, char, Strin switch has datatype
		 * limitations
		 * 
		 * switch cannot work with double, float, long, boolean
		 */
		double price = 10;
		/*
		 * switch(price){->CE : cannot switch on value of type double.} }
		 */
		
		boolean hungry=true;	
		/*switch (hungry) {->CE:cannot switch on value of type boolean.
	}
	*/
		
		
		/*
		 * switch has a operators limitations
		 * cannot use rational  operators 
		 */
		
		char choice='Y';
		String meaning;
		
		/*switch(choice) {
		case'Y'||'y':------------->CE: cannot use || 
			meaning="Yes";
			break;
		}
		*/
		int day=5;
		/*
		 * switch(day){
		 case >5:
		 */
		
		
		
		
		
		
		
		
		
	}
}
