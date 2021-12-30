package controller;

import java.util.ArrayList;
import java.util.List;

import modele.Produit;
import modele.Utilisateur;
import modele.compte;

public class ProduitController {
	
	public static List<Produit> produits = new ArrayList<>();

	public static void allProduit() {
		String data = "";
		for (Produit produit : produits) {
			data += produit.infoProduit() + "\n";
		}
		MyLibrary.afficher(data);
	}
	
	public static void acheterUnProduit(Utilisateur user) {
		String p = MyLibrary.stringSaisie("Quel produit souhaitez-vous acheter ? ");
		for (Produit produit : produits) {
			if (p.equals(produit.getNom_produit())) {
				produit.setStock(produit.getStock()-1); // le stock de ce produit diminue de 1
				
				// le solde du compte de l'utilisateur est réduit d'un montant = prix du produit
				compte c = null;
				for (compte compte : CompteController.comptes) {
					if(compte.getTitulaire().equals(user)) {
						c = compte;
					}
				}
				if (c.getSolde()-produit.getPrix() < 0) {
					MyLibrary.afficher("pas assez d'argent sur votre compte");
				}
				else {
					c.setSolde(c.getSolde()-produit.getPrix());
				}
			}
		}
	}
	
}
