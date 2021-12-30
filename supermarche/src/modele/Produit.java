package modele;

public class Produit {

	private String nom_produit;
	private double prix;
	private int stock;
	
	public Produit(String nom_produit, double prix, int stock) {
		
		this.nom_produit = nom_produit;
		this.prix = prix;
		this.stock = stock;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String infoProduit() {
		return "Produit [nom_produit= " + nom_produit + ", prix= " + prix + ", stock= " + stock + "]";
	}
	
	
	
}
