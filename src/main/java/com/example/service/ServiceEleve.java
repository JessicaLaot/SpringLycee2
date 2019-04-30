package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.IEleveDao;
import com.example.entities.Eleve;

@Service("serviceEleve")
public class ServiceEleve implements IService<Eleve> {
	
	@Autowired
	private IEleveDao eleveDao;

	@Override
	public Eleve findOneById(Long id) {
		
		return eleveDao.getOne(id);
	}

	@Override
	public Eleve save(Eleve t) {
		
		return eleveDao.save(t);
	}

	@Override
	public void delete(Eleve t) {
		eleveDao.delete(t);
		
	}

	@Override
	public List<Eleve> getAll() {
		
		return eleveDao.findAll();
	}

}
