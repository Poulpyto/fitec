package dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dao implements Idao {

	@Override
	public String appelDao() {
		// TODO Auto-generated method stub
		return "Bonjour, je suis dans la dao";
	}

	@PostConstruct
	public void	logApresConstruction(){
		System.out.println("Apres création dao");
	}
	@PreDestroy
	public void	logAvantDestruction(){
		System.out.println("avant destruction dao");
	}
}
