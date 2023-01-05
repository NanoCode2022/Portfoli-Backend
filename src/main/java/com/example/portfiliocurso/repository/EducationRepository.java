package com.example.portfiliocurso.repository;

import com.example.portfiliocurso.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository <Education,Long> {
}
