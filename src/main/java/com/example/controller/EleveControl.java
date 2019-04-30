package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Eleve;
import com.example.service.ServiceEleve;

@RestController
public class EleveControl {

	
	ServiceEleve serviceEleve;
	
	@GetMapping("api/getEleve/{id}")
	public Eleve findOneById(@PathVariable Long id) {
		
		return serviceEleve.findOneById(id);
	}

	@PostMapping("api/saveEleve")
	public Eleve save(@RequestBody Eleve t) {
		
		return serviceEleve.save(t);
	}

	@DeleteMapping("api/deleteEleve")
	public void delete(@RequestBody Eleve t) {
		serviceEleve.delete(t);
		
	}

	@GetMapping("api/showEleve")
	public List<Eleve> getAll() {
		
		return serviceEleve.getAll();
	}

	
}
