package com.poc.demo.models;

import java.util.List;

public class FileUploadInputModel {
	
	private List<String> files;
	
	public FileUploadInputModel() {
		
	}

	public FileUploadInputModel(List<String> files) {
		this.files = files;
	}

	public List<String> getFiles() {
		return files;
	}

	public void setFiles(List<String> files) {
		this.files = files;
	}
	
	
}
