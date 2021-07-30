package com.Exercicio.MinhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Exercicio.MinhaLojaDeGames.model.Categoria;

@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {

	public List <Categoria> findAllByDescricaoContainggnoreCase(String tipo);
	
	
	
	
}
