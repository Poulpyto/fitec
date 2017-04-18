package service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import dao.Idao;

public class ServiceImpl implements Iservice {

	@Inject
	private Idao dao;
	@Override
	public String appelDao() {
		// TODO Auto-generated method stub
		return dao.appelDao();
	}
	@PostConstruct
	public void	logApresConstruction(){
		System.out.println("Apres création service");
	}
	@PreDestroy
	public void	logAvantDestruction(){
		System.out.println("avant destruction service");
	}
	
}
