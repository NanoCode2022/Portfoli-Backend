package com.example.portfiliocurso.services;

import com.example.portfiliocurso.model.Skill;

import java.util.List;

public interface ISkillService {

  public List<Skill> getSkills();

  public void saveSkill(Skill skill);

  public void deleteSkill(Long id);
}
