package com.naveen.projectservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naveen.projectservice.models.Project;



@Repository
public interface ProjectRepo extends JpaRepository<Project, Integer> {

}
