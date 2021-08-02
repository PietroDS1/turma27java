package com.Farmacia.FarMais.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Farmacia.FarMais.Model.Produto;

@Repository
public interface RepositorioProduto extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByNomeContainingIgnoreCase(String Nome);
	
	public List<Produto> findAllByIdContainingIgnoreCase(long id);

	public List<Produto> findByIDProdutoContainingIgnoreCase(long id);
	
	public List<Produto> findByDescricaoTituloContainingIgnoreCase (String titulo);
	
}
