package view;

import controller.MyLibrary;

public class Menu {

	private static String MSG_MENU_UTILISATEUR = "Menu Utilisateur";
	
	public static void CONNECTION() {
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
	
}
