package controller;

import java.util.ArrayList;
import java.util.List;

import modele.Utilisateur;
import modele.compte;

public class UtilisateurController {
	
	public static List<compte> comptes = new ArrayList<>();
	
	public static void getSoldeUtilisateur(Utilisateur titulaire) {
		compte c = null;
		for (compte compte : comptes) {
			if (compte.getTitulaire().equals(titulaire)) {
				c = compte;
			}
		}
		MyLibrary.afficher(Double.toString(c.getSolde()));
	}
	
	public static void depotArgent(Utilisateur titulaire, double montant) {
		compte c = null;
		for (compte compte : comptes) {
			if (compte.getTitulaire().equals(titulaire)) {
				c = compte;
			}
		}
		double solde = c.getSolde() + montant;
		c.setSolde(solde);
	}
	
	
	
	
}
