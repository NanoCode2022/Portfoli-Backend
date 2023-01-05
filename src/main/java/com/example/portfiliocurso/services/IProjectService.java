package com.example.portfiliocurso.services;

import com.example.portfiliocurso.model.Project;

import java.util.List;

public interface IProjectService {

  public List<Project> getProjects();

  public void saveProject(Project project);

  public void deleteProject(Long id);
}
