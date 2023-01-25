package com.example.portfiliocurso.services;

import com.example.portfiliocurso.model.Experience;

import java.util.List;

public interface IExperienceService {

    public List<Experience> getExperiences();

    public  void savExeperience(Experience exp);

    public void deletExperinece(Long id);

    public Experience findExperience(Long id);
}
