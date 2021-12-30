package modele;

public class Produit {

	private String nom_produit;
	private double prix;
	private int quantite;
	
	public Produit(String nom_produit, double prix, int quantite) {
		
		this.nom_produit = nom_produit;
		this.prix = prix;
		this.quantite = quantite;
	}

	public Produit() {
		
	}

	public String getNom_produit() {
		return nom_produit;
	}

	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
	
}
