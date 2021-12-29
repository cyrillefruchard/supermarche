package modele;

public class compte {
	private String num;
	private double solde;
	private Utilisateur titulaire;
	
	public compte(String num, double solde, Utilisateur titulaire) {
		
		this.num = num;
		this.solde = solde;
		this.titulaire = titulaire;
	}

	public compte() {
		
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
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
