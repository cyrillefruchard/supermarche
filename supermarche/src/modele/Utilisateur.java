package modele;

public class Utilisateur {

	private String login;
	private String motdepasse;
	private String nom;
	private String prenom;
	private boolean admin;

	public Utilisateur(String login, String motdepasse, String nom, String prenom, boolean admin) {

		this.login = login;
		this.motdepasse = motdepasse;
		this.nom = nom;
		this.prenom = prenom;
		this.admin = admin;
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

	public String getMotdepasse() {
		return motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	
	
	
}
