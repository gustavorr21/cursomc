package com.gustavorodrigues.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //para importar crtl + shift + o

@RequestMapping(value="/categorias")

public class CategoriaResource {
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "rest esta funcionando";
	}

}
