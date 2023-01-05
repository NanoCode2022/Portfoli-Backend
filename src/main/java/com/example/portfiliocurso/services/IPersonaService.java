/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.portfiliocurso.services;

import com.example.portfiliocurso.model.Persona;
import java.util.List;

/**
 *
 * @author 2022
 */
public interface IPersonaService {
    
    public List<Persona> getPersona();
    
    public void savePersona(Persona perso);
    
    public Persona findPersona(Long id);
    
}
