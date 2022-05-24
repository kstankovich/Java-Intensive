package com.kylestankovich.handson2;

public class HandsOn {

	public static void main(String[] args) {
		int age = 45;
		boolean isStudent=true;
		
		if (age >= 65) {
			System.out.println("Seniors pay $7 for a ticket.");}
		
		if (age <= 12) {
			System.out.println("Childrens tickets are $8.");
		}
		if (age < 65 && age > 12) {
			System.out.println("Your ticket costs $10.");
		}
		if (isStudent == true) {
			System.out.println("Students pay $8.");
			
		}
		if (age<0) {
			System.out.println("invalid age");
		}
		
		
		
		
		

	}

}
