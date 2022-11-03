package com.poc.demo.service;

import java.util.List;

import com.poc.demo.models.FileUploadInputModel;
import com.poc.demo.models.FileUploadOutputModel;

public interface FileUpload {

	public List<FileUploadOutputModel> getAbsolutePaths(FileUploadInputModel fileUploadInputModel);
}
