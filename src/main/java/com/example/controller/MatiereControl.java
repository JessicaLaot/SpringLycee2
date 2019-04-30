package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Laboratoire;
import com.example.entities.Matiere;
import com.example.service.ServiceLabo;
import com.example.service.ServiceMatiere;

@RestController
public class MatiereControl {
	
	ServiceMatiere serviceMatiere;
	
	@GetMapping("api/getMatiere/{id}")
	public Matiere findOneById(@PathVariable Long id) {
		
		return serviceMatiere.findOneById(id);
	}

	@PostMapping("api/saveMatiere")
	public Matiere save(@RequestBody Matiere t) {
		
		return serviceMatiere.save(t);
	}

	@DeleteMapping("api/deleteMatiere")
	public void delete(@RequestBody Matiere t) {
		serviceMatiere.delete(t);
		
	}

	@GetMapping("api/showMatiere")
	public List<Matiere> getAll() {
		
		return serviceMatiere.getAll();
	}



}
