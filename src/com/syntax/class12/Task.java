package com.syntax.class12;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userName="admin";
		String password="pass123";
		String confirmationPassword="pass123";
		
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("User name and password cannot be empty");
			
		}else if(password.length()<8 ) {
		System.out.println("Password is too short");
			
		}else if (password.contains(userName)) {
		System.out.println("Password cannot contain username");
		
		}else if(!password.equals(confirmationPassword)) {
			
			System.out.println("Password do not match");
		
			
		}else {
			System.out.println("Your username and password has been created");
		}
	
		
	}

}
