package com.sgic.login.server.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.common.api.enums.RestApiResponseStatus;
import com.sgic.common.api.response.ApiResponse;
import com.sgic.common.api.response.BasicResponse;
import com.sgic.common.api.response.ValidationFailure;
import com.sgic.login.dto.mapper.Mapper;
import com.sgic.login.server.dto.LoginDto;
import com.sgic.login.server.entities.Login;
import com.sgic.login.server.services.LoginService;
import com.sgic.login.server.util.Constants;
import com.sgic.login.server.util.ErrorCodes;
import com.sgic.login.server.util.ValidationMessages;


@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	ErrorCodes errorMessages;

	@Autowired
	private Mapper mapper;
	
	  private static final Logger logger = Logger.getLogger(LoginController.class);


	@PostMapping(value = "/login")
	public ResponseEntity<Object> createEmployee(@RequestBody LoginDto loginData) {
		if (loginService.isEmailAlreadyExist(loginData.getEmail())) {
		      logger.debug("Email already exists: createEmployee(), email: {}");
		      return new ResponseEntity<>(new BasicResponse<>(
		          new ValidationFailure(Constants.EMAIL, errorMessages.getEmailAlreadyExist()),
		          RestApiResponseStatus.VALIDATION_FAILURE,ValidationMessages.EMAIL_EXIST), HttpStatus.BAD_REQUEST);
		}
		Login login = mapper.map(loginData, Login.class);
		loginService.createEmployee(login);
		return new ResponseEntity<>(new ApiResponse(RestApiResponseStatus.OK), HttpStatus.OK);
		
	}
}
