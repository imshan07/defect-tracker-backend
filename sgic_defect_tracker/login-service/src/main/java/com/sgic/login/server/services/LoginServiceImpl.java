package com.sgic.login.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sgic.login.server.entities.Login;
import com.sgic.login.server.repositories.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginRepository loginRepository;
	
    @Transactional(readOnly = false)
	public Login createEmployee(Login login) {
		Login responseEmployee = loginRepository.save(login);
		return responseEmployee;
	}

    @Transactional(readOnly = true)
	public boolean isEmailAlreadyExist(String email) {
		return loginRepository.existsByEmail(email);
	}
	
	

}
