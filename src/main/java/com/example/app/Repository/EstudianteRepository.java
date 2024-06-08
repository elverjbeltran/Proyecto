package com.example.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.Estudiante;



public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {

}
