package view;

import controller.MyLibrary;
import modele.compte;




public class Menu {
	
/*
------------------------------------------
			Menu Général
------------------------------------------
*/		
private static String MSG_identifiant = "Entrer identifiant";	
private static String MSG_login = "Entrer login";
	
	public static void Connexion() {
		boolean sortie = false;
		String a="";
		String b="";
		String MSG_CONNEXION;
		while (!sortie) {
			MSG_CONNEXION= "CONNEXION \n\na: "+a+"\nb: "+b+"\n\n\n 1 - Entrer identifiant \n 2 - Entrer mot de passe \n 3 - Valider \n\n\n 0 - Quitter";
			switch (MyLibrary.intSaisie(MSG_CONNEXION)) {
			case 1 :
				a=MyLibrary.stringSaisie(MSG_identifiant);
				break;
			case 2 :
				b=MyLibrary.stringSaisie(MSG_login);
				break;
			case 3:
				if(a.equals("")|b.equals("")) {
					MyLibrary.afficher("infos incomplètes");
					break;
				}
				else {
					
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
	
	/* 
	------------------------------------------
					Menu Achat Produits
	------------------------------------------
		*/
private static String MSG_MENU_ACHAT_PRODUITS = "Menu Achat Produits \n\n\n 1 - Nom Produit \n 2 - Quantite Produit \n 3 - Panier \n 4 - Enregistrer ";
	
	public static void menuAchatProduits() {
		boolean sortie = false;
		while (!sortie) {
			switch (MyLibrary.intSaisie(MSG_MENU_ACHAT_PRODUITS)) {
			case 1 :
				
				break;
			case 2 :
				
				break;
			case 3 :
				
				break;
			case 4 :
	
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
