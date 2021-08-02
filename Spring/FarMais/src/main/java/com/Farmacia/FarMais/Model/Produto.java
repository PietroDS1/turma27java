package com.Farmacia.FarMais.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
@Table(name = "tb_produtos")
public class Produto {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotBlank
		@Size(min = 2, max = 30)
		private String nome;
		
		private boolean receita; 
		@NotBlank
		@Size(min = 2, max = 30)
		private double preco;
		@NotBlank
		@Size(min = 2, max = 30)
		private double titulo;
		@OneToMany
		private Produto produtos;
		
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


		public boolean isReceita() {
			return receita;
		}


		public void setReceita(boolean receita) {
			this.receita = receita;
		}


		public double getPreco() {
			return preco;
		}


		public void setPreco(double preco) {
			this.preco = preco;
		}


		public Produto getProdutos() {
			return produtos;
		}


		public void setProdutos(Produto produtos) {
			this.produtos = produtos;
		}


	
		
		
}
