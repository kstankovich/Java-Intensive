package com.kyleStankovich.handson4;

public class HandsOn {

	public static void main(String[] args) {
		
		int value= 2;
		int doubleTimesCount= 3;
		
		System.out.println("Value: "+ value);
		
		System.out.println("Value Doubled: "+ doubleMe(value)); 
		
		System.out.println("Value Quadrupled: " + quadrupleMe(value));
		
		System.out.println(" ");
		
		System.out.println("Original Value was: "+ value);
		
		System.out.println("How many times will we double the vaule: "+ doubleTimesCount);
		
		System.out.println("Result after doubling value that amount of times: "+ doubleMeTimes(doubleTimesCount, value)); 
		
		
		
		
	}
	
	public static int doubleMe(int val) {
		return val*2; 
	}
	
	public static int quadrupleMe(int val) {
		return doubleMe(doubleMe(val));
	}
	
	public static int doubleMeTimes(int count, int val) {
		int total = val;
		for(int i= 0; i<count; i++) {
			total = doubleMe(total);
		}
		
		return total;
		
	}
	
	

	
	
}
