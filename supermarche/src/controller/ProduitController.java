package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import modele.Produit;
import modele.Utilisateur;
import modele.compte;

public class ProduitController {
	
	public static List<Produit> produits = new ArrayList<>();
	public static List<String> panier = new ArrayList<>();

	public static void allProduit() {
		String data = "";
		for (Produit produit : produits) {
			data += produit.infoProduit() + "\n";
		}
		MyLibrary.afficher(data);
	}
	
//	public static void acheterUnProduit(Utilisateur user) {
//		String p = MyLibrary.stringSaisie("Quel produit souhaitez-vous acheter ? ");
//		for (Produit produit : produits) {
//			if (p.equals(produit.getNom_produit())) {
//				if (produit.getStock() == 0) {
//					MyLibrary.afficher("produit non disponible");
//				}
//				else {
//					produit.setStock(produit.getStock()-1); // le stock de ce produit diminue de 1
//					
//					// le solde du compte de l'utilisateur est réduit d'un montant = prix du produit
//					compte c = null;
//					for (compte compte : CompteController.comptes) {
//						if(compte.getTitulaire().equals(user)) {
//							c = compte;
//						}
//					}
//					if (c.getSolde()-produit.getPrix() < 0) {
//						MyLibrary.afficher("pas assez d'argent sur votre compte");
//					}
//					else {
//						c.setSolde(c.getSolde()-produit.getPrix());
//					}
//				}
//			}
//		}
//	}
	
	public static void ajouterProduitPanier() {
		String p = MyLibrary.stringSaisie("Quel produit souhaitez-vous acheter ? ");
		int q = MyLibrary.intSaisie(" En quelle quantite ? ");
		for (Produit produit : produits) {
			if (p.equals(produit.getNom_produit())) {
				if (produit.getStock() == 0) {
					MyLibrary.afficher("produit non disponible");
				}
				else {
					for (int i = 0; i<q; i++) {
						panier.add(p);
					}
				}
			}
		}
		
	}
	
	public static void validerPanier(Utilisateur user) {
		for (String element : panier) {
			MyLibrary.afficher(element + " \n");
		}
		int valider = MyLibrary.intSaisie(" Entrer 1 pour valider la commande, 2 pour l'annuler, 0 pour revenir en arrière ");
		switch (valider) {
		case 1:
			for (String element : panier) {
				for (Produit produit : produits) {
					if (element.equals(produit.getNom_produit())) {
						
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
			
			panier = null;
			break;
		case 2:
			
			break;
		case 0:
	
	break;

		default:
			break;
		}
		
	}
	
	
//	public static void ajoutProduit() {
//		String produit = MyLibrary.stringSaisie("Entrer le nom du produit à ajouter ");
//		double prix = MyLibrary.doubleSaisie("Entrer le prix ");
//		int stock = MyLibrary.intSaisie("Entrer le stock");
//		
//	}
//	
//	public static void supprimerProduit() {
//		
//	}
//	
//	public static void modifierPrix() {
//		
//	}
//	
//	public static void modifierStock() {
//	
//	}
	
	
}
