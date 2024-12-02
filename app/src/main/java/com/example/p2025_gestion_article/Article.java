package com.example.p2025_gestion_article;

public class Article {
    private String nom;
    private String description;
    private double prix;
    private int qte;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Article(String nom, String description, double prix, int qte) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.qte = qte;
    }

    @Override
    public String toString() {
        return "Article{" +
                "nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                ", qte=" + qte +
                '}';
    }
}
