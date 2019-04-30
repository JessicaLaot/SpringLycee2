package com.example.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Eleve;

@Repository
@Qualifier("eleveDao")
public interface IEleveDao extends JpaRepository<Eleve, Long> {

}
