package controller;

import javax.swing.JOptionPane;

public class MyLibrary {

	public static void afficher(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public static String stringSaisie(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	public static int intSaisie(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg)); 
	}
	
	public static double doubleSaisie(String msg) {
		return Double.parseDouble(JOptionPane.showInputDialog(msg)); 
	}
	
}
