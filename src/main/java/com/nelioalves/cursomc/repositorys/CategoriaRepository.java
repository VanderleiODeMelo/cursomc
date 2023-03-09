package com.nelioalves.cursomc.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Categoria;

//um objeto desse vai ser capas de fazer acesso ao banco de dados na tabela Categoria
//esse é o objeto de camada de acesso a dados referênte ao objeto (Categoria)
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
	
	

}
