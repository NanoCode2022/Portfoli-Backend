package com.example.portfiliocurso.repository;

import com.example.portfiliocurso.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository <Skill,Long> {
}
