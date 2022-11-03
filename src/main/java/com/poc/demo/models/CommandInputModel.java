package com.poc.demo.models;

public class CommandInputModel {

	private String command;
	
	public CommandInputModel() {
		
	}
	
	public CommandInputModel(String command) {
		this.command = command;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}
}
