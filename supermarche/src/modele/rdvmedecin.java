package modele;

public class rdvmedecin {

	private String medecin;
	private Utilisateur patient;
	private String date;
	private String heuredebut;
	private String heurefin;
	private double prix;
	
	
	
	public rdvmedecin() {
	}
	
	public rdvmedecin(String medecin, Utilisateur patient, String date, String heuredebut, String heurefin, double prix) {
		this.medecin = medecin;
		this.patient = patient;
		this.date = date;
		this.heuredebut = heuredebut;
		this.heurefin = heurefin;
		this.prix = prix;
	}
	
	public String getMedecin() {
		return medecin;
	}
	public void setMedecin(String medecin) {
		this.medecin = medecin;
	}
	public Utilisateur getPatient() {
		return patient;
	}
	public void setPatient(Utilisateur patient) {
		this.patient = patient;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHeuredebut() {
		return heuredebut;
	}
	public void setHeuredebut(String heuredebut) {
		this.heuredebut = heuredebut;
	}
	public String getHeurefin() {
		return heurefin;
	}
	public void setHeurefin(String heurefin) {
		this.heurefin = heurefin;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	
}
