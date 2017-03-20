/*package metier.test;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
//import org.junit.Ignore;
import org.junit.Test;

import metier.Compte;

public class CompteTest {

	private Compte c;
	
	@Before
	public void setCompteBefore(){
		this.c = new Compte(1, "comptetest", 100);
	}
	
	@Test
	public void testVerser() {
		//Compte c = new Compte(1, "comptetest", 100);
		System.out.println("test methode verser dans un compte :" + c.getSolde());
		float	resultat = c.verser(10);
		Assert.assertEquals(110, resultat, 0);
		System.out.println("test methode verser dans un compte + 10 :" + c.getSolde());
	}
	@Test
	public void testVerser2(){
		System.out.println("verser un negatif " + c.getSolde());
		Assert.assertEquals(c.getSolde(), c.verser(-10), 0);
		System.out.println("verser un negatif ne doit pas bouger " + c.getSolde());
	}

	@Test
	public void testRetirer() {
		System.out.println("test methode retirer dans un compte " + c.getSolde());
		Assert.assertEquals(c.getSolde()-10, c.retirer(10), 0);
		System.out.println("test methode retirer 10 " + c.getSolde());
	}
	
}*/
