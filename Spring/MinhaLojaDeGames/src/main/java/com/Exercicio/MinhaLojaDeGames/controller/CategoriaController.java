package com.Exercicio.MinhaLojaDeGames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Exercicio.MinhaLojaDeGames.model.Categoria;
import com.Exercicio.MinhaLojaDeGames.repository.CategoriaRepositorio;
//apague me
@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {
	@Autowired
	
	private  CategoriaRepositorio repositorio;
	@GetMapping
	public ResponseEntity<List<Categoria>> GetAll(){
	return ResponseEntity.ok(repositorio.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity <Categoria>GetById(@PathVariable long id){
		return repositorio.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricao/{descricao}")
	
	public ResponseEntity<List<Categoria>> GetByDescricao(@PathVariable String descricao){
		return ResponseEntity.ok(repositorio.findAllByDescricaoContainggnoreCase(descricao));
	}
	
}
