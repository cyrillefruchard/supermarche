package view;

import controller.MyLibrary;
import modele.compte;

public class Menu {
	
private static String MSG_CONNEXION = "CONNEXION \n\n\n 1 - Entrer identifiant \n 2 - Entrer mot de passe \n\n\n 0 - Quitter";
	
	public static void Connexion() {
		boolean sortie = false;
		while (!sortie) {
			switch (MyLibrary.intSaisie(MSG_CONNEXION)) {
			case 1 :
				
				break;
			case 2 :
				
				break;
			case 0 :
				sortie = true;
				break;
			default:
				MyLibrary.afficher("erreur");
				break;
			}
		}
	}
	
	
	/* 
------------------------------------------
				Menu Utilisateur
------------------------------------------
	*/	

	private static String MSG_MENU_UTILISATEUR = "Menu Utilisateur \n\n\n 1 - Solde \n 2 - Demande GOLD \n 3 - Dépots d'argent \n 4 - Acheter produit \n 5 - RDV cantine \n 6 - RDV Médecin";
	
	public static void menuUtilisateur() {
		boolean sortie = false;
		while (!sortie) {
			switch (MyLibrary.intSaisie(MSG_MENU_UTILISATEUR)) {
			case 1 :
				
				break;
			case 2 :
				
				break;
			case 3 :
				
				break;
			case 4 :
	
				break;
			case 5 :
	
				break;
			case 6 :
	
				break;
			case 0 :
				sortie = true;
				break;
			default:
				MyLibrary.afficher("erreur");
				break;
			}
		}
	}
	
	/* 
------------------------------------------
				Menu Admin
------------------------------------------
	*/
	
	private static String MSG_MENU_PERSON = "Menu Admin \n\n\n Bienvenue administrateur. \n\n\n 1 - Création d'une carte \n 2 - Détails d'une carte utilisateur \n 3 - Gestions des produits \n 4 - Menu de la cantine \n 5 - Désactivation d'une carte \n 6 - Activation d'une carte \n 7 - Ajouter une promotion sur un produit \n\n\n 0 - Quitter";
	
	public static void Admin () {
		boolean sortie = false;
		while (!sortie) {
			switch (MyLibrary.intSaisie(MSG_MENU_PERSON)) {
			case 1 :
				//Création d'une carte 
				break;
			case 2 :
				//Détails d'une carte utilisateur
				break;
			case 3 :
				//Gestions des produits
				break;
			case 4 :
				//Menu de la cantine
				break;
			case 5 :
				//Désactivation d'une carte
				break;
			case 6 :
				//Activation d'une carte
				break;
			case 7 :
				//Ajouter une promotion sur un produit
				break;
			case 0 :
				sortie = true;
				break;
			default:
				MyLibrary.afficher("Erreur");
				break;
			}
		}
	}
	
	
	
	
}
