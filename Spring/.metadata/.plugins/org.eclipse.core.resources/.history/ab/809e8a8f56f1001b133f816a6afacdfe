package com.Exercicio.MinhaLojaDeGames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_Categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Size(min = 5, max = 100)
	@NotBlank
	private String tipo;
	@Size(min = 5, max = 100)
	@NotBlank
	private String descricao;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.REMOVE)/*cascade = CascadeType.REMOVE
	 															    *apaga todos os dados da coluna
     																*/
	@JsonIgnoreProperties("categoria") //evitando recursividade
	private List<Categoria> produtos;
	
	public List<Categoria> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Categoria> produtos) {
		this.produtos = produtos;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
