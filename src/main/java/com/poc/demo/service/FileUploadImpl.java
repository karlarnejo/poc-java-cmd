package com.poc.demo.service;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poc.demo.models.FileUploadInputModel;
import com.poc.demo.models.FileUploadOutputModel;

@Service
@Transactional(rollbackFor = Exception.class)
public class FileUploadImpl implements FileUpload {

	/* ON HOLD DUE TO SOME CONSTRAINTS */
	@Override
	public List<FileUploadOutputModel> getAbsolutePaths(FileUploadInputModel fileUploadInputModel) {
		// TODO Auto-generated method stub
		List<FileUploadOutputModel> files = new ArrayList<FileUploadOutputModel>();
		
		FileUploadOutputModel tmpModel = new FileUploadOutputModel();
		
		tmpModel.setAbsolutePaths("sample");
		
		files.add(tmpModel);
		
//		Path p = Paths.get("279915158_1224658391611074_6189464163912329446_n");
//		Path folder = p.getParent();
				
		return files;
	}
}
