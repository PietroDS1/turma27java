package com.Farmacia.FarMais.Repository;

import java.util.List;

import com.Farmacia.FarMais.Model.Categora;

public interface RepositorioCategoria {

	public List<Categora> findAllByNomeContainingIgnoreCase(String nome);

	public List<Categora> findByIdContainingIgnoreCase(long id);

	public List<Categora> findAll();

	
	
	



	
}
