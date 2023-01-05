/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.portfiliocurso.repository;

import com.example.portfiliocurso.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author 2022
 */
public interface PersonaRepository extends JpaRepository <Persona,Long>{
    
}
