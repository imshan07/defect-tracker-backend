package com.sgic.login.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.login.server.entities.Login;

public interface LoginRepository extends JpaRepository<Login, Long>{
	boolean existsByEmail(String email);
}
