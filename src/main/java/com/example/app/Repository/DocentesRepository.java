package com.example.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.Docente;



public interface DocentesRepository extends JpaRepository<Docente, Integer> {

}
