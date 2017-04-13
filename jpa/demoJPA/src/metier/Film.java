package metier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;

@Entity
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)//heritage table unique
//@DiscriminatorColumn(name="TYPE_FILM")//table unique
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)//heritage table concrete
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Film {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@GeneratedValue(strategy=GenerationType.TABLE)
	private int		idFilm;
	private String	nomFilm;
	@ManyToMany(cascade=CascadeType.PERSIST)
	private Collection<Contact> contacts;
	
	public Collection<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(Collection<Contact> contacts) {
		this.contacts = contacts;
	}
	public int getIdFilm() {
		return idFilm;
	}
	public void setIdFilm(int idFilm) {
		this.idFilm = idFilm;
	}
	public String getNomFilm() {
		return nomFilm;
	}
	public void setNomFilm(String nomFilm) {
		this.nomFilm = nomFilm;
	}
	@Override
	public String toString() {
		return "Film [idFilm=" + idFilm + ", nomFilm=" + nomFilm + "]";
	}
	
	
}
