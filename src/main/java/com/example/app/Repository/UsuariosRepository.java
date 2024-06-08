package com.example.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.Usuarios;



public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {

}
