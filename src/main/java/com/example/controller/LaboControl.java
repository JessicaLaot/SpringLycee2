package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Epreuve;
import com.example.entities.Laboratoire;
import com.example.service.ServiceEpreuve;
import com.example.service.ServiceLabo;

@RestController
public class LaboControl {
	
	ServiceLabo serviceLaboratoire;
	
	@GetMapping("api/getLaboratoire/{id}")
	public Laboratoire findOneById(@PathVariable Long id) {
		
		return serviceLaboratoire.findOneById(id);
	}

	@PostMapping("api/saveLaboratoire")
	public Laboratoire save(@RequestBody Laboratoire t) {
		
		return serviceLaboratoire.save(t);
	}

	@DeleteMapping("api/deleteLaboratoire")
	public void delete(@RequestBody Laboratoire t) {
		serviceLaboratoire.delete(t);
		
	}

	@GetMapping("api/showLaboratoire")
	public List<Laboratoire> getAll() {
		
		return serviceLaboratoire.getAll();
	}



}
