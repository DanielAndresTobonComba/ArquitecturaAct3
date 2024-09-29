package com.act3.act3.Infraestructure;

import org.springframework.data.jpa.repository.JpaRepository;

import com.act3.act3.Domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
