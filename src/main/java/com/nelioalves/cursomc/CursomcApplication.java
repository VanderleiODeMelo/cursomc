package com.nelioalves.cursomc;

import java.util.ArrayList;
import java.util.Arrays;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.domain.Produto;
import com.nelioalves.cursomc.repositorys.CategoriaRepository;
import com.nelioalves.cursomc.repositorys.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);	
	}

	@Override
	public void run(String... args) throws Exception {
		//categoria
		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null,"Escritório");
		//produto
		Produto p1 = new Produto(null,"computador",2000.00);
		Produto p2 = new Produto(null,"impressora",800.00);
		Produto p3 = new Produto(null,"mouse",80.00);
		
		//associar os produtos com a categorias veja
		
	
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		//operação para salvar
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		//operação para salvar
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		
		
		
		
		
		
		
		
		
	}

}
