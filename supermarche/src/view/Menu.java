package view;

import controller.MyLibrary;

public class Menu {

	private static String MSG_MENU_UTILISATEUR = "Menu Utilisateur";
	
	public static void CONNEXION() {
		boolean sortie = false;
		while (!sortie) {
			switch (MyLibrary.intSaisie("CONNEXION\n\n1-LOGIN\n2-MDP\n\n0-Quitter\n\n\n")) {
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
