package org.spaceshipadventure.domain;

public class Spaceship {

    private Generateur generateur;
    private String nom;

    public Spaceship() {
        generateur = new Generateur();
    }

    public Spaceship(String newNom) {
        this();
        nom = nom;
    }

    public Generateur getGenerateur() {
        return generateur;
    }
    public void setGenerateur(Generateur generateur) {
        this.generateur = generateur;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }


    public void ignition() {
        generateur.setOn(true);
    }
}
