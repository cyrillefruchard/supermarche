package controller;

import java.util.ArrayList;
import java.util.List;

import modele.Utilisateur;
import modele.compte;

public class UtilisateurController {

	public static List<Utilisateur> utilisateurs = new ArrayList<>();

	
	public static void getSoldeUtilisateur(Utilisateur titulaire) {
		compte c = null;
		for (compte compte : CompteController.comptes) {
			if (compte.getTitulaire().equals(titulaire)) {
				c = compte;
			}
		}
		MyLibrary.afficher(Double.toString(c.getSolde()));
	}
	
	public static void depotArgent(Utilisateur titulaire) {
		double montant = MyLibrary.doubleSaisie("saisir le montant du depot");
		compte c = null;
		for (compte compte : CompteController.comptes) {
			if (compte.getTitulaire().equals(titulaire)) {
				c = compte;
			}
		}
		double solde = c.getSolde() + montant;
		c.setSolde(solde);
	}
	
	public static void demandeGold() {
		MyLibrary.afficher("Votre demande d'adhesion GOLD à été envoyée à l'admin");
	}
	
	

	public static Utilisateur identificationCompte(String login, String mdp) {
		Utilisateur user = null;
		
		for (Utilisateur utilisateur : utilisateurs) {
			if (login.equals(utilisateur.getLogin()) && mdp.equals(utilisateur.getMotdepasse()) ) {
				user = utilisateur;
			}
		}
		
		return user;
	}
}
