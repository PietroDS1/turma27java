package com.Farmacia.FarMais.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Farmacia.FarMais.Model.Produto;
import com.Farmacia.FarMais.Repository.RepositorioProduto;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ControllerProduto {
		
	@Autowired
	private RepositorioProduto repositorio;
	
	@GetMapping
	public ResponseEntity <List<Produto>> GetAll(){
		return ResponseEntity.ok(repositorio.findAll());
}
	@GetMapping("/{id}")
	public ResponseEntity<Produto> GetById(@PathVariable long id) {
		return (repositorio.findById(id)).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/name/{nameProduct}")
	public ResponseEntity<Produto> GetByIdContainingIgnoreCase(@PathVariable String nome) {
		return (repositorio.findAllByNomeContainingIgnoreCase(nome)).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/ID/{IdProduct}")
	public ResponseEntity<List<Produto>> GetByIDProdutoContainingIgnoreCase(@PathVariable long id) {
		return ResponseEntity.ok(repositorio.findByIDProdutoContainingIgnoreCase(id));
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Produto>> findByDescricaoTituloContainingIgnoreCase(@PathVariable String titulo) {
		return ResponseEntity.ok(repositorio.findByDescricaoTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping
	public ResponseEntity <Produto> post(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(produto));
	}
	
	@PutMapping
	public ResponseEntity <Produto> put(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.OK).body(repositorio.save(produto));
	}
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		repositorio.deleteById(id);
	}
	


}
		

