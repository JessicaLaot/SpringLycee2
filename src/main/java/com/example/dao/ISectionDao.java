package com.example.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Section;
@Repository
@Qualifier("daoSection")
public interface ISectionDao extends JpaRepository<Section, Long>{

}
