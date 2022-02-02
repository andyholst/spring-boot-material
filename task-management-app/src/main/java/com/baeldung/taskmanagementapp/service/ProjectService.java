package com.baeldung.taskmanagementapp.service;

import com.baeldung.taskmanagementapp.persistence.model.Project;

import java.util.Optional;

public interface ProjectService {
    Optional<Project> findById(Long id);
    Project save(Project project);
}
