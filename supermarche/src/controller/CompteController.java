package controller;

import java.util.ArrayList;
import java.util.List;

import modele.Utilisateur;
import modele.compte;

public class CompteController {
	
	public static List<compte> comptes = new ArrayList<>();
	

	public static void creerCompte() {
		String prenom = MyLibrary.stringSaisie("Entrez le prénom de l'utilisateur");
		String nom = MyLibrary.stringSaisie("Entrez le nom de l'utilisateur");
		String login = MyLibrary.stringSaisie("Entrez le login de l'utilisateur");
		String mdp = MyLibrary.stringSaisie("Entrez le mot de passe de l'utilisateur");
		boolean admin = false;
		boolean medecin = false;

		int newAdmin = -1;
		while (newAdmin != 0 && newAdmin != 1) {
			 newAdmin = MyLibrary.intSaisie("Est-ce un admin ? \n\n\n 0 - Non \n 1 - Oui");
		}
		if (newAdmin == 1) {
			 admin = true;
		}
		
		int newMedecin = -1;
		while (newMedecin != 0 && newMedecin != 1) {
			newMedecin = MyLibrary.intSaisie("Est-ce un medecin ? \n\n\n 0 - Non \n 1 - Oui");
		}
		if (newMedecin == 1) {
			 medecin = true;
		}
		
		Double solde = 50.00;
		MyLibrary.afficher("Le compte possède 50 € à sa création.");
		Boolean gold = false;
		MyLibrary.afficher("Le compte ne possède pas l'option gold par défault.");
		

		Utilisateur u = new Utilisateur(login, mdp, nom, prenom, admin, medecin);
		compte c = new compte(solde, u, gold);
		comptes.add(c);
	}
	
	public static void allCompte() {
		String data = "";
		for (compte compte : comptes) {
			data += compte.afficheCompte() + "\n";
		}
		MyLibrary.afficher(data);
	}

	public static void rechercheCompte(String login) {
		for (compte compte : comptes) {
			Utilisateur user = compte.getTitulaire();
			if (login.equals(user.getLogin())) {
				MyLibrary.afficher(
						"Login : " + user.getLogin() + 
						"\nNom : " + user.getNom() + 
						"\nPrénom : " + user.getPrenom() + 
						"\nSolde : " + compte.getSolde() + 
						"\nGold : " + compte.getGold() +
						"\n\n\nHistorique : \n" 
						// Historique
						);
			}
		}
	}
	
	
	public static void activateGold(Utilisateur user) {
		for (compte compte : comptes) {
			if (user == compte.getTitulaire()) {
				compte.setGold(true);
			}
		}
	}

	public static void desactivateGold(Utilisateur user) {
		for (compte compte : comptes) {
			if (user == compte.getTitulaire()) {
				compte.setGold(false);
			}
		}
	}
	
}
