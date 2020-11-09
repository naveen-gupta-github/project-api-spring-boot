package com.naveen.projectservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.projectservice.models.Project;
import com.naveen.projectservice.repository.ProjectRepo;



@Service
public class ProjectService {
	
	@Autowired
	ProjectRepo projectRepo;
	
	public Project createProject(Project project)
	{
		
		return projectRepo.save(project);
		
	}
	
	public List<Project> getProjects(){
		
		return projectRepo.findAll();
		
	}

}
