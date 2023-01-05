/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.portfiliocurso.model;

import com.example.portfiliocurso.services.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author 2022
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    
    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping ("/persona/traer")
    public List<Persona> getPersona(){
       return interPersona.getPersona();
    }
    
    @PostMapping ("/persona/crear")
    public String createPersona(@RequestBody Persona perso){
        interPersona.savePersona(perso);
        
        return "creado Correctamente";
        
    }
    
    @PutMapping ("/persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                                @RequestParam ("description") String nuevaDescription){
        
        Persona perso = interPersona.findPersona(id);
        
        perso.setDescription(nuevaDescription);
        
        interPersona.savePersona(perso);
        
        return perso;
    }
}
