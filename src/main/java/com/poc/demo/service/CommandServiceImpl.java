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
	public CommandOutputModel runCommand(CommandInputModel commandInputModel) {
		// TODO Auto-generated method stub
		
		CommandOutputModel commandOutputModel = new CommandOutputModel();

		String tmpOutput = "";
		try {
			
			Process process = Runtime.getRuntime().exec(commandInputModel.getCommand());
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		    String line = "";
		    while ((line = reader.readLine()) != null) {
		        tmpOutput = tmpOutput + line;
		    }
		    
		    tmpOutput = commandInputModel.getCommand() + "\n" + tmpOutput;
		    
		    commandOutputModel.setOutput(tmpOutput);
	    	
			return commandOutputModel;
		} catch(Exception e) {
			
			commandOutputModel.setOutput(commandInputModel.getCommand() + "\n" + "There is an Error in your command. Please check your command.");
			
			return commandOutputModel;
		}
	}
}
