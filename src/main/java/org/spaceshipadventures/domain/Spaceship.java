package org.spaceshipadventures.domain;

public class Spaceship {

    private String nom;
    private Generateur generateur;
    private long carburant;

    public Spaceship() {
        generateur = new Generateur();
        carburant = 100;
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

    public long getCarburant() {
        return carburant;
    }
    public void setCarburant(long carburant) {
        this.carburant = carburant;
    }

    public void ignition() {
        if(carburant > 0) generateur.setOn(true);
    }

    public void extinction() {
        generateur.setOn(false);
    }
}
