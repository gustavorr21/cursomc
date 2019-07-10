package com.gustavorodrigues.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import com.gustavorodrigues.cursomc.domain.Categoria;
import com.gustavorodrigues.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired //serve para instanciar o repositorio
	private CategoriaRepository repo;
	
	
		public Categoria find(Integer id) {
			Optional<Categoria> obj = repo.findById(id);
			return obj.orElse(null);
	}
	
}

