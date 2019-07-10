package com.gustavorodrigues.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gustavorodrigues.cursomc.domain.Categoria;
import com.gustavorodrigues.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{//permite implementar um metodo auxiliar para executar uma acao quando o programa inciar{

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Autowired
	private CategoriaRepository categoriarepository ;
	
@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	
	Categoria cat1 = new Categoria(null,"informatica");

	Categoria cat2 = new Categoria(null,"escritorio");
	
	categoriarepository.saveAll(Arrays.asList(cat1,cat2));
	
}
}