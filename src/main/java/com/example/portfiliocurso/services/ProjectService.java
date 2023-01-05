package com.example.portfiliocurso.services;

import com.example.portfiliocurso.model.Project;
import com.example.portfiliocurso.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectService implements IProjectService{

  @Autowired
  private ProjectRepository projectRepository;
  @Override
  public List<Project> getProjects() {
    List<Project> projectList = projectRepository.findAll();

    return projectList;
   }

  @Override
  public void saveProject(Project project) {
    projectRepository.save(project);
  }

  @Override
  public void deleteProject(Long id) {
    projectRepository.deleteById(id);
  }
}
