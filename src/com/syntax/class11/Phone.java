package com.syntax.class11;

public class Phone {
	
	String brand;
	String model;
	String color;
	String memory;
	String screenSize;
	
	void unlock() {
		System.out.println(model+" face ID scan");
	}
	void call() {
		System.out.println(model+" make a call");
	}
	
	public static void main(String[]args) {
		
		Phone iPhone=new Phone();
		iPhone.brand="Apple";
		iPhone.model="iPhone13";
		iPhone.color="gray";
		iPhone.memory="128gb";
		iPhone.screenSize=" 6in ";
		iPhone.unlock();
		iPhone.call();
		
		Phone pixel=new Phone();
		pixel.brand="Google";
		pixel.model="P6";
		pixel.color="gray";
		pixel.memory="256gb";
		pixel.screenSize=" 5.6in ";
		pixel.unlock();
		pixel.call();		
		
		
		Phone Samsung=new Phone();
		Samsung.brand="Samsung";
		Samsung.model="flipp";
		Samsung.color="gray";
		Samsung.memory="512gb";
		Samsung.screenSize=" 6.8in ";
		Samsung.unlock();
		Samsung.call();		
		
		
	}

}
