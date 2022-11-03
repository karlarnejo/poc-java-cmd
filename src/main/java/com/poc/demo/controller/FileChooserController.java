package com.poc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.poc.demo.common.ApiResultRest;
import com.poc.demo.models.FileUploadInputModel;
import com.poc.demo.service.FileUpload;

@RestController
@RequestMapping("/upload")
@CrossOrigin(origins="http://localhost:3000", maxAge=3600)
public class FileChooserController {

	@Autowired
	private FileUpload fileUpload;
	
	@RequestMapping(value = "/run", method = RequestMethod.POST)
	public ApiResultRest upload(@RequestBody FileUploadInputModel fileUploadInputModel) {
		return ApiResultRest.createResponse(fileUpload.getAbsolutePaths(fileUploadInputModel), "CUSTOM_SUCCESS_STATUS", "Message to be added later");
	}
}
