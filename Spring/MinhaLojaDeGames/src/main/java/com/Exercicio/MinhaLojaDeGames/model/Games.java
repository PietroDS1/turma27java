package com.Exercicio.MinhaLojaDeGames.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_Games")
public class Games {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Size(min = 2, max = 30)
	@NotBlank
	private String nome;
	@Size(min = 2, max = 30)
	@NotBlank
	@ManyToOne
	@JsonIgnoreProperties("produtos") //evitando recursividade
	private Categoria categoria;
	
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	@Size(min = 2, max = 30)
	@NotBlank
	private String idade;
	@Min(1)//valor minimo
	
	private double preco;
	private boolean estoque;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean isEstoque() {
		return estoque;
	}
	public void setEstoque(boolean estoque) {
		this.estoque = estoque;
	}
	
	
	
	
}
