package com.poc.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.poc.demo.common.ApiResultRest;
import com.poc.demo.models.CommandInput;
import com.poc.demo.service.CommandService;

@RestController
@RequestMapping("/commandline")
@CrossOrigin(origins="http://localhost:3000", maxAge=3600)
public class CommandLineController {
	
	@Autowired
	CommandService commandService;

	@RequestMapping(value = "/run", method = RequestMethod.POST)
	public ApiResultRest saveCustomer(@RequestBody CommandInput commandInput) throws IOException {
		return ApiResultRest.createResponse(commandService.runCommand(commandInput), "CUSTOM_SUCCESS_STATUS", "Message to be added later");
	}
}
