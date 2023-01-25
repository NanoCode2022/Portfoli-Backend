package com.example.portfiliocurso.model;

import com.example.portfiliocurso.services.IExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ExperienceController {

  @Autowired
  private IExperienceService interExperience;

  @GetMapping("/experiencia/traer")
  public List<Experience> getExperience(){
    return interExperience.getExperiences();
  }

  @PostMapping("/experiencia/crear")
  @ResponseStatus(HttpStatus.CREATED)
  public void createExperience(@RequestBody Experience exp){
    interExperience.savExeperience(exp);

  }

  @DeleteMapping("/experiencia/editar/{id}")
  public void editExperience(@PathVariable Long id){
    interExperience.deletExperinece(id);
  }

  @PutMapping ("/experiencia/editar/{id}")
  public Experience editExperiences(@PathVariable Long id,
                                    @RequestParam ("title") String nuevoTitle,
                             @RequestParam ("description") String nuevaDescription){

    Experience experience = interExperience.findExperience(id);

    experience.setTitle(nuevoTitle);
    experience.setDescription(nuevaDescription);



    interExperience.savExeperience(experience);

    return experience;
  }
}
