package com.kylestankovich.taskLiast;

public class TaskProperties extends MainCleanUp{
	
	private String name;
	private boolean isComplete;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	public TaskProperties() {
		
	}
	
	public TaskProperties(String name) {
		this.name = name;
		//this.isComplete = isComplete;
	}
	// the question mark acts as an if statement
	@Override
	public String toString() {
		return this.name + (this.isComplete? "(COMPLETE) ": "");
		
	}
	
	
	

}
