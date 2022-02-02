package com.baeldung.taskmanagementapp.persistence.repository;

import com.baeldung.taskmanagementapp.persistence.model.Project;

import java.util.Optional;

public interface ProjectRepository {
    Optional<Project> findById(Long id);
    Project save(Project project);
}
