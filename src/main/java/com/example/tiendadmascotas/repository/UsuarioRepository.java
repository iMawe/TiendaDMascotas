package com.example.tiendadmascotas.repository;

import com.example.tiendadmascotas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}