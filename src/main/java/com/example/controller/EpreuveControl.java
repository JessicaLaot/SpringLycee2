package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Eleve;
import com.example.entities.Epreuve;

import com.example.service.ServiceEpreuve;

@RestController
public class EpreuveControl {
	
	ServiceEpreuve serviceEpreuve;
	
	@GetMapping("api/getEpreuve/{id}")
	public Epreuve findOneById(@PathVariable Long id) {
		
		return serviceEpreuve.findOneById(id);
	}

	@PostMapping("api/saveEpreuve")
	public Epreuve save(@RequestBody Epreuve t) {
		
		return serviceEpreuve.save(t);
	}

	@DeleteMapping("api/deleteEpreuve")
	public void delete(@RequestBody Epreuve t) {
		serviceEpreuve.delete(t);
		
	}

	@GetMapping("api/showEpreuve")
	public List<Epreuve> getAll() {
		
		return serviceEpreuve.getAll();
	}


}
