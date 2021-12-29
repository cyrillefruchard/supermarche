package view;

import controller.MyLibrary;

public class Menu {

	private static String MSG_MENU_UTILISATEUR = "Menu Utilisateur";
	
	public static void menuUtilisateur() {
		boolean sortie = false;
		while (!sortie) {
			switch (MyLibrary.intSaisie(MSG_MENU_UTILISATEUR)) {
			case 1 :
				
				break;
			case 2 :
				//menuPerson();
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
