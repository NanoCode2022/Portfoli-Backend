package com.example.portfiliocurso.model;

import com.example.portfiliocurso.services.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EducationController {

  @Autowired
  private IEducationService interEducation;

  @GetMapping("/educacion/traer")
  public List<Education> getEducation(){
    return interEducation.getEducations();
  }

  @PostMapping("/educacion/crear")
  public void createEducation(@RequestBody Education education){
    interEducation.saveEducation(education);

  }

  @DeleteMapping ("/educacion/editar/{id}")
  public void editEducation(@PathVariable Long id){
    interEducation.deletEducation(id);
  }
}
