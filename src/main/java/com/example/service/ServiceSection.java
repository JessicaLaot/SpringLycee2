package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ISectionDao;
import com.example.entities.Section;

@Service("serviceSection")
public class ServiceSection implements IService<Section> {
	@Autowired
	ISectionDao sectionDao;

	@Override
	public Section findOneById(Long id) {
		
		return sectionDao.getOne(id);
	}

	@Override
	public Section save(Section t) {
		
		return sectionDao.save(t);
	}

	@Override
	public void delete(Section t) {
		sectionDao.delete(t);
		
	}

	@Override
	public List<Section> getAll() {
		
		return sectionDao.findAll();
	}

}
