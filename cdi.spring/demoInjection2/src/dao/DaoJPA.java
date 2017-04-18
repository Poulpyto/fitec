package dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import dao.NotificationTypeDao.TypeDao;

@NotificationTypeDao(TypeDao.JPA)
public class DaoJPA implements Idao {

	@Override
	public String appelDao() {
		// TODO Auto-generated method stub
		return "Bonjour, je suis dans la dao JPA";
	}

	@PostConstruct
	public void	logApresConstruction(){
		System.out.println("Apres création dao JPA");
	}
	@PreDestroy
	public void	logAvantDestruction(){
		System.out.println("avant destruction dao JPA");
	
}
}
