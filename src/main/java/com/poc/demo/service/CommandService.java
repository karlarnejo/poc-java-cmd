package com.poc.demo.service;

import com.poc.demo.models.CommandInputModel;
import com.poc.demo.models.CommandOutputModel;

public interface CommandService {

	public CommandOutputModel runCommand(CommandInputModel commandInputModel);
}
