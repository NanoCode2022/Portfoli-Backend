package com.example.portfiliocurso.repository;

import com.example.portfiliocurso.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

  Optional<Usuario> findOneByEmail(String email);
}
