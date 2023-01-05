package com.example.portfiliocurso.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idusuario")
  private Integer id;

  private String email;
  private String password;
}
