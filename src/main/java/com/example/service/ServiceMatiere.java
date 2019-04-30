package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.IMatiereDao;
import com.example.entities.Matiere;

@Service("serviceMatiere")
public class ServiceMatiere implements IService<Matiere>{
	@Autowired
	IMatiereDao matiereDao;

	@Override
	public Matiere findOneById(Long id) {
		
		return matiereDao.getOne(id);
	}

	@Override
	public Matiere save(Matiere t) {
		
		return matiereDao.save(t);
	}

	@Override
	public void delete(Matiere t) {
		matiereDao.delete(t);
		
	}

	@Override
	public List<Matiere> getAll() {
		
		return matiereDao.findAll();
	}

}
