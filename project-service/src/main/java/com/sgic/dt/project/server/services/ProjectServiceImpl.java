package com.sgic.dt.project.server.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.sgic.dt.project.server.repositories.ProjectRepository;
import com.sgic.dt.project.server.services.ProjectService;

public class ProjectServiceImpl implements ProjectService{
	@Autowired
	private ProjectRepository projectRepository;
	

}
