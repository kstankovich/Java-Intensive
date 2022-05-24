package com.kylestankovich.taskLiast;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class MainArea  extends MainCleanUp{
	//static Scanner userInput;
	//static ArrayList<TaskProperties> tasks;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//task manager
		tasks = new ArrayList<TaskProperties>();
		userInput = new Scanner(System.in);
		
		
	
		boolean running = true;
		
		
		do {
			displayMenu();
			int menuChoice = readUserInt();
			//String userTaskName = readUserString();
			
			switch(menuChoice) {
				case 1:
					System.out.print("What do you want to add: ");
					//add task method
					String taskName = userInput.nextLine();
					addTask(taskName);
					break;
				case 2:
					if (tasks.size() != 0 ) {
					System.out.print("Task to be removed: ");
					listTasks();
					int removeId = readUserInt();
					removeTask(removeId);
					}
					//remove method
					break;
				case 3:
					if (tasks.size() != 0 ) {
					System.out.print("Item to complete: ");
					listTasks();
					int completeId = readUserInt();
					completeTask(completeId);
					}
					break;
				case 4:
					//list method
					if (tasks.size() != 0) {
						listTasks();
						break;
						
					}else {
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("ALERT: Please add a task");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
						
					break;}
					
					
				case 5:
					tasks = new ArrayList<TaskProperties>();
					
					break;
					
					
				case 0:
					//added after class
					listTasks();
					System.out.println("Your final list is above. Thank you for creating a list with us!");
					running = false;
					break;
				default:
					System.out.println("UNKNOWN");
			}
		}
		
		
		
		
		while(running);
		
		//write to a file
		try {
			FileWriter writer = new FileWriter("List.txt");
			writer.write(tasks.toString());
			writer.flush();
			writer.close();
					
					
			}catch(Exception e) {
				System.out.println(e);
			}
		
		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("List.txt"));
			String line;
			while((line = reader.readLine()) !=null) {
				System.out.println(line);
			}
			reader.close();
			
			 
			
		}catch(Exception e) {
			System.out.println(e);
		}

		
		
		
		
		
		
	}


	
	
	
	
}

