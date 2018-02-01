package boutique.metier;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="beanVille")
@SessionScoped
public class Ville {
	
	private String nom, codePostal;
	
	public Ville() {
		setNom("Rennes");
		setCodePostal("35000");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}	
	
	public String valider() {
		if (getCodePostal().equalsIgnoreCase("44000")) {
			setNom("NANTES");
		}
		else
		{
			setNom("Code Postal Inconnu");		
		}
		return null;	
	}
}
