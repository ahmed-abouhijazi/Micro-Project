package com.Model;

public class ArticleModel {
	String reference;
	String titre;
	String auteur;
	String photo;
	double prix;
	String type;
	int quantite;
	public ArticleModel(String reference, String titre, String auteur, String photo, double prix, String type,
			int quantite) {
		super();
		this.reference = reference;
		this.titre = titre;
		this.auteur = auteur;
		this.photo = photo;
		this.prix = prix;
		this.type = type;
		this.quantite = quantite;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public ArticleModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
