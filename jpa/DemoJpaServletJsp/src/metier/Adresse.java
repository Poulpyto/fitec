package metier;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
@NamedQueries ({@NamedQuery(name="Adresse.findAll", query = "SELECT s FROM Adresse s"),
		@NamedQuery(name="Adresse.matchWord", query = "SELECT s FROM Adresse s where s.numRue like :rue")})
public class Adresse {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int		id;
	private String	numRue;
	private String	ville;
	private String	codePostal;
	@Transient
	private String	commentaire;
	@OneToMany(mappedBy= "adresse", fetch=FetchType.LAZY)
	private Collection<Contact> contacts;
	
	
 	public Collection<Contact> getContact() {
		return contacts;
	}
	public void setContact(Collection<Contact> contacts) {
		this.contacts = contacts;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumRue() {
		return numRue;
	}
	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	@Override
	public String toString() {
		return "Adresse [id=" + id + ", numRue=" + numRue + ", ville=" + ville + ", codePostal=" + codePostal
				+ ", commentaire=" + commentaire + "]";
	}
	
	
	
}
