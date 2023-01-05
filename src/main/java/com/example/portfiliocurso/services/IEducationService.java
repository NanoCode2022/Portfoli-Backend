package com.example.portfiliocurso.services;

import com.example.portfiliocurso.model.Education;

import java.util.List;

public interface IEducationService {

    public List<Education> getEducations();

    public void saveEducation(Education education);

    public void deletEducation(Long id);
}
