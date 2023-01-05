/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.portfiliocurso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author 2022
 */
@Getter @Setter
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String title;
    private String description;
    private String picture;
    private String linkWeb;
    private String linkGithub;
     @ManyToOne 
    @JoinColumn (name = "persona_id")
    private Persona persona_id;
}
