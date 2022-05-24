package com.kyle.abstractionPractice;

abstract class Programmer {
	//Abstract method does not have a body
	public abstract void myName();
	public abstract void myAge();
	public abstract void favoriteLanguage();
	
	
	
	//regular method 
	public void sleep() {
		System.out.println("How often do I sleep? What is sleep...");
		
	}
	public void sound() {
		System.out.println("I listen to Greta Van Fleet.");
	}
}


class JavaProgrammer extends Programmer {
	public void myName() {
		System.out.println("My name is Kyle.");
	}
	
	public void myAge() {
		int year = 2022;
		int birthYear = 1999;
		int age = year-birthYear;
		
		System.out.println("I am roughly "+ age + " years old.");
	}
	
	public void favoriteLanguage() {
		System.out.println("My favorite language is Java.");
	}
	

	
	
}




public class Practice {

	public static void main(String[] args) {
		JavaProgrammer kyle = new JavaProgrammer();
		kyle.myName();
		kyle.sleep();
		kyle.myAge();
		kyle.favoriteLanguage();
		kyle.sound();
		

	}

}
