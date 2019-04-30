package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ILaboratoireDao;
import com.example.entities.Laboratoire;

@Service("serviceLabo")
public class ServiceLabo implements IService<Laboratoire>{
	
	@Autowired
	ILaboratoireDao laboDao;

	@Override
	public Laboratoire findOneById(Long id) {
		
		return laboDao.getOne(id);
	}

	@Override
	public Laboratoire save(Laboratoire t) {
		
		return laboDao.save(t);
	}

	@Override
	public void delete(Laboratoire t) {
		laboDao.delete(t);
		
	}

	@Override
	public List<Laboratoire> getAll() {
		
		return laboDao.findAll();
	}

}
