package com.example.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Epreuve;

@Repository
@Qualifier("epreuveDao")
public interface IEpreuveDao extends JpaRepository<Epreuve, Long> {

}
