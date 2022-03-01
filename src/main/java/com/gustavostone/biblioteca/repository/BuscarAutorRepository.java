package com.gustavostone.biblioteca.repository;

import com.gustavostone.biblioteca.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuscarAutorRepository extends JpaRepository<Autor, Integer> {

}
