package com.example.portfiliocurso.services;

import com.example.portfiliocurso.model.Experience;
import com.example.portfiliocurso.model.Persona;
import com.example.portfiliocurso.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.annotation.WebServlet;
import java.util.List;

@Service
public class ExperinceService implements IExperienceService{

@Autowired
private ExperienceRepository experienceRepository;
    @Override
    public List<Experience> getExperiences() {
        List<Experience> experienceList = experienceRepository.findAll();
        return experienceList;
    }

    @Override
    public void savExeperience(Experience exp) {
        experienceRepository.save(exp);
    }

    @Override
    public void deletExperinece(Long id) {
        experienceRepository.deleteById(id);
    }

    @Override
    public Experience findExperience(Long id) {
        Experience exp = experienceRepository.findById(id).orElse(null);
        return exp;
    }
}
