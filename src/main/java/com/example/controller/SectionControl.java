package com.example.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.entities.Section;

import com.example.service.ServiceSection;

@RestController
public class SectionControl {
	
	ServiceSection serviceSection;
	
	@GetMapping("api/getEleve/{id}")
	public Section findOneById(@PathVariable Long id) {
		
		return serviceSection.findOneById(id);
	}

	@PostMapping("api/saveEleve")
	public Section save(@RequestBody Section t) {
		
		return serviceSection.save(t);
	}

	@DeleteMapping("api/deleteEleve")
	public void delete(@RequestBody Section t) {
		serviceSection.delete(t);
		
	}

	@GetMapping("api/showEleve")
	public List<Section> getAll() {
		
		return serviceSection.getAll();
	}


}
