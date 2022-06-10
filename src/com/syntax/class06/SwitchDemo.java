package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {

		char choice = 'o';
		String meaning;
		
		//variable and matching case MUST BE of the same type
		//switch does not allow to have duplicated cases 
		switch (choice) {
		case 'Y':
			meaning = "Yes";
			break;
		case 'M':
			meaning = "Maybe";
			break;
		case 'N':
			meaning = "No";
			break;
		default:
			meaning = "Unknown";

		}
		System.out.println(meaning);
	}

}
