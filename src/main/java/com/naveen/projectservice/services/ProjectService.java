package com.naveen.projectservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.naveen.projectservice.models.Project;
import com.naveen.projectservice.repository.ProjectRepo;
import com.naveen.projectservice.repository.ProjectRepoPaging;



@Service
public class ProjectService {
	
	@Autowired
	ProjectRepo projectRepo;
	@Autowired
	ProjectRepoPaging projectRepoPaging;
	public Project createProject(Project project)
	{
		
		return projectRepo.save(project);
		
	}
	
	public List<Project> getProjects(){
		
		return projectRepo.findAll();
		
	}
	
	public List<Project> getProjectsOfAPage(int pageNumber, int pageSize){
		
		Pageable paging = PageRequest.of(pageNumber, pageSize);
		 
        Page<Project> pagedResult = projectRepoPaging.findAll(paging);
		
		return pagedResult.getContent();
		
	}

}
