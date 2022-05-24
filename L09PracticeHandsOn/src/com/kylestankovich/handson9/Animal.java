package com.kylestankovich.handson9;

public class Animal {
    // name of the animal
    private String name;
    private float length;
    private float height; 
    private float weight;
    private boolean isGrassFed;
    

    public Animal() {
        name = "";
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

	public float getLength() {
		return length;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public boolean isGrassFed() {
		return isGrassFed;
	}
	
	public Animal(AnimalBuilder builder) {
		this.name= builder.name;
		this.length = builder.length;
		this.weight = builder.weight;
		this.height = builder.height;
		this.isGrassFed = builder.isGrassFed;
		
	}
    
    public static class AnimalBuilder {
    	private String name;
        private float length;
        private float height; 
        private float weight;
        private boolean isGrassFed;
        
        public AnimalBuilder(String name, float length, float height, float weight) {
        	
        	this.name = name;
        	this.length = length;
        	this.weight = weight;
        	
        	
        	
        }
        public AnimalBuilder setisGrassFed(boolean isGrassFed) {
        	this.isGrassFed = isGrassFed;
        	return this;
        	
        }
        public Animal build() {
        	return new Animal(this);
        	
        }
    	
    	
    }
    
}