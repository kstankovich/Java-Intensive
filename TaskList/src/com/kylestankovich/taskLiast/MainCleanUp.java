package com.kylestankovich.taskLiast;

import java.util.ArrayList;
import java.util.Scanner;



public class MainCleanUp {
	static Scanner userInput;
	static ArrayList<TaskProperties> tasks;
	
	public static void displayMenu() {
		System.out.println("--Task Master--");
		System.out.println("");
		System.out.println("1. Add to the list");
		System.out.println("2. Remove from the list");
		System.out.println("3. Complete that item");
		System.out.println("4. List the list");
		System.out.println("5. Clear the menu");
		System.out.println("0. Exit Task Master");
		System.out.println("");
		System.out.print("Your choice: ");
	}
	
	//changed after class
		public static int readUserInt() {
			int result = userInput.nextInt();
			//added after class
			userInput.nextLine();
			return result;
		}
		
		//added after class
		//add task
		public static void addTask(String name) {
			tasks.add(new TaskProperties(name));
		}
		
		//remove task
		public static void removeTask(int id) {
			tasks.remove(id - 1);
		}
		
		//complete task
		public static void completeTask(int id) {
			tasks.get(id - 1).setComplete(true);
		}
		
		
		//list tasks
		public static void listTasks() {
			System.out.println("--toDo list--");
			for(int i = 0; i < tasks.size(); i++) {
				System.out.println(i+1 + ". " + tasks.get(i).toString());
			}
			//added after class
			System.out.println("==============================\n");
			
		}
	
	
}
	
	


