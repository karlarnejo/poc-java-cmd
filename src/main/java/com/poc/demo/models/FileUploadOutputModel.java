package com.poc.demo.models;

public class FileUploadOutputModel {
	
	private String absolutePaths;
	
	public FileUploadOutputModel() {
		
	}
	
	public FileUploadOutputModel(String absolutePaths) {
		this.absolutePaths = absolutePaths;
	}

	public String getAbsolutePaths() {
		return absolutePaths;
	}

	public void setAbsolutePaths(String absolutePaths) {
		this.absolutePaths = absolutePaths;
	}
}
