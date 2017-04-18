package dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import dao.NotificationTypeDao.TypeDao;

@NotificationTypeDao(TypeDao.JDBC)
public class Dao implements Idao {

	@Override
	public String appelDao() {
		// TODO Auto-generated method stub
		return "Bonjour, je suis dans la dao JDBC";
	}

	@PostConstruct
	public void	logApresConstruction(){
		System.out.println("Apres création dao JDBC");
	}
	@PreDestroy
	public void	logAvantDestruction(){
		System.out.println("avant destruction dao JDBC");
	}
}
