package com.poc.demo.service;

import java.io.IOException;

import com.poc.demo.models.CommandInput;

public interface CommandService {

	public String runCommand(CommandInput commandInput) throws IOException;
}
