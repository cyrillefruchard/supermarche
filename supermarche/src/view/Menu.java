package view;

import controller.CantineController;
import controller.CompteController;
import controller.MyLibrary;
import controller.ProduitController;
import controller.UtilisateurController;
import modele.Utilisateur;
import modele.compte;




public class Menu {
	
/*
------------------------------------------
			Menu Général
------------------------------------------
*/		
private static String MSG_identifiant = "Entrer identifiant";	
private static String MSG_mdp = "Entrer mot de passe";
	
	public static void Connexion() {
		boolean sortie = false;
		String login = "";
		String mdp = "";
		String MSG_CONNEXION;
		Utilisateur user;
		
		while (!sortie) {
			MSG_CONNEXION = "CONNEXION \n\nIdentifiant : " + login + "\nMot de passe : " + mdp + "\n\n\n 1 - Entrer identifiant \n 2 - Entrer mot de passe \n 3 - Valider \n\n\n 0 - Quitter";
			switch (MyLibrary.intSaisie(MSG_CONNEXION)) {
			case 1 :
				login = MyLibrary.stringSaisie(MSG_identifiant);
				break;
			case 2 :
				mdp = MyLibrary.stringSaisie(MSG_mdp);
				break;
			case 3:
				user = UtilisateurController.identificationCompte(login, mdp);
				
				if(user != null) {			
					
					if (user.isAdmin()) {
						MyLibrary.afficher("Bienvenue administrateur " + login);
						menuAdmin(user);
					}
					else {
						MyLibrary.afficher("Bienvenue utilisateur " + login);
						menuUtilisateur(user);
					}
					
					break;
				}
				else {
					MyLibrary.afficher("infos erronées ou incomplètes");
					break;
				}
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

	private static String MSG_MENU_UTILISATEUR = "Menu Utilisateur \n\n\n 1 - Solde \n 2 - Demande GOLD \n 3 - Dépots d'argent \n 4 - Acheter produit \n 5 - RDV cantine \n 6 - RDV Médecin \n\n\n 0 - Retour";
	
	public static void menuUtilisateur(Utilisateur user) {
		boolean sortie = false;
		while (!sortie) {
			switch (MyLibrary.intSaisie(MSG_MENU_UTILISATEUR)) {
			case 1 :
				UtilisateurController.getSoldeUtilisateur(user);
				break;
			case 2 :
				UtilisateurController.demandeGold();
				break;
			case 3 :
				UtilisateurController.depotArgent(user);
				break;
			case 4 :
				menuAchatProduits(user);
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
	
	private static String MSG_MENU_PERSON = "Menu Admin \n\n\n Bienvenue administrateur. \n\n\n 1 - Création d'une carte \n 2 - Détails d'une carte utilisateur \n 3 - Gestions des produits \n 4 - Menu de la cantine \n 5 - Désactivation d'une carte \n 6 - Activation d'une carte \n 7 - Ajouter une promotion sur un produit \n\n\n 0 - Retour";
	
	public static void menuAdmin (Utilisateur user) {
		boolean sortie = false;
		while (!sortie) {
			switch (MyLibrary.intSaisie(MSG_MENU_PERSON)) {
			case 1 :
				//Création d'une carte 
				break;
			case 2 :
				CompteController.rechercheCompte(MyLibrary.stringSaisie("Donner le login de l'utilisateur"));
				break;
			case 3 :
				//Gestions des produits
				break;
			case 4 :
				CantineController.modifMenu();
				break;
			case 5 :
				CompteController.desactivateGold(user);
				break;
			case 6 :
				CompteController.activateGold(user);
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
	
	/* 
	------------------------------------------
					Menu Achat Produits
	------------------------------------------
		*/
private static String MSG_MENU_ACHAT_PRODUITS = "Menu Achat Produits \n\n\n 1 - liste des produits \n 2 - acheter un produit \n\n\n 0 - Retour ";
	
	public static void menuAchatProduits(Utilisateur user) {
		boolean sortie = false;
		while (!sortie) {
			switch (MyLibrary.intSaisie(MSG_MENU_ACHAT_PRODUITS)) {
			case 1 :
				ProduitController.allProduit();
				break;
			case 2 :
				ProduitController.acheterUnProduit(user);
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
