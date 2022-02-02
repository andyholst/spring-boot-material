package com.baeldung.taskmanagementapp.persistence.repository;

import com.baeldung.taskmanagementapp.persistence.model.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProjectRepositoryImpl implements ProjectRepository {
    private List<Project> projects = new ArrayList<>();

    @Override
    public Optional<Project> findById(Long id) {
        return projects.stream().filter(project -> id.equals(project.getId())).findFirst();
    }

    @Override
    public Project save(Project project) {
        Optional<Project> existingProject = findById(project.getId());

        existingProject.ifPresent(value -> projects.remove(value));

        Project newProject = new Project(project);
        projects.add(newProject);

        return project;
    }
}
