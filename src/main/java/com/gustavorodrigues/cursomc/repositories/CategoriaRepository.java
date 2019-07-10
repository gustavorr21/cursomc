package com.gustavorodrigues.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavorodrigues.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
