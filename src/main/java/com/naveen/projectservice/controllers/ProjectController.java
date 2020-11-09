package com.naveen.projectservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.projectservice.models.Project;
import com.naveen.projectservice.services.ProjectService;



@RestController
public class ProjectController {

	 @Autowired
	 ProjectService projectService;
	 
	 @PostMapping("/projects")
	 public Project saveProject(@RequestBody Project project) {
		 
	  Project savedProject = projectService.createProject(project);
		return savedProject;
	 }
	 
	 @GetMapping("/projects")
	 public List<Project> getAllProjects() {
		 
		return  projectService.getProjects();
		
	 }
}
