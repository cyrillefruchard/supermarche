package view;

import controller.CantineController;
import controller.CompteController;
import controller.UtilisateurController;
import controller.ProduitController;
import modele.Produit;
import modele.Utilisateur;
import modele.compte;

public class Programme {
	
	static {
		Utilisateur u1 = new Utilisateur("user1", "user1", "nomUser1", "prenomUser1",false);
		Utilisateur u2 = new Utilisateur("user2", "user2", "nomUser2", "prenomUser2",false);
		Utilisateur u3 = new Utilisateur("user3", "user3", "nomUser3", "prenomUser3",false);
		Utilisateur u4 = new Utilisateur("admin", "admin", "nomAdmin", "prenomAdmin",true);

		UtilisateurController.utilisateurs.add(u1);
		UtilisateurController.utilisateurs.add(u2);
		UtilisateurController.utilisateurs.add(u3);
		UtilisateurController.utilisateurs.add(u4);

		compte c1 = new compte(50, u1, false);
		compte c2 = new compte(50, u2, true);
		compte c3 = new compte(50, u3, true);
		compte c4 = new compte(50, u4, true);

		CompteController.comptes.add(c1);
		CompteController.comptes.add(c2);
		CompteController.comptes.add(c3);
		CompteController.comptes.add(c4);
		
		Produit p1 = new Produit("chocolat", 10, 50);
		Produit p2 = new Produit("croissant", 1, 20);
		Produit p3 = new Produit("bonbon", 0.5, 2);
		Produit p4 = new Produit("cafe", 0.5, 15);
		
		ProduitController.produits.add(p1);
		ProduitController.produits.add(p2);
		ProduitController.produits.add(p3);
		ProduitController.produits.add(p4);
		
	}
	
	static {
		CantineController.entrees.add("Carottes rapées");
		CantineController.entrees.add("Macédoine");
		CantineController.entrees.add("Mini-quiche lorraine");
		
		CantineController.plats.add("Tartiflette");
		CantineController.plats.add("Steak frites");
		CantineController.plats.add("Riz dinde");
		CantineController.plats.add("Pâtes carbonara");
		CantineController.plats.add("Tarte poireaux");

		CantineController.desserts.add("Tarte aux pommes");
		CantineController.desserts.add("Fondant au chocolat");
		CantineController.desserts.add("Salade de fruits");
	}
	
	public static void main(String[] args) {
		Menu.Connexion();
	}
	
}
