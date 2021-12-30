package controller;

import java.util.ArrayList;

import java.util.List;

public class CantineController {

	public static List<String> entrees = new ArrayList<>();
	public static List<String> plats = new ArrayList<>();
	public static List<String> desserts = new ArrayList<>();

	public static String afficher_entrees() {
		String a = "";
		for (String increment : entrees) {
			a += increment + "\n";
		}
		return a;
	}

	public static String afficher_plats() {
		String a = "";
		for (String increment : plats) {
			a += increment + "\n";
		}
		return a;
	}

	public static String afficher_desserts() {
		String a = "";
		for (String increment : desserts) {
			a += increment + "\n";
		}
		return a;
	}

	public static void modifEntrees() {
		while (true) {
			String liste = afficher_entrees();
			int a = MyLibrary.intSaisie(liste + "\n\n1-supprimer\n2-ajouter\n0-quitter");
			if (a == 1) {
				String b = MyLibrary.stringSaisie(liste + "\n\ninsérer nom de l'entrée à supprimer");
				int c = 0;
				for (String increment : entrees) {
					if (increment.equals(b)) {
						entrees.remove(entrees.indexOf(increment));
						c = 1;
						break;
					}

				}
				if (c == 0) {
					MyLibrary.afficher("rien n'a été enlevé");
				}
			} else if (a == 2) {
				String b = MyLibrary.stringSaisie(liste + "\n\ninsérer nom de l'entrée à ajouter");
				entrees.add(b);
			} else if (a == 0) {
				modifMenu();
			}
		}
	}

	public static void modifPlats() {
		while (true) {
			String liste = afficher_plats();
			int a = MyLibrary.intSaisie(liste + "\n\n1-supprimer\n2-ajouter\n0-quitter");
			if (a == 1) {
				String b = MyLibrary.stringSaisie(liste + "\n\ninsérer nom du plat à supprimer");
				int c = 0;
				for (String increment : plats) {
					if (increment.equals(b)) {
						plats.remove(plats.indexOf(increment));
						c = 1;
						break;
					}
				}
				if (c == 0) {
					MyLibrary.afficher("rien n'a été enlevé");
				}
			} else if (a == 2) {
				String b = MyLibrary.stringSaisie(liste + "\n\ninsérer nom du plat à ajouter");
				plats.add(b);
			} else if (a == 0) {
				modifMenu();
			}
		}
	}

	public static void modifDesserts() {
		while (true) {
			String liste = afficher_desserts();
			int a = MyLibrary.intSaisie(liste + "\n\n1-supprimer\n2-ajouter\n0-quitter");
			if (a == 1) {
				String b = MyLibrary.stringSaisie(liste + "\n\ninsérer nom du dessert à supprimer");
				int c = 0;
				for (String increment : desserts) {
					if (increment.equals(b)) {
						desserts.remove(desserts.indexOf(increment));
						c = 1;
						break;
					}
				}
				if (c == 0) {
					MyLibrary.afficher("rien n'a été enlevé");
				}
			} else if (a == 2) {
				String b = MyLibrary.stringSaisie(liste + "\n\ninsérer nom du dessert à ajouter");
				desserts.add(b);
			} else if (a == 0) {
				modifMenu();
			}
		}
	}

	public static void modifMenu() {

		while (true) {
			int a = MyLibrary.intSaisie("1-modifier entrées\n2-modifier plats\n3-modifier desserts\n0-quitter");

			if (a == 1) {
				modifEntrees();
			}

			else if (a == 2) {
				modifPlats();

			}

			else if (a == 3) {
				modifDesserts();

			}

			else if (a == 0) {
				System.exit(0);
			}

			else {
				MyLibrary.afficher("error");
			}
		}

	}

}
