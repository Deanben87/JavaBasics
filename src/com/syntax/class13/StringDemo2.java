package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="skafdb18247t8725kSDKDFd!@#$((%^^";
		
		System.out.println(str.replaceAll("[0-9]", "#"));// replace all will replace all the number with # symbols 
		System.out.println(str.replaceAll("[a-z]", "#"));//replace all lower case letter to #
		System.out.println(str.replaceAll("[A-Z]", "#"));//replace all upper case letter to #
		System.out.println(str.replaceAll("[A-Za-z]", "#"));//replace both upper and lower case letter to #
		System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));//replace all of the above to # 
		System.out.println(str.replaceAll("[^a-z]", "_"));
		
		System.out.println(str.replaceAll("[^A-Z]", "*"));
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "*"));
		
		str="abcdefghijkl";
		System.out.println(str.replaceAll("[a-f]", "*"));
		str="skafdb18247t8725kSDKDFd!@#$((%^^";
		System.out.println(str.replaceAll("[^A-z]", ""));//remove specials characters 
		
		
		
	}

}
