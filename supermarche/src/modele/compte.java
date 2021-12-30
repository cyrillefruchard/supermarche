package modele;

public class compte {
	private double solde;
	private Utilisateur titulaire;
	private boolean	gold;
	


	public compte(double solde, Utilisateur titulaire, boolean gold) {
		
		this.solde = solde;
		this.titulaire = titulaire;
		this.gold = gold;
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
	
	public boolean getGold() {
		return gold;
	}

	public void setGold(boolean gold) {
		this.gold = gold;
	}

	public String afficheCompte() {
		return "compte [solde=" + solde + ", titulaire=" + titulaire + ", gold=" + gold + "]";
	}	
	
	
}
