package com.naveen.projectservice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.naveen.projectservice.models.Project;

@Repository
public interface ProjectRepoPaging extends PagingAndSortingRepository<Project, Integer> {

}
