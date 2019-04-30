package com.example.service;

import java.util.List;



public interface IService<T>  {
	
	T findOneById(Long id);
	T save(T t);
	void delete(T t);
	List<T> getAll();
	

}
