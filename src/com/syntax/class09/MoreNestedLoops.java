package com.syntax.class09;

public class MoreNestedLoops {

	public static void main(String[] args) {
		
		
		//how to create multiplication table
		
		for(int x=1; x<=10; x++) {
			
			for(int y=1; y<=10; y++) {
				
				System.out.println(x+" x "+y+" = "+(x*y));
				
			}
			System.out.println("-------------------------------------");
				
		}
		
		System.out.println(" -CLOCK -");
		
		
		for (int hrs = 0; hrs < 24; hrs++) {
			
			for (int min = 0; min < 60; min++) {
				
				String time;
				
				if(hrs<10 && min<10) {
					time="0"+hrs+":"+"0"+min;
				}else if(hrs<10 && min>10);{
					time="0"+hrs+":"+min;
				} if(hrs>10 && min<10) {//else if need to fix it 
					time=hrs+":"+"0"+min;
				}else {
					time=hrs+":"+min;
					
				}System.out.println(time);
				
			}
				}
		
		
		
		
		
		}

}
