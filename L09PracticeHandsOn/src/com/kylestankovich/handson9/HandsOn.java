package com.kylestankovich.handson9;

import java.util.ArrayList;
import java.util.List;

public class HandsOn {

	public static void main(String[] args) {
		
		List<Animal> animalList = new ArrayList<Animal>();
		AnimalFactory factory = new AnimalFactory();
		String animalType;
		int numCats= 0, numDogs= 0, numCows= 0;
		
		
		do {
			System.out.println("Enter animal to create or exit: ");
			//animalType read from user input
			animalType = StudentHelper.ReadInputString();
			//as long as animalType != exit continue along
			if(!animalType.equalsIgnoreCase("exit")) {
				//creating animal object from animalType and factory
				Animal animal = factory.getAnimal(animalType);
				//add animal object to animal List as long as animal is not null 
				if(animal != null) animalList.add(animal);
				
			}
			
			
			
		}
		while(!animalType.equalsIgnoreCase("exit"));
		
		//process number of animals created
		for(Animal animal: animalList) {
			if(animal instanceof Cat) {
				numCats++;
			}else if (animal instanceof Dog) {
				numDogs++;
			}else if(animal instanceof Cow) {
				numCows++;
			}
		}
		
		
		//display number of animals created
		System.out.println("Results: ");
		System.out.println("num cats: "+ numCats);
		System.out.println("num dogs: "+ numDogs);
		System.out.println("num cows: "+ numCows);
		
		
	}

}
