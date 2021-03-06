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

import com.Farmacia.FarMais.Model.Categora;
import com.Farmacia.FarMais.Model.Produto;
import com.Farmacia.FarMais.Repository.RepositorioCategoria;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class ControllerCategoria {
	@Autowired
	private RepositorioCategoria repositorio;
	
	@GetMapping
	public ResponseEntity <List<Categora>> GetAll(){
		return ResponseEntity.ok(repositorio.findAll());
}
	@GetMapping("/{id}")
	public ResponseEntity <Categora> GetById(@PathVariable long id) {
		return (repositorio.findByIdContainingIgnoreCase(id)).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	@PostMapping
	public ResponseEntity <Categora> post(@RequestBody Categora categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity <Categora> put(@RequestBody Categora categoria){
		return ResponseEntity.status(HttpStatus.OK).body(repositorio.save(categoria));
	}
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		repositorio.deleteById(id);
	}
	
	
	
	
	
}
