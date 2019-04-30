package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dao.IEleveDao;
import com.example.dao.IEpreuveDao;
import com.example.dao.ILaboratoireDao;
import com.example.dao.IMatiereDao;
import com.example.dao.ISectionDao;
import com.example.entities.Eleve;
import com.example.service.ServiceEleve;
import com.example.service.ServiceEpreuve;
import com.example.service.ServiceLabo;
import com.example.service.ServiceMatiere;
import com.example.service.ServiceSection;


@SpringBootApplication
public class SpringLyceeApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SpringLyceeApplication.class, args);
		IEleveDao eleveDao = ctx.getBean(com.example.dao.IEleveDao.class);
		IEpreuveDao epreuveDao = ctx.getBean(com.example.dao.IEpreuveDao.class);
		ILaboratoireDao laboDao = ctx.getBean(com.example.dao.ILaboratoireDao.class);
		IMatiereDao daoMatiere = ctx.getBean(com.example.dao.IMatiereDao.class);
		ISectionDao daoSection = ctx.getBean(com.example.dao.ISectionDao.class);
		
		
		Eleve e1 = new Eleve("eleve1", "eleve1", null, null, null);
		eleveDao.save(e1);
		
		
		
		
	}

}
