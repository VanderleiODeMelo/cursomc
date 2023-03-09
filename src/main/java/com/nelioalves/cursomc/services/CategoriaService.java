package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositorys.CategoriaRepository;

@Service
public class CategoriaService {
	//vamos criar aqui uma operação capaz de buscar
	//uma categoria por código
	
	@Autowired //estou instânciando o repository vai ser automaticamente instânciada pelo Spring boot
	private CategoriaRepository repo;

	public Optional<Categoria> buscar(Integer id) {
		
		Optional<Categoria>  obj = repo.findById(id);//essa operação aqui vai no banco de dados e busca uma categoria
		
		return obj;
		
	}
	

}
