package com.sgic.login.server.services;

import com.sgic.login.server.entities.Login;

public interface LoginService {
public Login createEmployee(Login employee);
public boolean isEmailAlreadyExist(String email);
}
