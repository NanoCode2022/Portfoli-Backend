package com.example.portfiliocurso.model;

import com.example.portfiliocurso.services.ISkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class SkillController {

  @Autowired
  private ISkillService interSkill;

  @GetMapping("/skill/traer")
  public List<Skill> getSkill(){
    return interSkill.getSkills();
  }

  @PostMapping("/skill/crear")
  public void createSkill(@RequestBody Skill skill){
    interSkill.saveSkill(skill);

  }

  @DeleteMapping("/skill/editar/{id}")
  public void editSkill(@PathVariable Long id){
    interSkill.deleteSkill(id);
  }
}
