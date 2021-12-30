package controller;

import java.util.ArrayList;
import java.util.List;

import modele.Utilisateur;
import modele.compte;


public class CompteController {
	
	public static List<compte> comptes = new ArrayList<>();
	

	public static void creerCompte() {
		String prenom = MyLibrary.stringSaisie("Entrez le pr�nom de l'utilisateur");
		String nom = MyLibrary.stringSaisie("Entrez le nom de l'utilisateur");
		String login = MyLibrary.stringSaisie("Entrez le login de l'utilisateur");
		String mdp = MyLibrary.stringSaisie("Entrez le mot de passe de l'utilisateur");
		boolean admin = false;
		
		int newAdmin = -1;
		while (newAdmin != 0 && newAdmin != 1) {
			 newAdmin = MyLibrary.intSaisie("Est-ce un admin ? \n\n\n 0 - Non \n 1 - Oui");
		}
		if (newAdmin == 1) {
			 admin = true;
		}
		
		Double solde = 50.00;
		MyLibrary.afficher("Le compte poss�de 50 � � sa cr�ation.");
		Boolean gold = false;
		MyLibrary.afficher("Le compte ne poss�de pas l'option gold par d�fault.");
		

		Utilisateur u = new Utilisateur(login, mdp, nom, prenom, admin);
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
	
	
}
