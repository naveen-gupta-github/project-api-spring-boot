package com.naveen.projectservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.projectservice.models.Project;
import com.naveen.projectservice.services.ProjectService;



@RestController
public class ProjectController {

	 @Autowired
	 ProjectService projectService;
	 
	 @PostMapping("/projects")
	 @PreAuthorize("hasAuthority('create_profile')")
	 public Project saveProject(@RequestBody Project project) {
		 
	  Project savedProject = projectService.createProject(project);
		return savedProject;
	 }
	 
	 @GetMapping("/projects")
	 @PreAuthorize("hasRole('ROLE_operator')")
	 public List<Project> getAllProjects() {
		 
		return  projectService.getProjects();
		
	 }
	 
	 @GetMapping("/projectsOf")
	 public List<Project> getProjectsFromAParticularPage(@RequestParam int pageNo, @RequestParam int size){
		   
		 return projectService.getProjectsOfAPage(pageNo, size);
		 
	 }
	 
	 @GetMapping("/projectsInOrder")
	 public List<Project> sortProjects(@RequestParam String by, @RequestParam String type){
		   
		 return projectService.sortByAnOrderAndType(by, type);
		 
	 }
}












