package view;

import controller.MyLibrary;
import modele.compte;

public class Menu {

	private static String MSG_MENU_UTILISATEUR = "Menu Utilisateur \n\n\n 1 - Solde \n 2 - Demande GOLD \n 3 - Dépots d'argent \n 4 - Acheter produit \n 5 - RDV cantine \n 6 - RDV Médecin";
	
	public static void menuUtilisateur() {
		boolean sortie = false;
		while (!sortie) {
			switch (MyLibrary.intSaisie(MSG_MENU_UTILISATEUR)) {
			case 1 :
				MyLibrary.afficher(compte.infoCompte());
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
	
}
