package com.example.portfiliocurso.repository;

import com.example.portfiliocurso.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository <Project,Long> {
}
