package com.Exercicio.MinhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Exercicio.MinhaLojaDeGames.model.Games;

@Repository
public interface GamesRepositorio extends JpaRepository<Games, Long> {

	//public List <Games> findAllByGamesContainggnoreCase(String categoria);
	
}
