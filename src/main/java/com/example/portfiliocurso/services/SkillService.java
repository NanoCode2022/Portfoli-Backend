package com.example.portfiliocurso.services;

import com.example.portfiliocurso.model.Skill;
import com.example.portfiliocurso.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService implements ISkillService{

  @Autowired
  private SkillRepository skillRepository;

  @Override
  public List<Skill> getSkills() {
    List<Skill> skillList = skillRepository.findAll();

    return  skillList;
  }

  @Override
  public void saveSkill(Skill skill) {
    skillRepository.save(skill);
  }

  @Override
  public void deleteSkill(Long id) {
    skillRepository.deleteById(id);
  }
}
