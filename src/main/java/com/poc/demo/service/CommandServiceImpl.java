package com.poc.demo.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poc.demo.models.CommandInput;
import com.poc.demo.models.CommandOutput;

@Service
@Transactional(rollbackFor = Exception.class)
public class CommandServiceImpl implements CommandService {

	@Override
	public String runCommand(CommandInput commandInput) throws IOException {
		// TODO Auto-generated method stub
		
		String tmpOutput = "";
		CommandOutput commandOutput = new CommandOutput();
		
		Process process = Runtime.getRuntime().exec(commandInput.getCommand());
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	    String line = "";
	    while ((line = reader.readLine()) != null) {
	        System.out.println(line);
	        tmpOutput = tmpOutput + line;
	    }
	    
    	commandOutput.setOutput(tmpOutput);

		return "Running " + commandOutput.getOutput();
	}
}
