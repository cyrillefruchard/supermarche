package modele;

public class compte {
	private double solde;
	private Utilisateur titulaire;
	
	

	public compte(double solde, Utilisateur titulaire) {
		
		this.solde = solde;
		this.titulaire = titulaire;
	}


	public compte() {
		
	}


	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Utilisateur getTitulaire() {
		return titulaire;
	}

	public void setTitulaire(Utilisateur titulaire) {
		this.titulaire = titulaire;
	}
	
	
	
	
	
}
