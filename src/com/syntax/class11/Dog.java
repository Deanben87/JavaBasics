package com.syntax.class11;

import java.util.Scanner;

public class Dog {

	// attributes how the object will look
	String name;
	int age;
	double weight;//properties attributes ,fields 
	String color;
	double height;
	String breed;

	// how that object behave
	void bark() {
		System.out.println("Dog barks");
	}

	void walks() {
		System.out.println("Dog walks");
	}

	void eat() {
		System.out.println("Dogs eat bones");
	}

	public static void main(String[] args) {
		// new Dog() how we create an object
		Scanner scan=new Scanner(System.in);//crtl+click on windows cmd
		//scan.next();
		
		Dog jimmy = new Dog();// creating an object and storing in a variable
		jimmy.name = "Jimmy";
		jimmy.age = 6;
		jimmy.weight = 16;
		jimmy.color = "Pink";
		jimmy.height = 2.6;
		jimmy.breed = "German";
		jimmy.bark();

	}
}
