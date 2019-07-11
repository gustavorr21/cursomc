package com.gustavorodrigues.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gustavorodrigues.cursomc.domain.Categoria;
import com.gustavorodrigues.cursomc.domain.Produto;
import com.gustavorodrigues.cursomc.repositories.CategoriaRepository;
import com.gustavorodrigues.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{//permite implementar um metodo auxiliar para executar uma acao quando o programa inciar{

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}
	@Autowired
	private ProdutoRepository produtorepository;
	
	@Autowired
	private CategoriaRepository categoriarepository ;
	
@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	
	Categoria cat1 = new Categoria(null,"informatica");

	Categoria cat2 = new Categoria(null,"escritorio");
	
	Produto p1 = new Produto(null, "Computador", 2000.00);
	Produto p2 = new Produto(null, "Impressora", 800.00);
	Produto p3 = new Produto(null, "Mouse", 80.00);
	
	cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
	cat1.getProdutos().addAll(Arrays.asList(p2));
	
	p1.getCategorias().addAll(Arrays.asList(cat1));
	p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
	p3.getCategorias().addAll(Arrays.asList(cat1));
	
	categoriarepository.saveAll(Arrays.asList(cat1,cat2));
	produtorepository.saveAll(Arrays.asList(p1,p2,p3));
}
}