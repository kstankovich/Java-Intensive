package com.postManExchange;

public class greetingModel {
	private final long id;
	private final String content;
	
	public greetingModel(long id, String content) {
		this.id = id;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	
	

}
