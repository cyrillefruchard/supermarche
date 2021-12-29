package modele;

public class Utilisateur {

	private String login;
	private String nom;
	private String prenom;
	
	public Utilisateur(String login, String nom, String prenom) {
		this.login = login;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Utilisateur() {
		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
	
}
