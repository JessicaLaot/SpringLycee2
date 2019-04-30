package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.IEpreuveDao;
import com.example.entities.Epreuve;

@Service("serviceEpreuve")
public class ServiceEpreuve implements IService<Epreuve>  {

	@Autowired
	IEpreuveDao epreuveDao;

	@Override
	public Epreuve findOneById(Long id) {
		
		return epreuveDao.getOne(id);
	}

	@Override
	public Epreuve save(Epreuve t) {
		// TODO Auto-generated method stub
		return epreuveDao.save(t);
	}

	@Override
	public void delete(Epreuve t) {
		epreuveDao.delete(t);
		
	}

	@Override
	public List<Epreuve> getAll() {
		
		return epreuveDao.findAll();
	}
	
	
}
