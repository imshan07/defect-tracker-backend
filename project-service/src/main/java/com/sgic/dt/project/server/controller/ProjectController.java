package com.sgic.dt.project.server.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.dt.project.dto.mapper.Mapper;
import com.sgic.dt.project.server.services.ProjectService;
import com.sgic.dt.project.server.util.ErrorCodes;

@RestController
public class ProjectController {
	//@Autowired
	//ProjectService projectService;
	
	@Autowired
	ErrorCodes errorMessages;

	@Autowired
	private Mapper mapper;
	
	private static final Logger logger = Logger.getLogger(ProjectController.class);	
	
	//@PostMapping(value = "/project")
	
	//@GetMapping(value = "/project")
	
	//@GetMapping(value = "/project{id}")
	
	//ECT...
	
	
	
	
	
}
