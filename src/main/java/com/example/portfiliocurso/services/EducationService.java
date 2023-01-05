package com.example.portfiliocurso.services;

import com.example.portfiliocurso.model.Education;
import com.example.portfiliocurso.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService implements IEducationService{
    @Autowired
    private EducationRepository educationRepository;


    @Override
    public List<Education> getEducations() {
        List<Education> educationList = educationRepository.findAll();

        return educationList;
    }

    @Override
    public void saveEducation(Education education) {
        educationRepository.save(education);
    }

    @Override
    public void deletEducation(Long id) {
       educationRepository.deleteById(id);
    }
}
