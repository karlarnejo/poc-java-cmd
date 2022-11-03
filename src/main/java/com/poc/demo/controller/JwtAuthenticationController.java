package com.poc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.poc.demo.common.ApiResultAuth;
import com.poc.demo.common.UserDetailsModel;
import com.poc.demo.config.JwtTokenUtil;
import com.poc.demo.models.AuthenticationModel;
import com.poc.demo.service.JwtUserDetailsService;

@RestController
@CrossOrigin(origins="http://localhost:3000", maxAge=3600)
public class JwtAuthenticationController {

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private JwtUserDetailsService userDetailsService;
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ApiResultAuth createAuthenticationToken(@RequestBody AuthenticationModel authenticationRequestModel) throws Exception {

		userDetailsService.authenticate(authenticationRequestModel.getUsername(), authenticationRequestModel.getPassword());

		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(authenticationRequestModel.getUsername());

		final String token = jwtTokenUtil.generateToken(userDetails);
		
		UserDetailsModel userDetailsModel = new UserDetailsModel();
		userDetailsModel.setUsername(userDetails.getUsername());
		
		return ApiResultAuth.createResponse(userDetailsModel, "CUSTOM_SUCCESS_STATUS", "PoC Login", token);
	}
}