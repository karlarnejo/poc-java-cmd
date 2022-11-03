package com.poc.demo.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poc.demo.models.CommandInputModel;
import com.poc.demo.models.CommandOutputModel;

@Service
@Transactional(rollbackFor = Exception.class)
public class CommandServiceImpl implements CommandService {

	@Override
	public String runCommand(CommandInputModel commandInputModel) {
		// TODO Auto-generated method stub
		
		String tmpOutput = "";
		try {
			CommandOutputModel commandOutputModel = new CommandOutputModel();
			
			Process process = Runtime.getRuntime().exec(commandInputModel.getCommand());
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		    String line = "";
		    while ((line = reader.readLine()) != null) {
		        tmpOutput = tmpOutput + line;
		    }
		    
		    commandOutputModel.setOutput(tmpOutput);
	    	
			return commandInputModel.getCommand() + "\n" + commandOutputModel.getOutput();
		} catch(Exception e) {
			return "There is an Error in your command. Please check your command.";
		}
	}
}
