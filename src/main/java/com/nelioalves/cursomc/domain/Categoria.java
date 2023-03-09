package com.nelioalves.cursomc.domain;
import java.io.Serializable;
import java.util.Objects;
//o serializable os objetos podem ser convertidos para uma
//sequencia de bytes para que o objeto possa ser gravados em
//arquivos para trafegar em rede e assim por diante
//obs:Quando a classe implementa o serializable ela tem que ter um
//numero de versão padrão que seria o número (1) a minha classe é a versão 1L dela
public class Categoria implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	
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
