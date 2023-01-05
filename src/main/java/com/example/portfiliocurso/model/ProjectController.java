package com.example.portfiliocurso.model;

import com.example.portfiliocurso.services.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProjectController {

  @Autowired
  private IProjectService interProject;

  @GetMapping("/proyecto/traer")
  public List<Project> getProject(){
    return interProject.getProjects();
  }

  @PostMapping("/proyecto/crear")
  public void createProject(@RequestBody Project project){
    interProject.saveProject(project);

  }

  @DeleteMapping("/proyecto/editar/{id}")
  public void editProject(@PathVariable Long id){
    interProject.deleteProject(id);
  }
}
