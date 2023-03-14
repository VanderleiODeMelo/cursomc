package com.nelioalves.cursomc.domain;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
//o serializable os objetos podem ser convertidos para uma
//sequencia de bytes para que o objeto possa ser gravados em
//arquivos para trafegar em rede e assim por diante
//obs:Quando a classe implementa o serializable ela tem que ter um
//numero de versão padrão que seria o número (1) a minha classe é a versão 1L dela

@Entity
public class Categoria implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	@ManyToMany(mappedBy = "categorias")
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Categoria() {
		super();
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}


}
