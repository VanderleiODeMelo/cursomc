package com.nelioalves.cursomc.resource;
import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias") 
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value= "/{id}",method=RequestMethod.GET) //? significa qualquer coisa
	public  ResponseEntity<?> find (@PathVariable Integer id) {//coloco essa (anotação) para que /{id} vai vir para id da variável
		
		Optional<Categoria> obj = service.buscar(id);
		return  ResponseEntity.ok().body(obj)  ;
	}
	
	
	
	

}
